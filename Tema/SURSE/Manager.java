import java.util.ArrayList;


public class Manager extends Employee {

    ArrayList<Request> cereri;

    //constructor
    public Manager(ArrayList<Consumer> cunoscut, Resume resume, String companie, Integer salary, ArrayList<Request> cereri) {
        super(cunoscut, resume, companie, salary);
        this.cereri = cereri;
    }

    //metoda prin care un user este angajat
    public void process(Job job) {
        Request max;
        int z;
        // o lista noua cu cererile epntru acel job
        ArrayList<Request> newReques = new ArrayList<>();
        for (Request request : this.cereri) {
            if (job.equals(request.getKey())) {
                newReques.add(request);
            }
        }
        //pentru fiecare loc disponibil execut:
        while (job.locuri != 0) {
            //caut cel mai bun candidat
            max = newReques.get(0);
            //pacrurg cererile
            for (Request request : newReques) {
                //verific cererile care indeplinesc cerinetle minime si compar scorul pe care il are
                //cu precedentul
                if (job.meetsRequirments(((User) max.getValue1())) && max.getScore() < request.getScore())
                    max = request;
            }
            //verific daca utilizatorul sa angajat
            if (Application.userDetect(((User) max.getValue1()).resume.information.getNume()) != null) {
                //creez noul angajat
                Employee a = ((User) max.getValue1()).convert();
                a.companyName = this.companyName;
                a.salary = job.salariu;
                //adaug utilizatorul in departament
                Company compania = Application.getCompany(this.companyName);
                for (z = 0; z < compania.companyDepartments.size(); z++)
                    if (compania.companyDepartments.get(z).jobs.contains(job)) {
                        break;
                    }
                compania.companyDepartments.get(z).add(a);
            } else
                job.locuri++;
            newReques.remove(max);
            job.locuri--;
        }
        job.flag = false;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "cereri=" + cereri +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", cunoscut=" + cunoscut +
                ", resume=" + resume +
                '}';
    }

}
