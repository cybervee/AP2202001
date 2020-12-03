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

public class ContaEspecial extends Conta{
  public ContaEspecial(String nome, double saldo){
    super(nome, saldo);
  }

  public void sacar(double quantiaSaque){
    super.setSaldo((super.getSaldo() - quantiaSaque) - (0.01 * quantiaSaque));
  }
}