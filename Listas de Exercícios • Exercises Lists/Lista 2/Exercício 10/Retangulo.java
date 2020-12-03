package com.exercicio10;

import java.util.Scanner;

public class Retangulo extends Quadrilatero {
    private double b;
    private double h;

    public Retangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public Retangulo() {

    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calculaPerimetro() {
        return (getB() * 2) + (getH() * 2);
    }

    @Override
    public double calculaArea() {
        return getH() * getB();
    }

    @Override
    public void imprime() {
        System.out.printf("\nA base do retângulo é %.1f. \nA altura é %.1f. \nPerímetro: %.1f \nÁrea: %.1f", getB(), getH(), calculaPerimetro(), calculaArea());
    }

    @Override
    public void entraDados() {
        Scanner leitura = new Scanner(System.in);
        System.out.printf("\nDigite a base: ");
        double b = leitura.nextDouble();
        setB(b);
        System.out.printf("\nDigite a altura: ");
        double h = leitura.nextDouble();
        setH(h);
    }
}
