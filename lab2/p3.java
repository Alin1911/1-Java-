import java.io.*;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;


public class p3 {
    static int sterge(Vector v,int x){
        int nr=0;
        for (int i = 0; i < 20; i++) {
            if(v.get(i).equals(x))
                nr++;
        }
        v.remove(x);
        return nr;
    }
    static int maxim(Vector v){
        int nr=0,i;
        int max=(int)Collections.max(v);
        for (i = 0; i < 20; i++) {
            if(v.get(i).equals(max))
                break;
        }
        return max;
    }
    static int minim(Vector v){
        int nr=0,i=0;
        int min=(int)Collections.min(v);
        for (i = 0; i < 20; i++) {
            if(v.get(i).equals(min))
                break;
        }
        return i;
    }

    static int media(Vector v){
        int nr=0,i=0;
        for (i = 0; i < 20; i++) {
            nr = nr + (int)v.get(i);
        }
        nr=nr/20;
        return nr;
    }

    public static void main(String[] arg)
    {
        Random generator = new Random();
        Vector<Integer> v = new Vector();
        for (int i = 0; i < 20; i++) {
            v.add(generator.nextInt(10));
        }
        int x=1;
        System.out.println(v);
        System.out.println("pozitia elementului minim=" +minim(v));
        System.out.println("maxim=" +maxim(v));
        System.out.println("media=" +media(v));
        System.out.println("am sters elementul 1 de "+sterge(v,x));
    }

}
