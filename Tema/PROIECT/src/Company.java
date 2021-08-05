import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class Company {
    String companyName;
    Manager companyManager;
    ArrayList<Department> companyDepartments;
    ArrayList<Recruiter> companyRecruiters;

    //constructor
    public Company(String companyName, Manager companyManager, ArrayList<Department> companyDepartments, ArrayList<Recruiter> recrut) {
        this.companyName = companyName;
        this.companyManager = companyManager;
        this.companyDepartments = companyDepartments;
        this.companyRecruiters = recrut;
    }

    //Adăugarea unui nou departament în compani
    public void add(Department department) {
        this.companyDepartments.add(department);
    }

    // Adăugarea unui nou recruiter
    public void add(Recruiter recruiter) {
        this.companyRecruiters.add(recruiter);
    }

    //Adăugarea unui angajat într-un departamentAdăugarea unui angajat într-un departament
    public void add(Employee employee, Department department) {
        int i;
        i = this.companyDepartments.indexOf(department);
        this.companyDepartments.get(i).add(employee);
    }

    // Eliminarea unui angajat din companie;
    public void remove(Employee employee) {
        for (Department department : this.companyDepartments) {
            department.angajati.remove(employee);
        }
    }

    //Eliminarea unui departament din companie, si a angajatilor sai
    public void remove(Department department) {
        int i;
        i = this.companyDepartments.indexOf(department);

        for (int j = 0; j < this.companyDepartments.get(i).angajati.size(); j++) {
            remove(this.companyDepartments.get(i).angajati.get(j));
        }
        this.companyDepartments.remove(department);
    }

    //Eliminarea unui recruiter
    public void remove(Recruiter recruiter) {
        this.companyRecruiters.remove(recruiter);
    }

    // Mutarea unui departament în alt departament si transferarea tuturor angajatilor
    public void move(Department source, Department destination) {
        int i, k;
        i = this.companyDepartments.indexOf(source);
        k = this.companyDepartments.indexOf(destination);
        //parcurg lista de angajati ai departamentului sursa si ii mut
        for (int j = 0; j < this.companyDepartments.get(i).angajati.size(); j++)
            add(this.companyDepartments.get(i).angajati.get(j), this.companyDepartments.get(k));
        //sterg vechiul departament
        this.companyDepartments.remove(source);
    }

    //Mutarea unui angajat dintr-un departament în alt departament
    public void move(Employee employee, Department newDepartment) {
        remove(employee);
        add(employee, newDepartment);
    }

    //Verificarea existentei unui departament în companie
    public boolean contains(Department department) {
        return this.companyDepartments.contains(department);
    }

    //Verificare existent,ei unui angajat în companie
    public boolean contains(Employee employee) {
        for (Department department : this.companyDepartments) {
            if (department.angajati.contains(employee))
                return true;
        }
        return false;
    }

    //Verificarea existent,ei unui recruiter în companie
    public boolean contains(Recruiter recruiter) {
        return this.companyRecruiters.contains(recruiter);
    }

    //Determinarea recruiter-ului potrivit pentru un utilizator
    public Recruiter getRecruiter(User user) {
        // creez listele pentru metoda bsf
        ArrayList<Consumer> visited = new ArrayList<>();
        ArrayList<Consumer> userMax = new ArrayList<>();
        Vector<Integer> lvl = new Vector<>();
        //apelez metoda
        Consumer.bfs(user, 1, visited, lvl);
        //caut cel mai indepartat recrutier cunsocut
        int nivel = Collections.max(lvl);
        //verific daca exista un recrutier care nu e in arborele cu prieteni
        for (Recruiter companyRecruiter : companyRecruiters) {
            if (!visited.contains(companyRecruiter))
                return companyRecruiter;
        }
        //verific daca se afla un recrutier pe nivelul cel mai indepartat
        //si scad nivelul pana gasesc unul
        while (nivel != 0) {
            //caut recrutierii de pe nivelul corespunzator
            for (int i = 0; i < visited.size(); i++) {
                for (Recruiter companyRecruiter : companyRecruiters)
                    //verific nivellul si existenta recrutierului in lista visited
                    if (visited.get(i).equals(companyRecruiter) && lvl.get(i).equals(nivel))
                        userMax.add(visited.get(i));
            }
            if (!userMax.isEmpty())
                break;
            nivel--;
        }
        //daca avem daor un recrutier in lista il returnez
        if (userMax.size() == 1)
            return (Recruiter) userMax.get(0);
        //in cazul in care am mai multi recrutierii il caut pe cel protrivid
        //comparand rata de succes
        Recruiter max;
        max = (Recruiter) userMax.get(0);
        for (Consumer consumer : userMax) {
            if (max.succesRate < ((Recruiter) consumer).succesRate)
                max = (Recruiter) consumer;
        }
        return max;
    }

    //• Determinarea job-urilor disponibile dintr-o companie
    public ArrayList<Job> getJobs() {
        ArrayList<Job> jobs = new ArrayList<>();
        //caut joburile
        for (Department department : this.companyDepartments) {
            for (int j = 0; j < department.jobs.size(); j++)
                //ma uit daca sunt disponibile
                if (department.jobs.get(j).flag)
                    jobs.add(department.jobs.get(j));
        }
        return jobs;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", companyManager=" + companyManager +
                ", companyDepartments=" + companyDepartments +
                ", companyRecruiters=" + companyRecruiters +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return companyName.equals(company.companyName) &&
                companyManager.equals(company.companyManager) &&
                companyDepartments.equals(company.companyDepartments) &&
                companyRecruiters.equals(company.companyRecruiters);
    }
}
