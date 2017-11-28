package edu.msud.cs.cs1;

public class Circle extends Elipsoid {

    Circle(double x, double y, double r) {
        super(x, y, r, r);
    }

    @Override
    public String toString() {
        return String.format("Cirle: x=%f y=%f r=%f", x, y, semiMajor);
    }

}
