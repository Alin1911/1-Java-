import java.awt.event.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
class Problema2 extends JFrame implements ItemListener {
    static JFrame f;

    static JRadioButton b1,b2,b3,b4;

    static JLabel l1;
    Problema2(){
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

        f = new JFrame("Problema2");
        JPanel p = new JPanel();

        JLabel l = new JLabel(s1);
        l.setPreferredSize(new Dimension(100,100));
        l1 = new JLabel("Alege un raspuns");
        l1.setPreferredSize(new Dimension(100,100));
        b1 = new JRadioButton(s2, new ImageIcon("f:/gfg.jpg"));
        b1.setPreferredSize(new Dimension(50,50));
        b2 = new JRadioButton(s3,new ImageIcon("f:/gfg.jpg"));
        b2.setPreferredSize(new Dimension(50,50));
        b3 = new JRadioButton(s4,new ImageIcon("f:/gfg.jpg"));
        b3.setPreferredSize(new Dimension(50,50));
        b4 = new JRadioButton(s5,new ImageIcon("f:/gfg.jpg"));
        b4.setPreferredSize(new Dimension(50,50));

        ButtonGroup bg = new ButtonGroup();

        b1.addItemListener(this);
        b2.addItemListener(this);
        b3.addItemListener(this);
        b4.addItemListener(this);

        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        bg.add(b4);

        p.add(l);
        p.add(l1);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);

        f.add(p);

        f.setSize(600, 300);

        f.show();
    }


    public static void main(String[] args)
    {

        Problema2 s = new Problema2();

    }

    public void itemStateChanged(ItemEvent e)
    {
        if (e.getSource() == b1) {
            if (e.getStateChange() == 1) {
                b1.setBackground(Color.green);

            }
        }
        if (e.getSource() == b2) {
            if (e.getStateChange() == 1) {
                b2.setBackground(Color.red);

            }
        }
        if (e.getSource() == b3) {
            if (e.getStateChange() == 1) {
                b3.setBackground(Color.red);

            }
        }
        if (e.getSource() == b4) {
            if (e.getStateChange() == 1) {
                b4.setBackground(Color.red);

            }
        }
    }
} 