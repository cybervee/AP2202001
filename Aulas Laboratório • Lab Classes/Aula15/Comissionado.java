public class Comissionado extends Empregado{
  private double totalVenda;
  private double totalComissao;

  //construtores
  public Comissionado(String nome, String sobrenome, String cpf, double totalVenda, double totalComissao){
    super(nome, sobrenome, cpf);
    this.totalVenda = totalVenda;
    this.totalComissao = totalComissao;
  }

  //getters
  public double getTotalVenda(){
    return this.totalVenda;
  }

  public double getTotalComissao(){
    return this.totalComissao;
  }

  //setters
  public void setTotalVenda(double totalVenda){
    this.totalVenda = totalVenda;
  }

  public void setTotalComissao(double totalComissao){
    this.totalComissao = totalComissao;
  }

  //métodos
  @Override
  public double vencimento(){
    return this.totalVenda * (this.totalComissao / 100);
  }

  @Override
  public void imprimirDados(){
    System.out.printf("\nO comissionado %s %s possui o CPF %s e recebe R$ %.2f de comissão.", super.getNome(), super.getSobrenome(), super.getCpf(), vencimento());
  }
}