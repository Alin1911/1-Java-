class Patrulater {
    public int latura1, latura2, latura3, latura4;
    public double unghi1, unghi2, unghi3, unghi4;

    public Patrulater() {
        this(0, 0, 0, 0);
    }

    public Patrulater(int latura1, int latura2, int latura3, int latura4) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
        this.latura4 = latura4;
    }

    public Patrulater(double unghi1, double unghi2, double unghi3, double unghi4) {
        this(0, 0, 0, 0, unghi1, unghi2, unghi3, unghi4);
    }

    public Patrulater(int latura1, int latura2, int latura3, int latura4,
                      double unghi1, double unghi2, double unghi3, double unghi4) {
        this(latura1, latura2, latura3, latura4);
        this.unghi1 = unghi1;
        this.unghi2 = unghi2;
        this.unghi3 = unghi3;
        this.unghi4 = unghi4;
    }

    public int perimetru() {
        int result;
        result = latura1 + latura2 + latura3 + latura4;
        return result;
    }

    public static void main(String[] arg){
        Patrulater pat = new Patrulater(3,3,3,3,90,90,90,90);
        System.out.println(pat.perimetru());
    }
}

class Paralelogram extends Patrulater{
    Paralelogram(int l1,int l2, double u1, double u2){
        super(l1,l2,l1,l2,u1,u2,u1,u2);
    }

    public double Ariepar(){

        return latura1*latura2*(Math.sin(unghi1));
    }

    public static void main(String[] arg){
        Paralelogram par = new Paralelogram(4,3,Math.PI/6,Math.PI*5/6);
        System.out.println("Aria e = " +par.Ariepar());
    }

}

class Romb extends Paralelogram{
    double diagonala1;
    double diagonala2;
    Romb(int l1, double u1, double u2, int d1, int d2) {
        super(l1, l1, u1, u2);
        this.diagonala1=d1;
        this.diagonala2=d2;
    }
    double D1(){
        return 2*latura1*Math.sin(unghi1/2);
    }
    double D2(){
        return 2*latura1*Math.sin(unghi2/2);
    }

    public double Arierom(){
/*        double d1 = this.D1();
        double d2 = this.D2();*/
        return diagonala1*diagonala2/2;
    }

    public static void main(String[] arg) {
        Romb rom = new Romb(3, Math.PI / 2, Math.PI /2,3,3);
        System.out.println(rom.Arierom());
    }

}

class Dreptunghi extends Paralelogram{
    Dreptunghi(int l1, int l2) {
        super(l1, l2,Math.PI/2,Math.PI/2);
    }
    public double Ariedr(){
        return latura1*latura2;
    }

    public static void main(String[] arg){
        Dreptunghi dre =new Dreptunghi(3,4);
        System.out.println(dre.Ariedr());
    }

}

class Patrat extends Dreptunghi{
    Patrat(int l1) {
        super(l1, l1);
    }

    public static void main(String[] arg){
        Patrat pat = new Patrat(3);
        System.out.println(pat.Ariedr());
    }

}

