import java.util.Collections;
import java.util.Vector;

public class Array {
    //Vectorul in care se vor retine elementele
    private Vector vector;

    //Constructor clasei
    public Array() {
        //Instantierea vectorului cu elemente
        vector = new Vector();
    }

    //Metoda care adauga un element in vector, folosind pozitia curenta
    public void addElement(Integer x) {
        vector.add(x);
    }

    //Metoda care adauga un element in vector, tinand cont de pozitia indicata
    public void addElement(Integer x, int poz) {
        if(poz >= 0 && poz <= vector.size()) {
            vector.add(poz, x);
        }
    }

    //Metoda care returneaza elementul aflat in vector la pozitia indicata
    public int get(int poz) {
        int result;
        if(poz >= 0 && poz < vector.size()) {
            result = (int) vector.get(poz);
            return result;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    //Metoda ce intoarce numarul de elemente din vector
    public int getSize() {
        return vector.size();
    }

    //Metoda pentru stergerea unui element din vector
    public boolean remove(Integer x) {
        return vector.remove(x);
    }

    //Metoda pentru stergerea elementului de pe pozitia pos din vector
    public Integer remove(int pos) {
        return (Integer) vector.remove(pos);
    }

    //Metoda uzitata pentru afisarea unui obiect de tip Array
    public String toString() {
        String result = "{";
        for(int i = 0; i < vector.size(); i++) {
            result += get(i) + ", ";
        }
        result += "}";
        return result;
    }

    public void sort() {
        Collections.sort(vector);
    }
}

class SortedArray extends Array {

    @Override
    public void addElement(Integer x) {
        super.addElement(x);
        super.sort();
    }

    @Override
    public void addElement(Integer x, int poz) {
        super.addElement(x, poz);
        super.sort();
    }
    public static void main(String[] arg){
        SortedArray vector= new SortedArray();
        for (int i=30; i>10; i--){
            vector.addElement(i);
        }
        System.out.println(vector.toString());
    }
}

class MyStack {
    public Array stack;

    MyStack(){
        stack = new Array();
    }

    int pop(){
        return this.stack.remove(0);
    }

    void push(Integer x){
        this.stack.addElement(x,0);
    }

    public static void main(String[] args) {
        MyStack abc = new MyStack();
        for (int i=10; i>3;i--){
            abc.push(i);
        }
        System.out.println(abc.stack.toString());
        System.out.println(abc.pop());
        System.out.println(abc.stack.toString());
    }

}