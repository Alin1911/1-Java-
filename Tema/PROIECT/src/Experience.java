import com.sun.media.sound.InvalidDataException;

import java.util.Date;

public class Experience implements Comparable<Experience> {
    Date start;
    Date stop;
    String pozitie;
    String companie;

    //constructorul
    public Experience(Date start, Date stop, String pozitie, String companie) throws InvalidDataException {

        if (start.before(stop) || stop == null) {
            this.start = start;
            this.stop = stop;
            this.pozitie = pozitie;
            this.companie = companie;
        } else
            throw new InvalidDataException();
    }

    //implementarea metodei de comparatie
    @Override
    public int compareTo(Experience o) {
        if (this.stop != null && o.stop != null) {
            //compar data de sfarsit
            return this.stop.compareTo(o.stop);
        } else {
            //compar folosind numele companiei
            return this.companie.compareTo(o.companie);
        }
    }

    @Override
    public String toString() {
        return "Experience{" +
                "start=" + start +
                ", stop=" + stop +
                ", pozitie='" + pozitie + '\'' +
                ", companie='" + companie + '\'' +
                '}';
    }
}
