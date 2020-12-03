package com.exercicio9;

public abstract class TwoDimensionalShape implements Shape{
    public abstract double getArea();

    public void imprime(){
        System.out.printf("\nA área é %.1f.", getArea());
    }

}
