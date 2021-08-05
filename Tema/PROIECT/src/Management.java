import java.util.ArrayList;

public class Management extends Department {

    //constructor
    public Management(ArrayList<Employee> angajati, ArrayList<Job> jobs) {
        super(angajati, jobs);
    }

    //calculez bugetul
    @Override
    public double getTotalSalaryBudget() {
        double buget = 0;
        //parcurg lista de angajati
        for (Employee employee : this.angajati) {
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
