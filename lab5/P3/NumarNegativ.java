package P3;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class NumarNegativ  {
    public void myRead(Vector vec) throws Exceptie{
        Scanner scan = new Scanner(System.in);
        int element=3;
        while(element > 0){
            element = scan.nextInt();
            vec.add(element);
        };
        if(element < 0)
            throw new Exceptie();
    }

    public static void main(String args[]) {
        NumarNegativ negativ = new NumarNegativ();
        Vector vector = new Vector();
        try {
            negativ.myRead(vector);
        }
        catch (Exceptie e) {
        }
        System.out.println("Element maxim:" + Collections.max(vector));
    }

}

class Exceptie extends Exception {
    public Exceptie() {
        super("Numarul introdus este negativ!");
    }
}