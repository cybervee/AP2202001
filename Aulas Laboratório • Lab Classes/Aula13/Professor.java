import java.util.ArrayList;

public class Professor extends Funcionario{
  private ArrayList<Disciplina> disciplina;
  private int categoria; 

  //métodos
  public Professor(String nome, int nro_pis, double salario, ArrayList<Disciplina> disciplina, int categoria){
    super(nome, nro_pis, salario);
    this.disciplina = disciplina;
    this.categoria = categoria;
  }

  public Professor(ArrayList<Disciplina> disciplina, int categoria){
    this.disciplina = disciplina;
    this.categoria = categoria;
  }

  public Professor(){
  }

  //getters
  public ArrayList<Disciplina> getDisciplina(){
    return this.disciplina;
  }

  public int getCategoria(){
    return this.categoria;
  }

  //setters
  public void setDisciplina(ArrayList<Disciplina> disciplina){
    this.disciplina = disciplina;
  }

  public void setCategoria(int categoria){
    this.categoria = categoria;
  }

  //métodos
  public void calcularSalario(int horas){
    switch(categoria){
      case 1:
        super.setSalario(this.getSalario() + horas * 30.5);
        break;
      case 2:
        super.setSalario(this.getSalario() + horas * 32.5);
        break;
      case 3:
        super.setSalario(this.getSalario() + horas * 35.5);
        break;
    }
  }

  public void exibeDados(){
    System.out.printf("\nO professor %s possui o número PIS %d e recebe R$%.2f por mês.", super.getNome(), super.getNro_pis(), super.getSalario());
  }
}