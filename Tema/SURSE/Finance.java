import java.util.ArrayList;

public class Finance extends Department {

    //constructor
    public Finance(ArrayList<Employee> angajati, ArrayList<Job> jobs) {
        super(angajati, jobs);
    }

    //calculez bugetul
    @Override
    public double getTotalSalaryBudget() {
        double buget = 0;
        for (Employee employee : this.angajati) {
            if (employee.resume.experienta.size() < 1)
                buget = buget + employee.salary + 0.1 * employee.salary;
            else
                buget = buget + employee.salary + 0.16 * employee.salary;
        }
        return buget;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
