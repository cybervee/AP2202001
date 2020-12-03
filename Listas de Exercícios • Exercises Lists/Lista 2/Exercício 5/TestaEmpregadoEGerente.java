package com.exercicio5;

public class TestaEmpregadoEGerente {
    public void testaEmpregadoEGerente(){
        Gerente g1 = new Gerente("Roberto", "098.765.43-21", 5710.70, "1234");
        System.out.println(g1.imprimeNome());
        g1.autentica("123");
        g1.autentica("1234");
    }
}
