import com.sun.media.sound.InvalidDataException;

import java.util.ArrayList;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws InvalidDataException {
        Application a = Application.getInstance();
        Information b = new Information("Sundar", "Pichai", null, null, null, null, null);
        Consumer.Resume ab = new Consumer.Resume(b, new ArrayList<Education>(), new ArrayList<Experience>());
        Manager Sundar = new Manager(null, ab, "Google", 2000, null);
        Company Google = new Company("Google", Sundar, new ArrayList<Department>(), null);
        IT bb = new IT(new ArrayList<Employee>(), new ArrayList<Job>());
        a.add(Google);
        Date zi = new Date(1986, 01, 12);
        Information z = new Information("Harmony ", "Lorinda", "harmonyl@gmail.com", "+4111111111", zi, "female", null);
        Consumer.Resume aaa = new Consumer.Resume(z, new ArrayList<Education>(), new ArrayList<Experience>());
        Employee Harmony = new Employee(null, aaa, "Amazon", 5000);
        Google.add(bb);
        Google.add(Harmony, bb);


    }
}
