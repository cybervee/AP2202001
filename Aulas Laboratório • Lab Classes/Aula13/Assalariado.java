public class Assalariado extends Empregado{
  private double salario;

  //construtores
  public Assalariado(String nome, String sobrenome, String cpf, double salario){
    super(nome, sobrenome, cpf);
    this.salario = salario;
  }

  //getters
  public double getSalario(){
    return this.salario;
  }

  //setters
  public void setSalario(double salario){
    this.salario = salario;
  }

  //métodos
  public double vencimento(double salario){
    return this.salario;
  }

  public void imprimirDados(){
    System.out.printf("\nO empregado %s %s possui o CPF %s e recebe R$ %.2f por mês.", super.getNome(), super.getSobrenome(), super.getCpf(), vencimento(salario));
  }
}