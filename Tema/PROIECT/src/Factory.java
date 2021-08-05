import com.sun.media.sound.InvalidDataException;

import java.util.ArrayList;

public class Factory {
    // metoda care intoarce departamentul cerut
    public static Department createDepartment(String name) throws InvalidDataException {
        //detectez ce obiect trebuie creat si folosesc constructorul corespunzator
        if (name.equals(IT.class.getSimpleName()))
            return new IT(new ArrayList<Employee>(), new ArrayList<Job>());
        if (name.equals(Management.class.getSimpleName()))
            return new Management(new ArrayList<Employee>(), new ArrayList<Job>());
        if (name.equals(Marketing.class.getSimpleName()))
            return new Marketing(new ArrayList<Employee>(), new ArrayList<Job>());
        if (name.equals(Finance.class.getSimpleName()))
            return new Finance(new ArrayList<Employee>(), new ArrayList<Job>());
        //in cazul in care introduc date invalide intorc o exceptie
        throw new InvalidDataException();
    }
}
