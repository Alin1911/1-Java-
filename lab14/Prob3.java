import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Prob3 {

    public static void main(String[] args) {
        String input = "C:\\Users\\andre\\IdeaProjects\\lab14\\src\\test01.in";
        LineNumberReader nrlinie;
        FileReader fisier;
        String linienoua;
        try {
            fisier = new FileReader(input);
            nrlinie = new LineNumberReader(fisier);
            linienoua = nrlinie.readLine();
            while (linienoua != null) {
                if (nrlinie.getLineNumber() % 2 == 1)
                    System.out.println(nrlinie.getLineNumber() + ": " + linienoua);
                linienoua = nrlinie.readLine();
            }
            nrlinie.close();
            fisier.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}