import java.util.ArrayList;

public class Catalog {
    public static Catalog single = null;
    ArrayList<Course> abcd;

    private  Catalog(){
        abcd = new ArrayList<>();
    }
    public  static Catalog getInstance() {
        if (single == null)
            single = new Catalog();

        return single;
    }

    public static void main(String[] args) {
        Catalog x = Catalog.getInstance();
        Catalog y = Catalog.getInstance();
        Catalog z = Catalog.getInstance();
//        x.abcd.add(0,new Course("as1"));
//        y.abcd.add(0,new Course("as2"));
//        z.abcd.add(0,new Course("as3"));

    /*    System.out.println(x.abcd.get(0).nume.toString());
        System.out.println(y.abcd.get(0).nume.toString());
        System.out.println(z.abcd.get(0).nume.toString());
*/
    }


}