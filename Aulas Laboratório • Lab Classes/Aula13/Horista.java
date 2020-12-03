public class Horista extends Empregado{
  private double precoHora;
  private double totalHoras;

  //construtores
  public Horista(String nome, String sobrenome, String cpf, double precoHora, double totalHoras){
    super(nome, sobrenome, cpf);
    this.precoHora = precoHora;
    this.totalHoras = totalHoras;
  }

  //getters
  public double getPrecoHora(){
    return this.precoHora;
  }

  public double getTotalHoras(){
    return this.totalHoras;
  }

  //setters
  public void setPrecoHora(double precoHora){
    this.precoHora = precoHora;
  }

  public void setTotalHoras(double totalHoras){
    this.totalHoras = totalHoras;
  }

  //métodos
  public double vencimento(double precoHora, double totalHoras){
    return precoHora * totalHoras;
  }

  public void imprimirDados(){
    System.out.printf("\nO horista %s %s possui o CPF %s e recebe R$ %.2f por mês.", super.getNome(), super.getSobrenome(), super.getCpf(), vencimento(precoHora, totalHoras));
  }
}