public abstract class Paciente{
  private String nome;

  public Paciente(String nome){
    this.nome = nome;
  }

  public Paciente(){
    
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }

  public void print(){
    
  }

  public abstract void entraDados();
}