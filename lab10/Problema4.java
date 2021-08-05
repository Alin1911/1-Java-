import javax.swing.*;
import javax.swing.event.*;
import javax.swing.event.ChangeListener;
import java.awt.*;


public class Problema4 extends JFrame implements ChangeListener  {

    static JFrame f;
    static JSlider rosu, verde,albastru;
    static JLabel l;
    static Color co;

    Problema4(){
        f = new JFrame("Problema4");


        l = new JLabel("                                        ");
        l.setOpaque(true);

        co = new Color(100,100,100,100);

        JPanel p = new JPanel();

        rosu = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        rosu.setPaintTrack(true);
        rosu.setPaintTicks(true);
        rosu.setPaintLabels(true);
        rosu.setMajorTickSpacing(50);
        rosu.setMinorTickSpacing(5);
        rosu.setBackground(Color.red);
        rosu.addChangeListener(this);
        p.add(rosu);

        verde = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        verde.setPaintTrack(true);
        verde.setPaintTicks(true);
        verde.setPaintLabels(true);
        verde.setMajorTickSpacing(50);
        verde.setMinorTickSpacing(5);
        verde.setBackground(Color.green);
        verde.addChangeListener(this);
        p.add(verde);

        albastru = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        albastru.setPaintTrack(true);
        albastru.setPaintTicks(true);
        albastru.setPaintLabels(true);
        albastru.setMajorTickSpacing(50);
        albastru.setMinorTickSpacing(5);
        albastru.setBackground(Color.blue);
        albastru.addChangeListener(this);
        p.add(albastru);
        p.add(l);

        f.add(p);

        f.setSize(600, 600);

        f.show();

    }

    public static void main(String[] args)
    {
        Problema4 s = new Problema4();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        co = new Color(rosu.getValue(),verde.getValue(),albastru.getValue(),100);
        l.setBackground(co);
    }
}