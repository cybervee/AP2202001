package com.exercicio4;

public class TestaEmpregadoEGerente {
    public void testaEmpregadoEGerente(){
        Empregado e1 = new Empregado("João", "123.456.78-90", 1045.50);
        Empregado g1 = new Gerente("Roberto", "098.765.43-21", 5710.70, "1234");
        e1.imprimeDados();
        g1.imprimeDados();
    }
}
