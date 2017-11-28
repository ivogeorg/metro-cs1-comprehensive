package edu.msud.cs.cs1;

import java.util.ArrayList;

public abstract class Geometric {
    private static final int INIT_NUM_GEOMS = 20;

    private static ArrayList<Geometric> shapes;

    // static initialization block
    static {
        shapes = new ArrayList<>(INIT_NUM_GEOMS);
    }

    // position in space
    protected double x, y;

    Geometric(double x, double y) {
        this.x = x;
        this.y = y;
        shapes.add(this);
    }

    // abstract method
    public abstract double getArea();

    public static ArrayList<Geometric> getShapes() {
        return new ArrayList<>(shapes);
    }

    public static int getNumShapes() {
        return shapes.size();
    }

    public static void main(String[] args) {
        final int NUM_EACH = 5;
        final double JITTER = 0.095;

        for (int i=0; i<NUM_EACH; i++) {
            Elipsoid elipse = new Elipsoid(
                    2 + Math.pow(-1, Math.round(Math.random())) * JITTER,
                    3 + Math.pow(-1, Math.round(Math.random())) * JITTER,
                    2 + Math.pow(-1, Math.round(Math.random())) * JITTER,
                    1 + Math.pow(-1, Math.round(Math.random())) * JITTER);
        }
        for (int i=0; i<NUM_EACH; i++) {
            Circle circle = new Circle(
                    -3 + Math.pow(-1, Math.round(Math.random())) * JITTER,
                    -2 + Math.pow(-1, Math.round(Math.random())) * JITTER,
                    3 + Math.pow(-1, Math.round(Math.random())) * JITTER);
        }
//        for (int i=0; i<NUM_EACH; i++) {
//            Parallelogram parallelogram = new Parallelogram(
//                    1.5 + Math.pow(-1, Math.round(Math.random())) * JITTER,
//                    1.7 + Math.pow(-1, Math.round(Math.random())) * JITTER,
//                    4.2 + Math.pow(-1, Math.round(Math.random())) * JITTER,
//                    1.3 + Math.pow(-1, Math.round(Math.random())) * JITTER,
//                    0.3 * Math.PI + Math.pow(-1, Math.round(Math.random())) * JITTER);
//        }
//        for (int i=0; i<NUM_EACH; i++) {
//            Rectangle rectangle = new Rectangle(
//                    -1.5 + Math.pow(-1, Math.round(Math.random())) * JITTER,
//                    -1.7 + Math.pow(-1, Math.round(Math.random())) * JITTER,
//                    4.2 + Math.pow(-1, Math.round(Math.random())) * JITTER,
//                    1.3 + Math.pow(-1, Math.round(Math.random())) * JITTER);
//        }
//        for (int i=0; i<NUM_EACH; i++) {
//            Square square = new Square(
//                    -1.5 + Math.pow(-1, Math.round(Math.random())) * JITTER,
//                    -1.7 + Math.pow(-1, Math.round(Math.random())) * JITTER,
//                    3.7 + Math.pow(-1, Math.round(Math.random())) * JITTER);
//        }
//        for (int i=0; i<NUM_EACH; i++) {
//            Rhombus rhombus = new Rhombus(
//                    2.5 + Math.pow(-1, Math.round(Math.random())) * JITTER,
//                    -1.7 + Math.pow(-1, Math.round(Math.random())) * JITTER,
//                    2.8 + Math.pow(-1, Math.round(Math.random())) * JITTER,
//                    1.9 + Math.pow(-1, Math.round(Math.random())) * JITTER);
//        }
        System.out.println("Number of shapes: " + Geometric.getNumShapes());
        for (Geometric shape: Geometric.getShapes())
            System.out.println(shape + " (Area: " + shape.getArea() + ")");
    }
}
