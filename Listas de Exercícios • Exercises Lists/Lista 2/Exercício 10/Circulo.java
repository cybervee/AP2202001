package com.exercicio10;

import java.util.Scanner;

public class Circulo implements FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * Math.PI * getRaio();
    }

    @Override
    public double calculaArea() {
        return Math.PI * Math.pow(getRaio(), 2);
    }

    public void imprime() {
        System.out.printf("\nO raio do círculo é %.1f. \nPerímetro: %.1f \nÁrea: %.1f", getRaio(), calculaPerimetro(), calculaArea());
    }

    @Override
    public void entraDados() {
        Scanner leitura = new Scanner(System.in);
        System.out.printf("\nDigite o raio: ");
        double raio = leitura.nextDouble();
        setRaio(raio);
    }
}
