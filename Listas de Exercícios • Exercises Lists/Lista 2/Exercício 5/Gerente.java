package com.exercicio5;

public class Gerente extends Empregado{
    private String senha;

    public Gerente(String nome, String cpf, double salario, String senha){
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public String getSenha(){
        return this.senha;
    }

    public String imprimeNome(){
        return super.nome;
    }

    public void autentica(String senha){
        if(this.getSenha().equals(senha)){
            System.out.println("Acesso permitido!");
        }
        else{
            System.out.println("Acesso não permitido!");
        }
    }
}
