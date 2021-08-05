import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

abstract class Hero{
    String nume;
      void execute(){
          System.out.println("hero");
      }

    public Hero() {
        this.nume="";
    }

    public Hero(String nume) {
        this.nume=nume;

    }

    @Override
    public String toString() {
        return "Hero{" +
                "nume='" + nume + '\'' +
                '}';
    }
}

class Warrior extends Hero{

    public Warrior() {
        super();
    }

    public Warrior(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
class Ninja extends Hero{
    @Override
    void execute() {
        System.out.println("ninja");

    }

    public Ninja() {
        super();
    }
    public Ninja(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Rogue extends Hero{
    @Override
    void execute() {
        System.out.println("rouge");
    }

    public Rogue() {
        super();
    }
    public Rogue(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
class StormFire extends BadLuck{
    public StormFire() {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    void execute(Hero h) {
        System.out.println("Hero");
    }

    @Override
    void execute(Warrior w) {
        System.out.println("Warrior");
    }

    @Override
    void execute(Ninja n) {
        System.out.println("Ninja");
    }

    @Override
    void execute(Rogue r) {
        System.out.println("Rogue");
    }
}

class Binding{
    public static void main(String args[]) {
        Hero h1 = new Warrior(), h2 = new Ninja();
        Rogue h3 = new Rogue();
        Hero h4 = new Ninja();
        BadLuck bl = new StormFire();
        bl.execute(h1);
        bl.execute(h2);
        bl.execute(h3);
        bl.execute(h4);

        h1.execute();
        h2.execute();
        h3.execute();
        h4.execute();
    }
}

abstract class BadLuck {
    abstract void execute(Hero h);
    abstract void execute(Warrior w);
    abstract void execute(Ninja n);
    abstract void execute(Rogue r);
}



public class ex1 {
}
