package org.example.ZadaniaZaawansowana.Task3;

public class Rectangle extends Shape{

    double area, width, length;

    Rectangle(Color color, boolean isFilled){
        super.color = Color.UNKNOWN;
        super.isFilled = false;
        this.width =1;
        this.length=1;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;

    }

    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width=%f and length=%f which is a subclass off %f", width, length, super.toString());
    }
}
