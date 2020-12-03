public abstract class Empregado{
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
  public abstract void imprimirDados();
  public abstract double vencimento();
}