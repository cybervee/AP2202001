//aluna: veronica bertolucci scislewski
//matrícula: 201800216

package com.exercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<FormaGeometrica> listaFormas = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);
        /*FormaGeometrica circulo = new Circulo(5);
        listaFormas.add(circulo);
        Quadrilatero quadrado = new Quadrado(5);
        listaFormas.add(quadrado);
        Quadrilatero retangulo = new Retangulo(7, 13);
        listaFormas.add(retangulo);*/
        System.out.printf("\n*** Lista de Formas Geométricas ***\n");
        String escolha2;
        do{
            System.out.printf("1. Círculo\n");
            System.out.printf("2. Quadrado\n");
            System.out.printf("3. Retângulo\n");
            System.out.printf("Digite o número da operação que deseja: ");
            int escolha1 = leitura.nextInt();
            switch(escolha1){
                case 1:
                    FormaGeometrica circulo = new Circulo();
                    circulo.entraDados();
                    listaFormas.add(circulo);
                    break;
                case 2:
                    Quadrilatero quadrado = new Quadrado();
                    quadrado.entraDados();
                    listaFormas.add(quadrado);
                    break;
                case 3:
                    Quadrilatero retangulo = new Retangulo();
                    retangulo.entraDados();
                    listaFormas.add(retangulo);
                    break;
            }
            System.out.printf("\nGostaria de adicionar outra forma? S/N: ");
            escolha2 = leitura.next();
        }while(escolha2.equals("s") || escolha2.equals("S"));

        for (int i = 0; i < listaFormas.size(); i++) {
            listaFormas.get(i).imprime();
        }
    }
}