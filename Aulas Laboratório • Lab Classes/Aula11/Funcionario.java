/*Exercício 2: Crie uma classe Funcionario que possua os
seguintes atributos: nome, codigo e salario. Forneça o
construtor que inicialize todos os atributos. Implemente os
métodos get e set, além de um método para aumentar o
salário (baseado em porcentagem fornecida como
parâmetro) e um método para imprimir todos os dados do
funcionário.
• Na classe principal, crie, no mínimo, 5 funcionários em um
ArrayList e teste seus métodos.*/

public class Funcionario{
  private String nome;
  private String codigo;
  private double salario;

  //construtores
  public Funcionario(String nome, String codigo, double salario){
    this.nome = nome;
    this.codigo = codigo;
    this.salario = salario;
  }

  //getters
  public String getNome(){
    return this.nome;
  }

  public String getCodigo(){
    return this.codigo;
  }

  public double getSalario(){
    return this.salario;
  }

  //setters
  public void setNome(String nome){
    this.nome = nome;
  }

  public void setCodigo(String codigo){
    this.codigo = codigo;
  }

  public void setSalario(double salario){
    this.salario = salario;
  }

  //métodos
  public void aumentarSalario(float porcentagem){
    this.salario = getSalario() + (getSalario() * (porcentagem / 100));
    setSalario(salario);
    System.out.printf("\nO salário do funcionário %s teve um reajuste de %.1f por cento, passando para R$ %.2f.", getNome(), porcentagem, getSalario());
  }

  public void imprimirDados(){
    System.out.printf("\nO funcionário %s possui o código %s e recebe R$ %.2f por mês.", getNome(), getCodigo(), getSalario());
  }
}