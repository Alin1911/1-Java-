/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

import com.sun.javafx.geom.Vec2f;

import javax.swing.*;
import java.util.Vector;

/**
 *
 * @author Nan Mihai
 */
public class Book {
    private String name;
    private String author;
    private String iconName;
    Vector<Book> lista;
    JFrame f;
    JLabel l;

    public Book(){
        f = new JFrame("Problema 1");
        l = new JLabel();
        this.lista = new Vector<Book>(3);
        for (int i=0; i < 30; i++){
            this.lista.addElement(new Book(" Ana are mere "," Alin "," abcd "));
            this.lista.addElement(new Book(" Ana nu are mere "," Bacovia "," abcd "));
            this.lista.addElement(new Book(" Ana vrea mere "," Ion "," abcd "));
            this.lista.addElement(new Book(" Ana cere mere "," Elminescu "," abcd "));
            this.lista.addElement(new Book(" Ana fura mere "," Hotu "," abcd "));
            this.lista.addElement(new Book(" Ana cumpara mere "," Vanzatoarea "," abcd "));
        }
        JList lis = new JList(lista);

        JScrollPane sp = new JScrollPane(lis);

        f.add(sp);
        f.setSize(500,200);
        f.show();

    }

    public Book(String name, String author, String iconName) {
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

    public String toString()
    {
        return iconName + name + author;
    }

    public static void main(String[] args) {
        Book book = new Book();
     }
}
