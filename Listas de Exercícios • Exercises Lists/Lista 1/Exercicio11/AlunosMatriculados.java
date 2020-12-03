import java.util.Scanner;

public class AlunosMatriculados {
  private String nome, matricula;
  private double notaProva1;
  private double notaProva2;
  private double notaTrabalho;

  // construtores
  public AlunosMatriculados(String nome, String matricula, double notaProva1, double notaProva2, double notaTrabalho) {
    this.nome = nome;
    this.matricula = matricula;
    this.notaProva1 = notaProva1;
    this.notaProva2 = notaProva2;
    this.notaTrabalho = notaTrabalho;
  }

  public AlunosMatriculados() {
    nome = "vazio";
    matricula = "vazio";
    notaProva1 = 0;
    notaProva2 = 0;
    notaTrabalho = 0;
  }

  // getters
  public String getNome() {
    return this.nome;
  }

  public String getMatricula() {
    return this.matricula;
  }

  public double getNotaProva1() {
    return this.notaProva1;
  }

  public double getNotaProva2() {
    return this.notaProva2;
  }

  public double getNotaTrabalho() {
    return this.notaTrabalho;
  }

  // setters
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public void setNotaProva1(double notaProva1) {
    this.notaProva1 = notaProva1;
  }

  public void setNotaProva2(double notaProva2) {
    this.notaProva2 = notaProva2;
  }

  public void setNotaTrabalho(double notaTrabalho) {
    this.notaTrabalho = notaTrabalho;
  }

  // métodos
  public void entraDados() {
    Scanner leitura = new Scanner(System.in);
    System.out.print("Digite o nome do aluno: ");
    String nome = leitura.next();
    setNome(nome);
    System.out.print("\nDigite a matricula: ");
    String matricula = leitura.next();
    setMatricula(matricula);
    System.out.print("\nDigite a nota da prova 1: ");
    double notaProva1 = leitura.nextDouble();
    setNotaProva1(notaProva1);
    System.out.print("\nDigite a nota da prova 2: ");
    double notaProva2 = leitura.nextDouble();
    setNotaProva2(notaProva2);
    System.out.print("\nDigite a nota do trabalho: ");
    double notaTrabalho = leitura.nextDouble();
    setNotaTrabalho(notaTrabalho);
    leitura.close();
  }

  public double calculaMediaFinal() {
    double mediaFinal = (((getNotaProva1() * 2.5f) + (getNotaProva2() * 2.5f) + (getNotaTrabalho() * 2.0f)) / 7);
    if(mediaFinal>=6.0){
      return 0;
    } 
    else {
      return calculaNotaProvaFinal(mediaFinal);
    }
  }

  public double calculaNotaProvaFinal(double mediaFinal){
    double notaProvaFinal = ((57 - (getNotaProva1() * 2.5f) - (getNotaProva2() * 2.5f) - (getNotaTrabalho() * 2.0f)) / 2.5f);
    return notaProvaFinal;
  }

  public void imprimeResultado() {
    System.out.printf("\nO aluno %s, com a matrícula %s, precisa tirar %.1f na prova final.\n", getNome(), getMatricula(), calculaMediaFinal());
  }
}