/*Exercício 1: Crie uma classe para representar uma conta corrente,
com métodos para depositar uma quantia, sacar uma quantia e
obter o saldo. Para cada saque será debitada também uma taxa de
operação equivalente à 0,5% do valor sacado. Crie, em seguida,
uma subclasse da classe anterior para representar uma conta
corrente de um cliente especial. Clientes especiais pagam taxas de
operação de apenas 0,1% do valor sacado.
Implemente a classe principal (Main), faça testes com as classes e
verifique seus resultados. Além disso, defina os atributos de uma conta
corrente, implemente os construtores e forneça um método para
imprimir os valores das contas.*/

public class Conta{
  private String nome;
  private double saldo;

  //construtores
  public Conta(String nome, double saldo){
    this.nome = nome;
    this.saldo = saldo;
  }

  //getters
  public double getSaldo(){
    return this.saldo;
  }

  public String getNome(){
    return this.nome;
  }

  //setters
  public void setSaldo(double saldo){
    this.saldo = saldo;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  //métodos
  public void depositar(double quantiaDeposito){
    this.saldo = saldo + quantiaDeposito;
    setSaldo(saldo);
  }

  public void sacar(double quantiaSaque){
    this.saldo = (saldo - quantiaSaque) - (0.05 * quantiaSaque);
    setSaldo(saldo);
  }

  public void imprimir(){
    System.out.printf("\nO saldo do cliente %s é R$ %.2f.", getNome(), getSaldo());
  }
}