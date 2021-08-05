public class Magazin {
    String nume;
    Produs produs1;
    Produs produs2;
    Produs produs3;

    static class Produs {
        String nume;
        double pret;
        int cantiate;

        Produs(String nume, double pret, int cantiate){
            this.cantiate=cantiate;
            this.nume=nume;
            this.pret=pret;
        }

        @Override
        public String toString() {
            return "Produs{" +
                    "nume='" + nume + '\'' +
                    ", pret=" + pret +
                    ", cantiate=" + cantiate +
                    '}';
        }

        double getTotalProdus(){
            return this.cantiate*this.pret;
        }
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "nume='" + nume + '\'' +
                ", produs1=" + produs1 +
                ", produs2=" + produs2 +
                ", produs3=" + produs3 +
                '}';
    }

    double getTotalMagazin(){
        return (this.produs1.getTotalProdus() + this.produs2.getTotalProdus() + this.produs3.getTotalProdus());
    }

    Magazin(String nume, Produs produs1, Produs produs2, Produs produs3){
        this.produs1=produs1;
        this.produs2=produs2;
        this.produs3=produs3;
        this.nume=nume;
    }

    public static void main(String[] arg) {
        Produs mere = new Produs("mere",2,1000);
        Produs pere = new Produs("pere",2,1000);
        Produs carne = new Produs("carne",2,1000);
        Magazin m1 =new Magazin("abc",mere,pere,carne);

        System.out.println(mere.toString());
        System.out.println(mere.getTotalProdus());
        System.out.println(m1.toString());
        System.out.println(m1.getTotalMagazin());
    }

}
