import java.util.Date;
import java.util.HashMap;


public class Information {
    private final HashMap<String, String> limbile_cunoscute;
    private String nume;
    private String prenume;
    private String email;
    private String telefon;
    private Date data_de_nastere;
    private String gen;

    //constructori
    public Information() {
        this.nume = null;
        this.prenume = null;
        this.email = null;
        this.telefon = null;
        this.data_de_nastere = null;
        this.gen = null;
        this.limbile_cunoscute = new HashMap<String, String>();
    }

    public Information(String nume, String prenume, String email, String telefon, Date data_de_nastere, String gen, HashMap<String, String>
            limbile_cunoscute) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.telefon = telefon;
        this.data_de_nastere = data_de_nastere;
        this.gen = gen;
        this.limbile_cunoscute = limbile_cunoscute;
    }

    //adaugarea unui nume
    void addNume(String nume) {
        this.nume = nume;
    }

    // metoda care intoarce numele
    String getNume() {
        return this.nume;
    }

    //adaugarea unui prenume
    void addPrenume(String prenume) {
        this.prenume = prenume;
    }

    //metoda care intoarce prenumele
    String getPrenume() {
        return this.prenume;
    }

    //adaugarea unui email
    void addEmail(String email) {
        this.email = email;
    }

    //metoda care intoarce un email
    String getEmail() {
        return this.email;
    }

    // adaugarea numarului de telefon
    void addTelefon(String telefon) {
        this.telefon = telefon;
    }

    //metoda care intoarce un numarul de telefon
    String getTelefon() {
        return this.telefon;
    }

    //adaugarea unei date de nastere
    void addData(Date data_de_nastere) {
        this.data_de_nastere = data_de_nastere;
    }

    //metoda care intoarce un data de nastere
    Date getData() {
        return this.data_de_nastere;
    }

    //adaugarea genului
    void addSex(String gen) {
        this.gen = gen;
    }

    //metoda care intoarce genul
    String getGen() {
        return this.gen;
    }

    // adaugarea de limbi cunoscute
    void addLimbi_cunoscute(String limba, String nivel) {
        this.limbile_cunoscute.put(limba, nivel);
    }

    //metoda care intoarce limbile cunoscute
    HashMap getLimba() {
        return this.limbile_cunoscute;
    }

    @Override
    public String toString() {
        return "Information{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", email='" + email + '\'' +
                ", telefon=" + telefon +
                ", data_de_nastere=" + data_de_nastere +
                ", sex='" + gen + '\'' +
                ", limbile_cunoscute=" + limbile_cunoscute +
                '}';
    }
}
