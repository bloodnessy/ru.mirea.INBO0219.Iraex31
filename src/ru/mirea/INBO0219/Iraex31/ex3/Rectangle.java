package ru.mirea.INBO0219.Iraex31.ex3;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle() {}
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
