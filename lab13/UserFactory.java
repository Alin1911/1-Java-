import com.sun.media.sound.InvalidDataException;

public class UserFactory {
    public static User createUser(String tip, String porecla, String name) throws InvalidDataException {
        if (tip.equals("Student")) {
            return new Student(porecla, name);
        }
        if (tip.equals("Parent")) {
            return new Parent(porecla, name);

        } else if (tip.equals("Teacher")) {
            return new Teacher(porecla, name);

        } else if (tip.equals("Assistent")) {
            return new Assistant(porecla, name);
        }
        throw new InvalidDataException("Tip invalid: " + tip);

    }
}
