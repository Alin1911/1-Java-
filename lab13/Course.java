import java.util.ArrayList;
import java.util.TreeSet;

public class Course {
    private final String nume;
    private final Teacher titular;
    private final ArrayList<Assistant> restu;
    private final TreeSet<Grade> nush;
    private final ArrayList<Student> sclavii;

    private Course(Builder b) {
        this.nume = b.nume;
        this.titular = b.titular;
        this.restu = b.restu;
        this.nush = b.nush;
        this.sclavii = b.sclavii;
    }

    @Override
    public String toString() {
        return "Course{" +
                "nume='" + nume + '\'' +
                ", titular=" + titular +
                ", restu=" + restu +
                ", nush=" + nush +
                ", sclavii=" + sclavii +
                '}';
    }

    static class Builder{
        String nume;
        Teacher titular;
        ArrayList<Assistant> restu;
        TreeSet<Grade> nush;
        ArrayList<Student> sclavii;

        Builder setNume(String a){
            this.nume = a;
            return this;
        }
        Builder setTitular(Teacher n){
            this.titular =n;
            return this;
        }

        Builder setNUSH(TreeSet<Grade> g){
            this.nush =g;
            return this;
        }
        Builder setRestu(ArrayList<Assistant>a){
            this.restu=a;
            return this;
        }

        Builder setSclavii(ArrayList<Student>q){
            this.sclavii=q;
            return this;
        }

        Course CourseBuilder(){
            return new Course(this);
        }

    }

    public TreeSet<Grade> getNush() {
        return nush;
    }

    public ArrayList<Assistant> getRestu() {
        return restu;
    }

    public Teacher getTitular() {
        return titular;
    }

    public String getNume() {
        return nume;
    }

    public ArrayList<Student> getSclavii() {
        return sclavii;
    }
}

class Grade {
    private Double partialScore, examScore;
    private Student student;
    private String course;

    public Grade(String course, Student student) {
        partialScore = 0.0;
        examScore = 0.0;
        this.course = course;
        this.student = student;
    }

    public Grade(String course, Student student,Double partialScore, Double examScore ) {
        this.partialScore = partialScore;
        this.examScore = examScore;
        this.course = course;
        this.student = student;
    }

    public void setPartialScore(Double score) {
        partialScore = score;
    }
    public void setExamScore(Double score) {
        examScore = score;
    }
    public Double getTotal() {
        return partialScore + examScore;
    }

    public Student getStudent() {
        return student;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}