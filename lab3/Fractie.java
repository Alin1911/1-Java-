import java.util.Objects;

public class Fractie {

    int numarator;
    int numitor;

    Fractie(int numarator, int numitor){
        this.numarator = numarator;
        this.numitor = numitor;
    }

    Fractie(){
        this(2,3);
    }

    Fractie suma(Fractie f1){
        Fractie f3 = new Fractie();
        int a,b,c;
        if (this.numitor != f1.numitor) {
            a=(this.numitor*f1.numitor)/cmmmc(this.numitor,f1.numitor);
            b=a/this.numitor;
            c=a/f1.numitor;
            f3.numitor=a;
            f3.numarator=f1.numarator*c+this.numarator*b;
        }
        else{
            f3.numitor=this.numitor;
            f3.numarator=f1.numarator+this.numarator;
        }
        return f3;
    }

    int cmmmc(int a, int b){
        while(a != b){
            if (a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }

    void toString1(){
        System.out.println(this.numarator +"/"+ this.numitor);
    }

    boolean egal(Fractie f1){
        if(this.numitor == f1.numitor && this.numarator ==f1.numarator)
            return true;
        else
            return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fractie fractie = (Fractie) o;
        return numarator == fractie.numarator &&
                numitor == fractie.numitor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numarator, numitor);
    }

    public static void main(String[] arg){
        Fractie f1 = new Fractie(1,3);
        Fractie f2 = new Fractie(5,8);
        Fractie f3 = new Fractie();
        f3 = f2.suma(f1);
        f3.toString1();
        System.out.println(f2.egal(f1));
    }
}
