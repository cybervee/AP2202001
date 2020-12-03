package com.exercicio9;

public class Sphere extends ThreeDimensionalShape {
    private double raio;

    public Sphere(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(raio, 2) * 4;
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(raio, 3) /3);
    }

}
