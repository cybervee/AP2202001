package com.exercicio9;

public abstract class ThreeDimensionalShape implements Shape{
    public abstract double getArea();
    public abstract double getVolume();

    public void imprime(){
        System.out.printf("\nA área é %.1f.", getArea());
        System.out.printf("\nO volume é %.1f.", getVolume());
    }
}