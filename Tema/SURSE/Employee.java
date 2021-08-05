import java.util.ArrayList;
import java.util.Objects;

public class Employee extends Consumer {
    String companyName;
    Integer salary;

    //Constructor
    public Employee(ArrayList<Consumer> cunoscut, Resume resume, String companie, Integer salary) {
        super(cunoscut, resume);
        this.companyName = companie;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", cunoscut=" + cunoscut +
                ", resume=" + resume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(companyName, employee.companyName) &&
                Objects.equals(salary, employee.salary);
    }
}
