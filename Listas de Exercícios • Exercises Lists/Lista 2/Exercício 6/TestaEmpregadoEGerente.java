package com.exercicio6;

public class TestaEmpregadoEGerente {
    public void testaEmpregadoEGerente(){
        Empregado e1 = new Empregado("João", "123.456.78-90", 700);
        Empregado g1 = new Gerente("Roberto", "098.765.43-21", 2000, "1234");
        System.out.printf("O novo salário é R$ %.2f.", e1.getBonificacao());
        System.out.printf("O novo salário é R$ %.2f.", g1.getBonificacao());
    }
}