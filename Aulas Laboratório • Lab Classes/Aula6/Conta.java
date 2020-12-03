public class Conta{
  private String nomeDoCorrentista;
  private double saldo;
  private boolean contaEspecial;

  //construtor
  public Conta(String nomeDoCorrentista, double saldo, boolean contaEspecial){
    this.nomeDoCorrentista = nomeDoCorrentista;
    this.saldo = saldo;
    this.contaEspecial = contaEspecial;
  }

  //getters
  public String getNomeDoCorrentista(){
    return this.nomeDoCorrentista;
  }

  public double getSaldo(){
    return this.saldo;
  }
  
  public boolean getContaEspecial(){
    return this.contaEspecial;
  }

  //setters
  public void setNomeDoCorrentista(String nomeDoCorrentista){
    this.nomeDoCorrentista = nomeDoCorrentista;
  }

  public void setSaldo(double saldo){
    this.saldo = saldo;
  }

  public void setContaEspecial(boolean contaEspecial){
    this.contaEspecial = contaEspecial;
  }

  //métodos
  public void deposita(double valor){
    this.saldo = this.saldo + valor;
  }

  public void retira(double valor){
    this.saldo = this.saldo - valor;
  }

  public void mostraDados(){
    System.out.printf("O saldo do cliente %s é R$ %.2f.\n", getNomeDoCorrentista(), getSaldo());

    if(this.contaEspecial){
      System.out.printf("A conta é especial.\n\n");
    }

    else{
      System.out.printf("A conta não é especial.\n\n");
    }
  }
}