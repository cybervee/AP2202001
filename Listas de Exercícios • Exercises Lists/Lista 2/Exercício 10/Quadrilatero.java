package com.exercicio10;

public abstract class Quadrilatero implements FormaGeometrica{
    private double l1, l2, l3, l4;

    public Quadrilatero(double l1, double l2, double l3, double l4) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
    }

    public Quadrilatero() {
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    public double getL4() {
        return l4;
    }

    public void setL4(double l4) {
        this.l4 = l4;
    }

    public double calculaPerimetro(){
        return getL1() + getL2() + getL3() + getL4();
    }

}
