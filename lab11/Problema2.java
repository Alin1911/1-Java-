/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

import com.sun.corba.se.pept.transport.Selector;
import com.sun.javafx.geom.Vec2f;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.util.Vector;

/**
 *
 * @author Nan Mihai
 */
public class Problema2 implements ListSelectionListener {
    private String name;
    private String author;
    private String iconName;
    DefaultListModel<Problema2> lista;
    JFrame f;
    JTextField j1,j2;
    JLabel l1,l;
    JList listBook;
    JScrollPane sp;
    JPanel p;

    public Problema2(){

        f = new JFrame("Problema 2");
        JPanel p =new JPanel();
        l1 = new JLabel("Autor   ");
        l= new JLabel("Carte   ");
        j1 = new JTextField();
        j2 = new JTextField();

        this.lista = new DefaultListModel<Problema2>();
        for (int i=0; i < 30; i++){
            this.lista.addElement(new Problema2(" Ana are mere "," Alin "," abcd "));
            this.lista.addElement(new Problema2(" Ana nu are mere "," Bacovia "," abcd "));
            this.lista.addElement(new Problema2(" Ana vrea mere "," Ion "," abcd "));
            this.lista.addElement(new Problema2(" Ana cere mere "," Elminescu "," abcd "));
            this.lista.addElement(new Problema2(" Ana fura mere "," Hotu "," abcd "));
            this.lista.addElement(new Problema2(" Ana cumpara mere "," Vanzatoarea "," abcd "));
        }
        listBook = new JList(this.lista);
        listBook.setSelectedIndex(1);
        int a;
        a =listBook.getSelectedIndex();
        j1.setText(lista.get(a).name);
        j2.setText(lista.get(a).author);

        listBook.addListSelectionListener(this);
        sp = new JScrollPane(listBook);
        p= new JPanel();
        p.setSize(700,200);
        p.add(l);
        p.add(l1);
        p.add(j1);
        p.add(j2);
        sp.setSize(200,300);
        f.add(sp);
        f.add(p,"South");
        f.setSize(700,700);
        f.show();

    }

    public Problema2(String name, String author, String iconName) {
        this.name = name;
        this.author = author;
        this.iconName = iconName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIconName() {
        return iconName;
    }


    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public String toString() {
        return name + author +iconName;
    }

    public static void main(String[] args) {
        Problema2 book = new Problema2();
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if(listBook.isSelectionEmpty())
            return;
        else {
            int a;
            a =listBook.getSelectedIndex();
            j1.setText(lista.get(a).name);
            j2.setText(lista.get(a).author);
        }


    }
}
