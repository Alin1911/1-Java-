import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Punct{
    int x;
    int y;

    Punct(int x, int y){
        this.x=x;
        this.y=y;
    }

    Punct(){
        this(0,0);
    }

    int getX(){
        return  this.x;
    }

    void setX(int x){
        this.x=x;
    }

    int getY(){
        return  this.y;
    }

    void setY(int y){
        this.y=y;
    }

    @Override
    public String toString() {
        return "Punct{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    double distance(int x, int y){
        return sqrt(pow((x-this.x),2) + pow((y-this.y),2));
    }
    double distance(Punct p1){
        return sqrt(pow((p1.x-this.x),2) + pow((p1.y-this.y),2));
    }

    static class Test{
        public static void main(String[] arg){
            Punct a= new Punct(3,3);
            Punct b= new Punct(2,2);
            System.out.println(a.distance(b));

        }

    }
    public static void main(String[] arg){
        Punct a= new Punct(3,3);
        Punct b= new Punct(2,2);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(a.distance(b));

    }

}
