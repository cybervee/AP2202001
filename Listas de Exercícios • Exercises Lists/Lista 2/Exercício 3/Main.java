//aluna: veronica bertolucci scislewski
//matrícula: 201800216

package com.exercicio3;

public class Main {

    public static void main(String[] args) {
        Parallelogram p1 = new Parallelogram(2, 2,7,2,13,21,5,21);
        p1.imprime();
        Rectangle r1 = new Rectangle(7,5,17,15,17,6,13,5);
        r1.imprime();
        Square s1 = new Square(3,0,5,0,3,3,3,3);
        s1.imprime();
        Trapezoid t1 = new Trapezoid(0,0,13,0,7,3,1,3);
        t1.imprime();
    }
}