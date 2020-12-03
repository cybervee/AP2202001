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

public class Antigo extends Imovel{
  //construtor
  public Antigo(String endereco, double preco){
    super(endereco, preco);
  }

  //métodos
  public double getPreco(){
    return (super.getPreco() - (0.1 * super.getPreco()));
  }

  public void imprimePreco(){
    System.out.printf("\nO preço do imóvel antigo é R$ %.2f, com a taxa de desconto de 10 por cento.", getPreco());
  }
}