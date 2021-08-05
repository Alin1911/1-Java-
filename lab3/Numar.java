public class Numar {
    int num;

    Numar(int nr) {
        this.num = nr;
    }
    public int suma(int a){
        return a + this.num;
    }
    public int suma(int a, int b){
        return a + b;
    }
    public int suma(int a, int b, int c){
        return a + suma(b,c);
    }
    public  int suma(int a, int b, int c, int d){
        return a + suma(b,c,d);
    }
    public static void main(String[] arg) {
        int a=1, b=1, c=1, d=1;
        Numar z =new Numar(a);
        System.out.println(z.suma(a));
        System.out.println(z.suma(a,b));
        System.out.println(z.suma(a,b,c));
        System.out.println(z.suma(a,b,c,d));

    }
}