package org.example.ZadaniaZaawansowana.Task3;

public abstract class Shape {

    protected Color color;
    protected boolean isFilled;

    public Shape(){
        this.color = Color.UNKNOWN;
        this.isFilled = false;
    }

    public Shape(Color color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public Color getColor() {
        return color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public abstract float getArea();
    public abstract float getPerimeter();

    @Override
    public String toString() {
        return String.format("Shape with color of %s and %s",
                color, isFilled ? "filled" : "NotFilled");

    }
}

