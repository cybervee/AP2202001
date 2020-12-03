import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //exercício 1
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
    listaEmpregados.add(a1);
    listaEmpregados.add(c1);
    listaEmpregados.add(h1);

    //teste arraylist pacientes
    /*Paciente p1 = new Assegurado("A", "Unimed", 202010);
    Paciente p2 = new NaoAssegurado("B", 270, 1, 200);
    //listaPacientes.add(new Assegurado("A", "Unimed", 202010));
    //listaPacientes.add(new NaoAssegurado("B", 270, 1, 200));
    listaPacientes.add(p1);
    listaPacientes.add(p2);
    System.out.print("\nQuantidade de pacientes: " + listaPacientes.size());
    p2.print();
    p1.print();
    listaPacientes.get(1).print();
    listaPacientes.get(0).print();*/

    //exercício 2
    Scanner leitura = new Scanner(System.in);
    System.out.printf("\n*** Lista de Pacientes ***\n");
    List<Paciente> listaPacientes = new ArrayList<Paciente>();
    String escolha2;
    do{
      System.out.printf("1. Assegurado\n");
      System.out.printf("2. Não Assegurado\n");
      System.out.printf("Digite o número da operação que deseja: ");
      int escolha1 = leitura.nextInt();
      switch(escolha1){
      case 1: 
        Paciente assegurado = new Assegurado();
        assegurado.entraDados();
        listaPacientes.add(assegurado);
        break;
      case 2:
        Paciente naoAssegurado = new NaoAssegurado();
        naoAssegurado.entraDados();
        listaPacientes.add(naoAssegurado);
        break;
      }
      System.out.printf("\nGostaria de adicionar outro paciente? S/N: ");
      escolha2 = leitura.next();
    }while(escolha2.equals("s") || escolha2.equals("S"));

    for (int i = 0; i < listaPacientes.size(); i++) {
      listaPacientes.get(i).print();
    }

    //exercício 3
    System.out.printf("\n*** Operação Matemática ***\n");
    System.out.printf("1. Soma\n");
    System.out.printf("2. Subtração\n");
    System.out.printf("3. Multiplicação\n");
    System.out.printf("4. Divisão\n");
    System.out.printf("A: ");
    int a = leitura.nextInt();
    System.out.printf("B: ");
    int b = leitura.nextInt();
    System.out.printf("Digite o número da operação que deseja: ");
    int escolha3 = leitura.nextInt();
    switch(escolha3){
      case 1:
        System.out.printf("*** Soma ***\n");
        OperacaoMatematica soma = new Soma();
        System.out.print(soma.calcula(a, b));
        break;
      case 2:
        System.out.printf("*** Subtração ***\n");
        OperacaoMatematica subtracao = new Subtracao();
        System.out.print(subtracao.calcula(a, b));
        break;
      case 3:
        System.out.printf("*** Multiplicação ***\n");
        OperacaoMatematica multiplicacao = new Multiplicacao();
        System.out.print(multiplicacao.calcula(a, b));
        break;
      case 4:
        System.out.printf("*** Divisão ***\n");
        OperacaoMatematica divisao = new Divisao();
        System.out.print(divisao.calcula(a, b));
        break;
    }
  }
}