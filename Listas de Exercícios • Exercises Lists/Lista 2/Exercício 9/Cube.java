package com.exercicio9;

public class Cube extends ThreeDimensionalShape {
    private double aresta;

    public Cube(double aresta) {
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double getArea() {
        return Math.pow(aresta, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(aresta, 3);
    }

}
