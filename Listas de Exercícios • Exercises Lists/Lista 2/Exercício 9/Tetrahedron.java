package com.exercicio9;

public class Tetrahedron extends ThreeDimensionalShape {
    private double x;

    public Tetrahedron(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double getArea() {
        return Math.pow(x, 2) * Math.sqrt(3);
    }

    @Override
    public double getVolume() {
        return (Math.pow(x, 3) * Math.sqrt(2)) / 12;
    }

}
