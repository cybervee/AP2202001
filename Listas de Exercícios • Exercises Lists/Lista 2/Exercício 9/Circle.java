package com.exercicio9;

public class Circle extends TwoDimensionalShape {
    private double raio;

    public Circle(int raio){
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
        return Math.PI * Math.pow(raio, 2);
    }

}
