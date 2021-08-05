import java.util.ArrayList;
import java.util.List;

public class Application {
    //instanta pentru Singleton
    private static Application Singleton = new Application();
    //lista de utilizatori
    private ArrayList<User> userList;
    //lista de compani
    private ArrayList<Company> companyList;

    //constructori
    private Application(ArrayList<User> userList, ArrayList<Company> companyList) {
        Singleton.userList = userList;
        Singleton.companyList = companyList;
    }

    private Application() {
        userList = new ArrayList<>();
        companyList = new ArrayList<>();
    }

    //metoda care retuneaza instanta
    public static Application getInstance() {
        if (Singleton == null)
            Singleton = new Application();
        return Singleton;
    }

    //Determinarea unei anumite companii în funct, ie de numele furnizat;
    public static Company getCompany(String name) {
        //parcurg lista de compani si caut compania
        for (Company company : Singleton.companyList) {
            if (company.companyName.equals(name))
                return company;
        }
        return null;
    }

    //Determinarea unui anumit utilizator
    public static User userDetect(String name) {
        //parcurg lista de compani si caut compania
        for (User user : Singleton.userList) {
            if (user.resume.information.getNume().equals(name))
                return user;
        }
        return null;
    }

    public ArrayList<User> getUserList() {
        return this.userList;
    }

    //Determinarea companiilor care au fost înscrise în aplicatie;
    public ArrayList<Company> getCompanies() {
        return companyList;
    }

    //Adăugarea unei companii;
    public void add(Company company) {
        companyList.add(company);
    }

    //Adăugarea unui utilizator
    public void add(User user) {
        userList.add(user);
    }

    //Stergerea unei companii – va întoarce false dacă compania nu există
    public boolean remove(Company company) {
        if (companyList.contains(company)) {
            companyList.remove(company);
            return true;
        }
        return false;
    }

    //Stergerea unui utilizator – va întoarce false dacă utilizatorul nu există;
    public boolean remove(User user) {
        if (userList.contains(user)) {
            userList.remove(user);
            return true;
        }
        return false;
    }

    //Determinarea joburile disponibile de la companiile pe care le preferă utilizatorul
    public ArrayList<Job> getJobs(List<String> companies) {
        int i, j, l;
        // noua lista de joburi disponibile
        ArrayList<Job> rezultate = new ArrayList<>();
        //parcurg companiile dorite
        for (j = 0; j < companies.size(); j++) {
            //parcurg lista de compani din aplicatie
            for (i = 0; i < companyList.size(); i++) {
                //verific daca am agsit o companie
                if (companyList.get(i).companyName.equals(companies.get(j))) {
                    //parcurg lista de departamente
                    for (l = 0; l < companyList.get(i).companyDepartments.size(); l++) {
                        //parcurg lista de job-uri
                        for (int k = 0; k < companyList.get(i).companyDepartments.get(l).jobs.size(); k++) {
                            //verific daca jobul este deschis si in caz ca da il adaug in lista
                            if (companyList.get(i).companyDepartments.get(l).jobs.get(k).flag)
                                rezultate.add(companyList.get(i).companyDepartments.get(l).jobs.get(k));
                        }
                    }
                }
            }
        }
        return rezultate;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
