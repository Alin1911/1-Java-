import java.util.Objects;

public class Constraint {
    Integer limita_superioara;
    Integer limita_inferioara;

    //constructor
    public Constraint(Integer limita_superioara, Integer limita_inferioara) {
        this.limita_superioara = limita_superioara;
        this.limita_inferioara = limita_inferioara;
    }

    @Override
    public String toString() {
        return "Constraint{" +
                "limita_superioara=" + limita_superioara +
                ", limita_inferioara=" + limita_inferioara +
                '}';
    }
}
