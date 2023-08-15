package org.example.ZadaniaZaawansowana.Task1;

public class Line {

    Point2D p1, p2;

    public Line(Point2D p1, Point2D p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(float p1X, float p1Y, float p2X, float p2Y){
        this.p1 = new Point2D(p1X, p1Y);
        this.p2 = new Point2D(p2X, p2Y);
    }

    public Point2D getP1() {
        return p1;
    }

    public void setP1(Point2D p1) {
        this.p1 = p1;
    }

    public Point2D getP2() {
        return p2;
    }

    public void setP2(Point2D p2) {
        this.p2 = p2;
    }

    public float getLength(){
        return (float) Math.sqrt((Math.pow(p2.x - p1.x, 2) +
                Math.pow(p2.y - p1.y, 2)));
    }

}