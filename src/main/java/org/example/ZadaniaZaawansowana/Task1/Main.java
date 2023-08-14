package org.example.ZadaniaZaawansowana.Task1;

public class Main {
    public static void main(String[] args) {

        Point2D point2D = new Point2D(5.0f,7.0f);
        Point3D point3D = new Point3D(10.0f, 20.0f, 30.0f);
        System.out.println(point2D.getX());

        System.out.println("Tablica");
        float[] tablica = point2D.getXY();
        for (float v : tablica) {
            System.out.println(v);
        }

        point2D.setXY(4.0f, 11.5f);
        System.out.println(point2D);

        System.out.println(point3D);
        }

    }


