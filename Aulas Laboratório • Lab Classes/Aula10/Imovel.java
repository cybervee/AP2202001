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

public class Imovel{
  private String endereco;
  private double preco;

  //construtor
  public Imovel(String endereco, double preco){
    this.endereco = endereco;
    this.preco = preco;
  }

  //getters
  public String getEndereco(){
    return this.endereco;
  }

  public double getPreco(){
    return this.preco;
  }

  //setters
  public void setEndereco(String endereco){
    this.endereco = endereco;
  }

  public void setPreco(double preco){
    this.preco = preco;
  }

  //métodos
  public void imprimeEndereco(){
    System.out.printf("\nO endereço do imóvel é %s.", endereco);
  }

  public void imprimePreco(){
    System.out.printf("\nO preço do imóvel é R$ %.2f.", getPreco());
  }
}