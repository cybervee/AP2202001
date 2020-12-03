package com.exercicio9;

public class Square extends TwoDimensionalShape{
    private double x;

    public Square(int x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public double getArea() {
        return Math.pow(x, 2);
    }

}