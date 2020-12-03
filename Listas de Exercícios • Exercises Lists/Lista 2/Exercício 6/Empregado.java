package com.exercicio6;

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

    public Empregado(){
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
    public double getBonificacao(){
        this.setSalario(salario + (salario * 0.1));
        return this.getSalario();
    }
}
