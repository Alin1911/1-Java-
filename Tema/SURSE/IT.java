import java.util.ArrayList;

public class IT extends Department {

    //constructor
    public IT(ArrayList<Employee> angajati, ArrayList<Job> jobs) {
        super(angajati, jobs);
    }

    //calculez bugetul
    @Override
    public double getTotalSalaryBudget() {
        double buget = 0;
        //domeniul IT nu are taxe
        for (Employee employee : this.angajati)
            buget = buget + employee.salary;
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
