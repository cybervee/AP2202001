package com.exercicio3;

public class Parallelogram extends Quadrilateral {
    public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    @Override
    public void imprime(){
        System.out.printf("As coordenadas do paralelograma são: ");
        imprimeCoordenadas();
        System.out.printf("Largura:");
        getLargura();
        System.out.printf("Altura: ");
        getAltura();
        System.out.printf("Área: ");
        getArea();
    }
}
