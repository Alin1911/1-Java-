
import java.util.*;



/**
 * Created by mihai
 */

public class ListUtil {
    public static <A, B> A foldl(Function<A, Function<B, A>> function, A acc, List<B> xs) {
        if (function == null || xs == null)
            return null;
        for (B element:xs)
            acc = function.execute(acc).execute(element);
        return  acc;
    }

    public static <A> void reverse(List<A> xs) {

        if (xs == null)
            return ;
        List <A> asta = new ArrayList<>();
        ListIterator<A> iter =  xs.listIterator(xs.size());

        while (iter.hasPrevious())
            asta.add(iter.previous());
        xs.removeAll(xs);
        xs.addAll(asta);
        //Hint: Folositi iteratori
    }

    public static <A, B> A foldr(Function<A, Function<B, A>> function, A acc, List<B> xs) {
        //Hint: reverse + foldl
        reverse(xs);
        return foldl(function,acc,xs);
    }

    public static <A, B> List<B> map(Function<A, B> function, List<A> xs) {
        List<B> map = new ArrayList<>();
        for(int i = 0; i< xs.size();i++){
            map.add(i,function.execute(xs.get(i)));
        }
        return map;
    }

    public static <A> List<A> filter(Function<A, Boolean> function, List<A> xs) {
        if (function == null)
            return null;
        List<A> lsita = new ArrayList<A>();
        for (A x : xs) {
            if (function.execute(x))
                lsita.add(x);
        }
        return lsita;
    }

    public static <A> A reduce(Function<A, Function<A, A>> function, List<A> xs) {
        List<A> asta = new ArrayList<>(xs);
        asta.remove(0);
        A rez = xs.get(0);
        for (A a : asta) rez = function.execute(rez).execute(a);
        return rez;
    }

    public static <A> boolean all(Function<A, Boolean> function, List<A> xs) {
        for (A x : xs)
            if (function.execute(x) == null)
                return false;
        return true;
    }

    public static <A> boolean any(Function<A, Boolean> function, List<A> xs) {
        for (A x : xs)
            if (function.execute(x))
                return true;
        return false;
    }

    public static <A extends Number> A sum(List<A> xs, Addition<A> operation) {
        if (operation ==null || xs == null)
            return null;
        A rez = operation.zero();
        for (A x : xs) rez = operation.add(rez, x);
        return rez;
    }
}
