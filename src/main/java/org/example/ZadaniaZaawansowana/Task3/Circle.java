package org.example.ZadaniaZaawansowana.Task3;

public class Circle extends Shape{

    float radius;

    public Circle(){
        super.color = Color.UNKNOWN;
        super.isFilled = false;
        this.radius= 1;
    }


    public Circle(Color color, boolean isFilled, float radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getArea(){
        return (float) (radius*radius*Math.PI);
    }

    public float getPerimeter(){
        return (float) (2*radius*Math.PI);
    }

    @Override
    public String toString() {
        return String.format("Circle with radius= %f which is a subclass off %f ", radius, super.toString() );
    }
}
