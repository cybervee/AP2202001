//aluna: veronica bertolucci scislewski
//matrícula: 201800216

package com.exercicio9;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> listaFormas = new ArrayList<>();
        TwoDimensionalShape circulo = new Circle(5);
        listaFormas.add(circulo);
        circulo.imprime();
        TwoDimensionalShape quadrado = new Square(2);
        listaFormas.add(quadrado);
        quadrado.imprime();
        TwoDimensionalShape triangulo = new Triangle(4, 9);
        listaFormas.add(triangulo);
        triangulo.imprime();
        ThreeDimensionalShape esfera = new Sphere(7);
        listaFormas.add(esfera);
        esfera.imprime();
        ThreeDimensionalShape cubo = new Cube(13);
        listaFormas.add(cubo);
        cubo.imprime();
        ThreeDimensionalShape tetraedro = new Tetrahedron(7);
        listaFormas.add(tetraedro);
        tetraedro.imprime();
        System.out.println(listaFormas.size());

        for(Shape forma : listaFormas){
            if(forma instanceof TwoDimensionalShape ){
                ((TwoDimensionalShape) forma).imprime();
            }
            if(forma instanceof ThreeDimensionalShape){
                ((ThreeDimensionalShape) forma).imprime();
            }
        }
    }
}