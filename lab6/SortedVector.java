import java.util.*;

public class SortedVector extends Vector{
    Comparator c;
    public SortedVector(Comparator c){
        this.c=c;
    }
    public boolean add(Object o){
        super.add(o);
        Collections.sort(this,c);
        return true;
    }
}
class Pair {
    Object a,b;
    public Pair(Object a,Object b){
        this.a=a;
        this.b=b;
    }
    public boolean equals(Object o){
        if (o==null) return false;
        if(!(o instanceof Pair)) return false;
        Pair p=(Pair)o;
        return p.a.equals(a)&&p.b.equals(b);
    }
    public String toString(){
        return ""+a+" "+b;
    }
}
class Comp1 implements Comparator{
    public int compare(Object o1, Object o2){
        Pair p1=(Pair)o1;
        Pair p2=(Pair)o2;
        return ((Comparable)(p1.a)).compareTo(p2.a);
    }
}
class Comp2 implements Comparator{
    public int compare(Object o1, Object o2){
        Pair p1=(Pair)o1;
        Pair p2=(Pair)o2;
        return ((Comparable)(p1.b)).compareTo(p2.b);
    }
}
class Test {
    public static void main(String[] args) {
        SortedVector v1=new SortedVector(new Comp1());
        SortedVector v2=new SortedVector(new Comp2());
        v1.add(new Pair("x",3));
        v1.add(new Pair("a",1));
        v2.add(new Pair("a",111));
        v2.add(new Pair("x",42));
        v2.add(new Pair("b",14));
        v2.add(new Pair("c",43));
        System.out.println(v1);
        System.out.println(v2);
    }
}
