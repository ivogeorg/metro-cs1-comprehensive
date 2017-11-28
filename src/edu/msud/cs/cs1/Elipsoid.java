package edu.msud.cs.cs1;

public class Elipsoid extends Geometric {

    protected double semiMajor, semiMinor;

    Elipsoid(double x, double y, double semiMajor, double semiMinor) {
        super(x, y);
        this.semiMajor = semiMajor;
        this.semiMinor = semiMinor;
    }

    @Override
    public double getArea() {
        return Math.PI * semiMinor * semiMinor;
    }

    @Override
    public String toString() {
        return String.format("Elipsoid: x=%f y=%f semiMaj=%f semiMin=%f", x, y, semiMajor, semiMinor);
    }
}
