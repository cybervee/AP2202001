package com.exercicio2;

public class ClienteEspecial extends ContaCorrente{
    //construtor
    public ClienteEspecial(double saldo){
        super(saldo);
    }

    //métodos
    @Override
    public void saque(double saque){
        if(super.getSaldo() > saque){
            super.setSaldo((super.getSaldo() - saque) - (saque * 0.001));
        }
        else{
            System.out.println("Erro! Saldo insuficiente para saque. Operação não realizada.");
        }
    }

    @Override
    public void deposito(double deposito){
        super.setSaldo(deposito + super.getSaldo());
    }

    @Override
    public void saldo(){
        System.out.println(super.getSaldo());
    }
}
