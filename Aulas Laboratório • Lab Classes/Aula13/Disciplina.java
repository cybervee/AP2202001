public class Disciplina{
  private String nome;
  private int codigo;
  private int carga_horaria;

  //construtores
  public Disciplina(){
    nome = "vazio";
    codigo = 0;
    carga_horaria = 0;
  }

  public Disciplina(String nome, int codigo, int carga_horaria){
    this.nome = nome;
    this.codigo = codigo;
    this.carga_horaria = carga_horaria;
  }

  //getters
  public String getNome(){
    return this.nome;
  }

  public int getCodigo(){
    return this.codigo;
  }

  public int getCargaHoraria(){
    return this.carga_horaria;
  }

  //setters
  public void setNome(String nome){
    this.nome = nome;
  }

  public void setCodigo(int codigo){
    this.codigo = codigo;
  }

  public void setCargaHoraria(int carga_horaria){
    this.carga_horaria = carga_horaria;
  }

  //métodos
  public void imprimeDisciplina(){
    System.out.print("\nNome da disciplina: " + getNome() + "\nCódigo: " + getCodigo() + "\nCarga horária: " + getCargaHoraria());
  }
}