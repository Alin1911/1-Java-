import com.sun.media.sound.InvalidDataException;

import java.util.Date;
import java.util.Objects;

public class Education implements Comparable<Education> {
    Date start;
    Date stop;
    String nivel;
    Double media;
    String institutie;

    //constructor
    public Education(Date start, Date stop, String nivel, Double media, String institutie) throws InvalidDataException {

        if (start.before(stop) || stop == null) {
            this.start = start;
            this.stop = stop;
            this.nivel = nivel;
            this.media = media;
            this.institutie = institutie;
        } else
            throw new InvalidDataException();
    }

    //implementarea comparatorului
    @Override
    public int compareTo(Education o) {
        if (this.stop != null && o.stop != null) {
            //comar datele de sfarsit
            return this.stop.compareTo(o.stop);
        } else {
            //compar data de inceput
            return this.start.compareTo(o.start);
        }
    }

    @Override
    public String toString() {
        return "Education{" +
                "start=" + start +
                ", stop=" + stop +
                ", nivel='" + nivel + '\'' +
                ", media=" + media +
                ", institutie='" + institutie + '\'' +
                '}';
    }

}
