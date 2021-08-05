import java.util.ArrayList;

public class Job {
    String nume;
    String companie;
    Boolean flag;
    Constraint absolvire, experienta, medie;
    ArrayList<Consumer> candidati;
    Integer locuri, salariu;

    //constructor
    public Job(String nume, String companie, Boolean flag, Constraint absolvire, Constraint experienta, Constraint
            medie, ArrayList<Consumer> candidati, Integer locuri, Integer salariu) {
        this.nume = nume;
        this.companie = companie;
        this.flag = flag;
        this.absolvire = absolvire;
        this.experienta = experienta;
        this.medie = medie;
        this.candidati = candidati;
        this.locuri = locuri;
        this.salariu = salariu;

    }

    //metoda prin care se poate aplica la acest job
    public void apply(User user) {
        //iau recrutierul portrivit cu metoda getRecrutier
        //apoi evaluez utilizatorul
        if (this.flag)
            Application.getCompany(this.companie).getRecruiter(user).evaluate(this, user);
    }

    //verificarea conditiilor minime pentru acest job
    public boolean meetsRequirments(User user) {
        int an = user.getGraduationYear();
        double ex = user.experienta();
        double med = user.media();
        return this.absolvire.limita_inferioara <= an && an <= this.absolvire.limita_superioara &&
                this.experienta.limita_inferioara <= ex && this.experienta.limita_superioara >= ex &&
                this.medie.limita_inferioara <= med && this.medie.limita_superioara >= med;
    }

    @Override
    public String toString() {
        return "Job{" +
                "nume='" + nume + '\'' +
                ", companie='" + companie + '\'' +
                ", flag=" + flag +
                ", absolvire=" + absolvire +
                ", experienta=" + experienta +
                ", medie=" + medie +
                ", candidati=" + candidati +
                ", locuri=" + locuri +
                ", salariu=" + salariu +
                '}';
    }
}
