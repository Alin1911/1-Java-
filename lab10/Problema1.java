import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax . swing .*;


public class Problema1 extends JFrame implements ActionListener{

    static JTextField t;
    static JTextField a;
    static JTextField c;

    static JFrame f;


    static JButton b;

    static JLabel l;
    Problema1()
    {

        f = new JFrame("Problema1");

        l = new JLabel("path");

        b = new JButton("Gata");


        b.addActionListener(this);

        t = new JTextField(3);
        a = new JTextField(25);
        c = new JTextField(15);

        JPanel p = new JPanel();

        p.add(t);
        p.add(a);
        p.add(c);
        p.add(b);
        p.add(l);

        f.add(p);

        f.setSize(600, 600);

        f.show();
    }
    public static void main(String[] args)
    {
        Problema1 p1= new Problema1();
    }

    public void actionPerformed(ActionEvent e)
    {

        String s = e.getActionCommand();
        if (s.equals("Gata")) {
            l.setText(t.getText()+a.getText()+c.getText());
            t.setText("  ");
            a.setText("  ");
            c.setText("  ");
        }
    }
}

