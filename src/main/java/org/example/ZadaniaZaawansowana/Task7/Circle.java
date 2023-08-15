package org.example.ZadaniaZaawansowana.Task7;

public class Circle implements GeometricObject{

    protected float radius;

    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2)*Math.PI;
    }
}
