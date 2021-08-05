import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.Random;


public class Problema5 extends JFrame implements ActionListener {

    static JTextField t;

    static JFrame f;

    static JButton b;

    static JLabel l;

    static Vector<Color> co;

    Problema5(){
        f = new JFrame("Problema5");
        int R = (int)(Math.random()*256);
        int G = (int)(Math.random()*256);
        int B= (int)(Math.random()*256);

        co = new Vector<Color>(100);

        for (int  i = 0; i < 100; i++){
            co.add(i, new Color(R, G, B, 100));
            R = (int)(Math.random()*256);
            G = (int)(Math.random()*256);
            B= (int)(Math.random()*256);
        }

        t = new JTextField("Rezultat",10);

        l= new JLabel("vad eu");

        b = new JButton("Gata");
        b.addActionListener(this);
        JPanel p = new JPanel();
        p.add(b);
        p.add(t);
        p.add(l);

        f.add(p);

        f.setSize(600, 600);

        f.show();


    }

    public static void main(String[] args) {
        Problema5 s = new Problema5();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        int i=0;
        if (s.equals("Gata")) {
            i++;
        }


    }


}
