import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class Prob4 {

    public static void main(String[] args) throws IOException {
        String linie;
        BufferedReader citire = null;
        FileWriter fisier = new FileWriter("C:\\Users\\andre\\IdeaProjects\\lab14\\src\\lambda.txt");
        try {
            InputStreamReader a = new InputStreamReader(System.in);
            citire = new BufferedReader (a);
            linie = citire.readLine();
            while (!linie.equals("exit"))
            {
                fisier.write(linie);
                fisier.write(System.getProperty("line.separator"));
                linie = citire.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (citire != null)
                    citire.close();
                fisier.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}