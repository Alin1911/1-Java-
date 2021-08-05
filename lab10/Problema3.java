import java.awt.event.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
class Problema3 extends JFrame implements ActionListener {

    static JFrame f;
    int a;

    static JLabel l, l1;

    static JButton b;
    static JCheckBox c1, c2, c3, c4;
    Problema3(){
        String s1 =null ,s2 = null,s3 =null,s4 =null,s5 =null;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(
                    "C:\\Users\\andre\\IdeaProjects\\Laborator10\\src\\text.txt"));
            String line = reader.readLine();
            s1 = line;
            line = reader.readLine();
            s2 =line;
            line = reader.readLine();
            s3 =line;
            line = reader.readLine();
            s4=line;
            line = reader.readLine();
            s5 = line;
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        f = new JFrame("Problema3");

        f.setLayout(new FlowLayout());
        b = new JButton("Gata");
        c1 = new JCheckBox(s2, false);
        c2 = new JCheckBox(s3, false);
        c3 = new JCheckBox(s4, false);
        c4 = new JCheckBox(s5, false);

        b.addActionListener(this);

        l = new JLabel(s1);

        JPanel p = new JPanel();

        p.add(l);
        p.add(c1);
        p.add(c2);
        p.add(c3);
        p.add(c4);
        p.add(b);

        f.add(p);

        f.setSize(600, 300);

        f.show();
    }

    public static void main(String[] args)
    {
        Problema3 s = new Problema3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Gata")) {
            if(c1.isSelected())
                c1.setBackground(Color.green);
            if(c2.isSelected())
                c2.setBackground(Color.red);
            if(c3.isSelected())
                c3.setBackground(Color.green);
            if(c4.isSelected())
                c4.setBackground(Color.red);
        }
    }
}
