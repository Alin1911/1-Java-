import java.util.ArrayList;

public class Recruiter extends Employee {
    Double succesRate;

    //constructorul
    public Recruiter(ArrayList<Consumer> cunoscut, Resume resume, String companie, Integer salary, Double succesRate) {
        super(cunoscut, resume, companie, salary);
        this.succesRate = succesRate;
        //adaug recrutierul in departamentul de IT
        Company compania = Application.getCompany(companie);
        for (int i = 0; i < compania.companyDepartments.size(); i++)
            if (IT.class.getSimpleName().equals(compania.companyDepartments.get(i).getClass().getSimpleName()))
                Application.getCompany(companie).add(this, compania.companyDepartments.get(i));
    }

    //metoda care evalueaza un utilizator oentru un job
    public int evaluate(Job job, User user) {
        //calculez scorul
        double scor;
        scor = this.succesRate * user.getTotalScore();
        //cresc ratia de scucces
        this.succesRate = this.succesRate + 0.1;
        //aplic la companie
        Company compania = Application.getCompany(job.companie);
        Request<Job, Consumer> cerere = new Request<>(job, user, this, scor);
        compania.companyManager.cereri.add(cerere);
        return 1;
    }

    @Override
    public String toString() {
        return "Recruiter{" +
                "succesRate=" + succesRate +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", cunoscut=" + cunoscut +
                ", resume=" + resume +
                '}';
    }

}
