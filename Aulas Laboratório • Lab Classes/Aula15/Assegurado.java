import java.util.Scanner;

public class Assegurado extends Paciente{
  private String seguradora;
  private int numSeguro;

  public Assegurado(String nome, String seguradora, int numSeguro){
    super(nome);
    this.seguradora = seguradora;
    this.numSeguro = numSeguro;
  }

  public Assegurado(){
  }

  public String getSeguradora(){
    return this.seguradora;
  }

  public int getNumSeguro(){
    return this.numSeguro;
  }

  public void setSeguradora(String seguradora){
    this.seguradora = seguradora;
  }

  public void setNumSeguro(int numSeguro){
    this.numSeguro = numSeguro;
  }

  public void getSeguro(){
    System.out.printf("Dados do seguro: \nSeguradora: %s\nNúmero do seguro: %d", getSeguradora(), getNumSeguro());
  }

  @Override
  public void print(){
    System.out.printf("\nO paciente %s é assegurado.\n", super.getNome());
    getSeguro();
  }

  @Override
  public void entraDados(){
    Scanner leitura = new Scanner(System.in);
    System.out.printf("Digite o nome do paciente: ");
    String nome = leitura.next();
    super.setNome(nome);
    System.out.printf("Digite a seguradora: ");
    String seguradora = leitura.next();
    setSeguradora(seguradora);
    System.out.printf("Digite o número do seguro: ");
    int numSeguro = leitura.nextInt();
    setNumSeguro(numSeguro);
  }
}