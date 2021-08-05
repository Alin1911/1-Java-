import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Vector;

public abstract class Consumer {
    //lista de cunoscuti
    ArrayList<Consumer> cunoscut;
    //obiecturl de tip Resume
    Resume resume;

    //constructori
    public Consumer(ArrayList<Consumer> cunoscut, Resume resume) {
        this.cunoscut = cunoscut;
        this.resume = resume;
    }

    public Consumer() {
        this.cunoscut = new ArrayList<Consumer>();
        resume = null;

    }

    //parcurgerea in latime a retelei sociale
    static public void bfs(Consumer consumer, int lvlStart, ArrayList<Consumer> visited, Vector<Integer> lvl1) {
        //parcurg lista de cunoscuti
        for (int i = 0; i < consumer.cunoscut.size(); i++) {
            // verific daca acel consumer a fost deja vizitat
            if (visited.contains(consumer.cunoscut.get(i))) {
                // daca da apelez din nou metoda cu un nou punct de plecare
                bfs(consumer.cunoscut.get(i), lvlStart++, visited, lvl1);
            } else {
                //daca nu adaug nodul in lista visited adaug nivelul
                //corespunzator in lista cu nivele
                visited.add(lvlStart, consumer.cunoscut.get(i));
                lvl1.add(lvlStart);
                //apelez din nou metoda cu un nou punct de plecare
                bfs(consumer.cunoscut.get(i), lvlStart++, visited, lvl1);
            }
        }
    }

    //Adăugarea unor studii
    public void add(Education education) {
        this.resume.addEducation(education);
    }

    //Adăugarea unei experient,e profesionale
    public void add(Experience experience) {
        this.add(experience);
    }

    //Adăugarea unui nou cunoscut
    public void add(Consumer consumer) {
        this.cunoscut.add(consumer);
    }

    //Determinarea gradului de prietenie cu un alt utilizator
    public int getDegreeInFriendship(Consumer consumer) {
        int rezultat;
        //lista cu toti oameni care fac parte din arborele consumerului
        ArrayList<Consumer> visited = new ArrayList<>();
        //vectorul cu gradele de prietenie
        Vector<Integer> lvl = new Vector<>();
        //se apeleaza metoda bfs care imi va completa lista si vectorul de mai sus
        bfs(consumer, 1, visited, lvl);
        //caut indexul utilizatorului in noua lista cu prieteni
        rezultat = visited.indexOf(this);
        //returnez nivelul pe care se afla acel consumeri in arbore
        return lvl.get(rezultat);
    }

    //Eliminarea unei persoane din ret,eaua socială
    public void remove(Consumer consumer) {
        this.cunoscut.remove(consumer);
    }

    // Determinarea anului absolviri
    public Integer getGraduationYear() {
        return this.resume.educatia.get(0).stop.getYear();
    }

    //Determinarea mediei studiilor absolvite
    public Double meanGPA() {
        double rezult = 0;
        //parcurg lista cu studiile absolvite
        for (int i = 0; i < this.resume.educatia.size(); i++) {
            // fac suma mediilor
            rezult = rezult + this.resume.educatia.get(i).media;
        }
        //returnez media
        return rezult / this.resume.educatia.size();
    }

    //aici am o metoda care imi intoarce experienta profesionala a unei persoane
    public double experienta() {
        double ani = 0, luni = 0, rezultat;
        //parcurg lista cu experientele profesionale
        for (int i = 0; i < this.resume.getExperienta().size(); i++) {
            //calculez anii
            ani = ani + this.resume.getExperienta().get(i).stop.getYear() - this.resume.getExperienta().get(i).start.getYear();
            // calculez lunile
            luni = 12 + luni + this.resume.getExperienta().get(i).stop.getMonth() - this.resume.getExperienta().get(i).start.getMonth();
        }
        // calculez experienta
        if (luni <= 9 || luni >= 15)
            rezultat = (ani + 1);
        else
            rezultat = ani;

        return rezultat;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "cunoscut=" + cunoscut +
                ", resume=" + resume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Consumer)) return false;
        Consumer consumer = (Consumer) o;
        return Objects.equals(cunoscut, consumer.cunoscut) &&
                Objects.equals(resume, consumer.resume);
    }

    // clasa interna Resume
    static class Resume {
        //informatiile persoanei
        Information information;
        //lista cu studii
        ArrayList<Education> educatia;
        //lista cu experienta
        ArrayList<Experience> experienta;

        //constructori
        public Resume(Information information, ArrayList<Education> educatia, ArrayList<Experience> experienta) {
            this.information = information;
            this.educatia = educatia;
            this.experienta = experienta;
            Collections.sort(this.educatia);
            Collections.sort(this.experienta);
        }

        public Resume() {
            this.information = null;
            this.educatia = new ArrayList<Education>();
            this.experienta = new ArrayList<Experience>();
        }

        //Adăugarea unei experiente
        public void addExperience(Experience experience) {
            this.experienta.add(experience);
            Collections.sort(this.experienta);
        }

        //metoda care intoarce lista cu experienta
        public ArrayList<Experience> getExperienta() {
            return experienta;
        }

        //metoda care intoarce informatiile unui consumer
        public Information getInformation() {
            return information;
        }

        //adaugarea informatiilor
        public void setInformation(Information information) {
            this.information = information;
        }

        //adaugarea unor studii
        public void addEducation(Education education) {
            this.educatia.add(education);
            Collections.sort(this.educatia);
        }

        //metoda care intoarce educatia unui consumer
        public ArrayList<Education> getEducatia() {
            return educatia;
        }

        @Override
        public String toString() {
            return "Resume{" +
                    "information=" + information +
                    ", educatia=" + educatia +
                    ", experienta=" + experienta +
                    '}';
        }

    }
}
