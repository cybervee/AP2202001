package com.exercicio4;

public class Empregado{
    protected String nome;
    protected String cpf;
    protected double salario;

    //construtores
    public Empregado(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    //getters
    public String getNome(){
        return this.nome;
    }

    public String getCPF(){
        return this.cpf;
    }

    public double getSalario(){
        return this.salario;
    }

    //setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    //métodos
    public void imprimeDados(){
        System.out.printf("\n***Dados do empregado***\nNome: %s\nCPF: %s\nSalário: %.2f", getNome(), getCPF(), getSalario());
    }
}
