public class Empregado{
  private String nome;
  private String sobrenome;
  private String cpf;

  //construtores
  public Empregado(String nome, String sobrenome, String cpf){
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.cpf = cpf;
  }

  public Empregado(){
  }

  //getters
  public String getNome(){
    return this.nome;
  }

  public String getSobrenome(){
    return this.sobrenome;
  }

  public String getCpf(){
    return this.cpf;
  }

  //setters
  public void setNome(String nome){
    this.nome = nome;
  }

  public void setSobrenome(String sobrenome){
    this.sobrenome = sobrenome;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  //métodos
  public void imprimirDados(){
    System.out.printf("\nO empregado %s %s possui o CPF %s.", getNome(), getSobrenome(), getCpf());
  }

  public double vencimento(){
    return 0.0;
  }
}