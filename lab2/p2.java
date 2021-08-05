
import java.util.StringTokenizer;

public class p2 {

    static int numar(String Sir,String Sir1) {
        StringTokenizer st = new StringTokenizer(Sir,",. ?");
        int i=0,nr=0;
        while (st.hasMoreTokens()){
            if(st.nextToken().equals(Sir1))
                nr++;
        }
        return nr;
    }
    public static void main(String args[]) {
        String s1 ="Marius, de ce nu l-ai ajutat pe George? Era de datoria ta sa vezi ce poti face.";
        String s2 ="ce";
        System.out.println(numar(s1,s2));

    }
}
