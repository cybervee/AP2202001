package com.exercicio6;

public class Gerente extends Empregado{
    private String senha;

    //construtor
    public Gerente(String nome, String cpf, double salario, String senha){
        super(nome, cpf, salario);
        this.senha = senha;
    }

    //setter
    public void setSenha(String senha){
        this.senha = senha;
    }

    //getter
    public String getSenha(){
        return this.senha;
    }

    //métodos
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

    @Override
    public double getBonificacao(){
        super.setSalario(salario + (salario * 0.15));
        return super.getSalario();
    }
}
