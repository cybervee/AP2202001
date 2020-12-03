import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    //exercício 1 - testes funcionários
    Funcionario f1 = new Funcionario("A", 150, 299.0);
    f1.exibeDados();
    f1.calcularSalario(10);
    f1.exibeDados();

    Funcionario f2 = new Funcionario("B", 151, 500.0);
    f2.exibeDados();
    f2.calcularSalario(25);
    f2.exibeDados();

    //testes disciplinas
    Disciplina d1 = new Disciplina("AP1", 101, 64);
    d1.imprimeDisciplina();

    Disciplina d2 = new Disciplina("AP2", 102, 64);
    d2.imprimeDisciplina();

    //testes professores
    Professor p1 = new Professor("C", 200, 299.0, new ArrayList<Disciplina>(), 1);
    p1.calcularSalario(10);
    p1.exibeDados();
    p1.getDisciplina().add(d1);
    p1.getDisciplina().add(d2);
    System.out.print("\nNúmero de disciplinas: " + p1.getDisciplina().size());
    p1.getDisciplina().get(0).imprimeDisciplina();
    p1.getDisciplina().get(1).imprimeDisciplina();

    Professor p2 = new Professor("D", 201, 299.0, new ArrayList<Disciplina>(), 2);
    p2.calcularSalario(10);
    p2.exibeDados();
    p2.getDisciplina().add(d1);
    p2.getDisciplina().add(d2);
    System.out.print("\nNúmero de disciplinas: " + p2.getDisciplina().size());
    p2.getDisciplina().get(0).imprimeDisciplina();
    p2.getDisciplina().get(1).imprimeDisciplina();

    Professor p3 = new Professor("E", 202, 299.0, new ArrayList<Disciplina>(), 3);
    p3.calcularSalario(10);
    p3.exibeDados();
    p3.getDisciplina().add(d1);
    p3.getDisciplina().add(d2);
    System.out.print("\nNúmero de disciplinas: " + p3.getDisciplina().size());
    p3.getDisciplina().get(0).imprimeDisciplina();
    p3.getDisciplina().get(1).imprimeDisciplina();

    //teste arraylist funcionário e professores - polimorfismo
    List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
    listaFuncionarios.add(f1);
    listaFuncionarios.add(f2);
    listaFuncionarios.add(p1);
    listaFuncionarios.add(p2);
    listaFuncionarios.add(p3);
    System.out.print("\nNúmero de funcionários: " + listaFuncionarios.size());

    //exercício 2
    //teste empregado
    Empregado e1 = new Empregado("A", "B", "1000");
    e1.imprimirDados();

    //teste assalariado
    Empregado a1 = new Assalariado("C", "D", "1001", 1050.45);
    a1.imprimirDados();

    //teste comissionado
    Empregado c1 = new Comissionado("E", "F", "1002", 22500, 40);
    c1.imprimirDados();

    //teste horista
    Empregado h1 = new Horista("G", "H", "1003", 8.50, 80);
    h1.imprimirDados();

    //teste arraylist empregados
    List<Empregado> listaEmpregados = new ArrayList<Empregado>();
    listaEmpregados.add(e1);
    listaEmpregados.add(a1);
    listaEmpregados.add(c1);
    listaEmpregados.add(h1);
    System.out.print("\nNúmero de empregados: " + listaEmpregados.size());
  }
}