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

    public float getArea(){
        return (float) (width*length);

    }

    public float getPerimeter(){
        return (float)(2*(width+length));
    }

    @Override
    public String toString() {
        return String.format("Rectangle with width=%f and length=%f which is a subclass off %f", width, length, super.toString());
        //super.toString() wywoluje metode toString z wyzszej klasy
    }
}
