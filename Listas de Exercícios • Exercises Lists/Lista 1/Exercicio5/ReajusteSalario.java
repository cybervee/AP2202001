import java.util.Scanner;

public class ReajusteSalario{
  private String nome;
  private double salario;
  private double salarioMinimo;
  private double salarioReajustado;
  private double reajuste;

  //construtores
  public ReajusteSalario(){
    nome = "vazio";
    salario = 0;
    salarioMinimo = 0;
  }

  public ReajusteSalario(String nome, double salario, double salarioMinimo){
    this.nome = nome;
    this.salario = salario;
    this.salarioMinimo = salarioMinimo;
  }

  //getters
  public String getNome(){
    return this.nome;
  }

  public double getSalario(){
    return this.salario;
  }

  public double getSalarioMinimo(){
    return this.salarioMinimo;
  }

  public double getSalarioReajustado(){
    return this.salarioReajustado;
  }

  public double getReajuste(){
    return this.reajuste;
  }

  //setters
  public void setNome(String nome){
    this.nome = nome;
  }

  public void setSalario(double salario){
    this.salario = salario;
  }

  public void setSalarioMinimo(double salarioMinimo){
    this.salarioMinimo = salarioMinimo;
  }

  public void setSalarioReajustado(double salarioReajustado){
    this.salarioReajustado = salarioReajustado;
  }

  public void setReajuste(double reajuste){
    this.reajuste = reajuste;
  }

  //métodos
  public void entraDados(){
    Scanner leitura = new Scanner(System.in);
    System.out.print("Digite o nome do funcionário: ");
    String nome = leitura.next();
    setNome(nome);
    System.out.print("Digite o salario do funcionário: ");
    double salario = leitura.nextDouble();
    setSalario(salario);
    System.out.print("Digite o valor do salario mínimo vigente: ");
    double salarioMinimo = leitura.nextDouble();
    setSalarioMinimo(salarioMinimo);
    leitura.close();
  }

  public double calculaReajuste(){
    if(salario < (salarioMinimo * 3)){
      setReajuste(0.5);
      double salarioReajustado = salario + (salario * reajuste);
      setSalarioReajustado(salarioReajustado);
      return getSalarioReajustado();
    }

    else if(salario > (salarioMinimo * 3) && salario < (salarioMinimo * 10)){
      setReajuste(0.2);
      double salarioReajustado = salario + (salario * reajuste);
      setSalarioReajustado(salarioReajustado);
      return getSalarioReajustado();
    }

    else if(salario > (salarioMinimo * 10) && salario < (salarioMinimo * 20)){
      setReajuste(0.15);
      double salarioReajustado = salario + (salario * reajuste);
      setSalarioReajustado(salarioReajustado);
      return getSalarioReajustado();
    }

    else{
      setReajuste(0.1);
      double salarioReajustado = salario + (salario * reajuste);
      setSalarioReajustado(salarioReajustado);
      return getSalarioReajustado();
    }
  }

  public void imprimeDados(){
    System.out.printf("\nO novo salário do funcionário %s é R$ %.2f e teve o reajuste de %.0f por cento.", getNome(), calculaReajuste(), (reajuste * 100));
    aumentoFolhaPagamento();
  }

  public void aumentoFolhaPagamento(){
    System.out.printf("\nA folha de pagamento da empresa aumentou em R$ %.2f.", (getSalarioReajustado() - getSalario()));
  }
}