public class Funcionario{
  private String nome;
  private int nro_pis;
  private double salario;

  //construtores
  public Funcionario(String nome, int nro_pis, double salario){
    this.nome = nome;
    this.nro_pis = nro_pis;
    this.salario = salario;
  }

  public Funcionario(){
    nome = "vazio";
    nro_pis = 0;
    salario = 0.0;
  }

  //getters
  public String getNome(){
    return this.nome;
  }

  public int getNro_pis(){
    return this.nro_pis;
  }
  
  public double getSalario(){
    return this.salario;
  }

  //setters
  public void setNome(String nome){
    this.nome = nome;
  }

  public void setNro_pis(int nro_pis){
    this.nro_pis = nro_pis;
  }

  public void setSalario(double salario){
    this.salario = salario;
  }

  //métodos
  public void exibeDados(){
    System.out.printf("\nO funcionário %s possui o número PIS %d e recebe R$%.2f por mês.", getNome(), getNro_pis(), getSalario());
  }

  public void calcularSalario(int horas){
    setSalario(this.getSalario() + horas * 30.5);
  }
}