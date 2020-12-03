package com.exercicio2;

public class ContaCorrente{
    private double saldo;

    //construtores
    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }

    public ContaCorrente(){

    }

    //getter
    public double getSaldo(){
        return this.saldo;
    }

    //setter
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //métodos
    public void saque(double saque){
        if(saldo > saque){
            setSaldo((saldo - saque) - (saque * 0.005));
        }
        else{
            System.out.println("Erro! Saldo insuficiente para saque. Operação não realizada.");
        }
    }

    public void deposito(double deposito){
        setSaldo(deposito + saldo);
    }

    public void saldo(){
        System.out.println(getSaldo());
    }
}
