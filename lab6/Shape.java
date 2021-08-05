import sun.awt.geom.AreaOp;

import java.awt.geom.Area;
import java.util.Collections;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this("red", true);
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
class Circle extends Shape
{
    private double radius;
    final double pi = Math.PI;
    public Circle()
    {
        this.radius = 1;
    }
    public Circle(double radius)
    {
        super("red",true);
        this.radius = radius;
    }

    public Circle(double radius,String color,boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }
    double getRadius(){
        return this.radius;
    }

    void setRadius(double radius){
        this.radius=radius;
    }

    public double getArea()
    {
        return (pi * Math.pow(radius, 2));
    }

    public double getPerimeter()
    {
        return (2 * pi * radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }
}

class Rectangle extends Shape
{
    private double width, length;
    public Rectangle()
    {
        super("red",true);
        this.width = 1;
        this.length = 1;
    }
    public Rectangle(double width, double length)
    {
        super("red",true);
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color,boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    double getWidth(){
        return this.width;
    }
    void setWidth(double width){
        this.width=width;
    }

    double getLength(){
        return  this.length;
    }

    void setLength(double length){
        this.length=length;
    }

    public double getArea()
    {
        return width * length;
    }

    public double getPerimeter()
    {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
class Square extends Rectangle
{
    Square()
    {
        super(1,1,"red",true);
    }
    Square(double side){
        super(side, side);
    }
    Square(double side, String color,boolean filled){
        super(side, side,color,filled);
    }
    double getSide(){
        return this.getWidth();
    }
    void setSide(double side){
        this.setWidth(side);
        this.setLength(side);
    }

    void setWidth(double side){
        this.setWidth(side);
    }
    void setLength(double side){
        this.setLength(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

