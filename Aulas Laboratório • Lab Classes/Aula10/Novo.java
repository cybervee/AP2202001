/*Exercício 2: Crie a classe Imovel, que possui um endereço e um
preço, além de um método imprimeEndereco() e imprimePreco().
a. Crie uma classe Novo, que herda Imovel e possui um adicional de
20% no preço. Crie métodos de acesso e de modificação para as
variáveis de instância, além de sobrescrever o método de impressão
do valor do Imovel.
b. Crie uma classe Antigo, que herda Imovel e possui um desconto de
10% no preço. Crie métodos de acesso e de modificação para as
variáveis de instância, além de sobrescrever o método de impressão
do valor do Imovel com desconto.
Implemente a classe principal (Main) e crie objetos para as três
classes e teste seus métodos.
Obs.: Implemente, também, os construtores.*/

public class Novo extends Imovel{
  //construtor
  public Novo(String endereco, double preco){
    super(endereco, preco);
  }

  //métodos
  public double getPreco(){
    return (super.getPreco() + (0.2 * super.getPreco()));
  }

  public void imprimePreco(){
    System.out.printf("\nO preço do imóvel novo é R$ %.2f, acrescido com a taxa de 20 por cento.", getPreco());
  }
}