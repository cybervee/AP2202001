import java.util.Scanner;

public class NaoAssegurado extends Paciente{
  private float consulta;
  private int banco;
  private int cheque;

  public NaoAssegurado(String nome, float consulta, int banco, int cheque){
    super(nome);
    this.consulta = consulta;
    this.banco = banco;
    this.cheque = cheque;
  }

  public NaoAssegurado(){
  }

  public float getConsulta(){
    return this.consulta;
  }

  public int getBanco(){
    return this.banco;
  }

  public int getCheque(){
    return this.cheque;
  }

  public void setConsulta(float consulta){
    this.consulta = consulta;
  }

  public void setBanco(int banco){
    this.banco = banco;
  }

  public void setCheque(int cheque){
    this.cheque = cheque;

  }

  public void getValor(){
    System.out.printf("Valor da consulta: R$ %.2f\nBanco: %d\nCheque: %d", getConsulta(), getBanco(), getCheque());
  }

  @Override
  public void print(){
    System.out.printf("\nO paciente %s não é assegurado.\n", super.getNome());
    getValor();
  }

  @Override
  public void entraDados(){
    Scanner leitura = new Scanner(System.in);
    System.out.printf("Digite o nome do paciente:");
    String nome = leitura.next();
    super.setNome(nome);
    System.out.printf("Digite o valor da consulta:");
    float consulta = leitura.nextFloat();
    setConsulta(consulta);
    System.out.printf("Digite o número do banco:");
    int banco = leitura.nextInt();
    setBanco(banco);
    System.out.printf("Digite o valor do cheque:");
    int cheque = leitura.nextInt();
    setCheque(cheque);
  }
}