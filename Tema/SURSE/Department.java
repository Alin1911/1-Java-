import java.util.ArrayList;
import java.util.Objects;

public abstract class Department {
    ArrayList<Employee> angajati;
    ArrayList<Job> jobs;

    //constructor
    public Department(ArrayList<Employee> angajati, ArrayList<Job> jobs) {
        this.angajati = angajati;
        this.jobs = jobs;
    }

    //metoda abstracta pentru buget
    public abstract double getTotalSalaryBudget();

    //metoda care returneaza joburile disponibile din departament
    public ArrayList<Job> getJobs() {
        ArrayList<Job> des = new ArrayList<>();
        for (Job job : this.jobs) {
            if (job.flag)
                des.add(job);
        }
        return des;
    }

    //adaugarea unui angajat
    public void add(Employee employee) {
        this.angajati.add(employee);
    }

    //stergerea unui angajat
    public void remove(Employee employee) {
        this.angajati.remove(employee);
    }

    //adaugarea unui job
    public void add(Job job) {
        this.jobs.add(job);
    }

    //metoda care intoarce lista de agngajati din departament
    public ArrayList<Employee> getEmployees() {
        return this.angajati;
    }

    @Override
    public String toString() {
        return "Department{" +
                "angajati=" + angajati +
                ", jobs=" + jobs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return Objects.equals(angajati, that.angajati) &&
                Objects.equals(jobs, that.jobs);
    }
}
