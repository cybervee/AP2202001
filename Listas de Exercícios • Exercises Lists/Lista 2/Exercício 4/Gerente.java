package com.exercicio4;

public class Gerente extends Empregado{
    private String senha;

    //construtor
    public Gerente(String nome, String cpf, double salario, String senha){
        super(nome, cpf, salario);
        this.senha = senha;
    }

    //getter
    public String getSenha(){
        return this.senha;
    }

    //setter
    public void setSenha(String senha){
        this.senha = senha;
    }

    //métodos
    @Override
    public void imprimeDados(){
        System.out.printf("\n***Dados do gerente***\nNome: %s\nCPF: %s\nSalário: %.2f\n", super.getNome(), super.getCPF(), super.getSalario());
    }
}
