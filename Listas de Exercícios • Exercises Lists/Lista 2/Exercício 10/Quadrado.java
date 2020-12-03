package com.exercicio10;

import java.util.Scanner;

public class Quadrado extends Quadrilatero {
    private double l;

    public Quadrado(double l) {
        this.l = l;
    }

    public Quadrado() {

    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    @Override
    public double calculaPerimetro() {
        return getL() * 4;
    }

    @Override
    public double calculaArea() {
        return Math.pow(getL(), 2);
    }

    @Override
    public void imprime() {
        System.out.printf("\nO lado do quadrado é %.1f. \nPerímetro: %.1f \nÁrea: %.1f", getL(), calculaPerimetro(), calculaArea());
    }

    @Override
    public void entraDados() {
        Scanner leitura = new Scanner(System.in);
        System.out.printf("\nDigite o lado: ");
        double l = leitura.nextDouble();
        setL(l);
    }
}
