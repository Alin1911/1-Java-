import java.util.ArrayList;

public class User extends Consumer {

    ArrayList<String> company;

    //constrctor
    public User(ArrayList<Consumer> cunoscut, Resume resume, ArrayList<String> company) {
        super(cunoscut, resume);
        this.company = company;
    }

    //metoda care intoarce numele unui utilizator
    public String getName() {
        return this.resume.information.getNume();
    }

    //metoda ce transforma un utilizator in angajat
    public Employee convert() {
        return new Employee(this.cunoscut, this.resume, null, 2222);
    }

    //calcularea mediei studiilor
    public double media() {
        double media = 0;

        for (int i = 0; i < this.resume.getEducatia().size(); i++) {
            media = media + this.resume.getEducatia().get(i).media;
        }
        media = media / this.resume.getEducatia().size();

        return media;
    }

    // scorul total al unui utilizator
    public Double getTotalScore() {
        return this.experienta() * 1.5 + this.media();
    }

    @Override
    public String toString() {
        return "User{" +
                "company=" + company +
                ", cunoscut=" + cunoscut +
                ", resume=" + resume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;

        User user = (User) o;

        return company != null ? company.equals(user.company) : user.company == null;
    }

}
