import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KeyEvents
{
    static JTextField tf1, tf2;

    public static void main(String[] args)
    {
        tf1 = new JTextField(8);
        tf2 = new JTextField(8);
        tf1.setAction(copy);
        JPanel panel = new JPanel();
        panel.add(tf1);
        panel.add(tf2);
        JButton button = new JButton("button");
        button.setAction(copy);
        button.getInputMap().put(KeyStroke.getKeyStroke("ENTER"), "COPY");
        button.getActionMap().put("COPY", copy);
        JPanel south = new JPanel();
        south.add(button);
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(panel);
        f.getContentPane().add(south, "South");
        f.setSize(260,120);
        f.setLocation(200,200);
        f.setVisible(true);
    }

    private static Action copy = new AbstractAction("copy")
    {
        public void actionPerformed(ActionEvent e)
        {
            tf2.setText(tf1.getText());
        }
    };
}