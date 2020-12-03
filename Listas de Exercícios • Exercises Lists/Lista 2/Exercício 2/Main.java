//aluna: veronica bertolucci scislewski
//matrícula: 201800216

package com.exercicio2;

class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(200);
        c1.saque(10);
        c1.saldo();
        c1.deposito(50);
        c1.saldo();
        c1.saque(500);
        ContaCorrente c2 = new ClienteEspecial(200);
        c2.saque(10);
        c2.saldo();
        c2.deposito(50);
        c2.saldo();
        c2.saque(500);
    }
}