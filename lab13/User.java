public abstract class User {
    protected String firstName, lastName;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString() {
        return firstName + " " + lastName;
    }
}class Student extends User{

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }
}

class Parent extends User{

    public Parent(String firstName, String lastName) {
        super(firstName, lastName);
    }
}

class Assistant extends User {

    public Assistant(String firstName, String lastName) {
        super(firstName, lastName);
    }
}

class Teacher extends User{

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }
}