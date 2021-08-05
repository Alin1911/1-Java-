import java.util.ArrayList;

public class Marketing extends Department {

    //constructor
    public Marketing(ArrayList<Employee> angajati, ArrayList<Job> jobs) {
        super(angajati, jobs);
    }

    //caclulez bugetul
    @Override
    public double getTotalSalaryBudget() {
        double buget = 0;
        for (Employee employee : this.angajati) {
            if (employee.salary > 5000)
                buget = buget + employee.salary + 0.1 * employee.salary;
            else if (employee.salary < 3000)
                buget = buget + employee.salary;
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
