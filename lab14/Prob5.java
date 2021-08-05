import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.io.StreamTokenizer;

public class Prob5 {

    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader(new File("C:\\Users\\andre\\IdeaProjects\\lab14\\src\\test02.in"));
            StreamTokenizer str = new StreamTokenizer(file);
            for(int n = 0; str.nextToken() != StreamTokenizer.TT_EOF; n++)
            System.out.println("cvinte: " + n);
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (file != null)
                    file.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}