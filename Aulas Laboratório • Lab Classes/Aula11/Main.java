import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    //exercício 1
    List<Integer> lista = new ArrayList<Integer>();
    int a = new Integer(1);
    lista.add(a);
    int b = new Integer(2);
    lista.add(b);
    int c = new Integer(3);
    lista.add(c);
    System.out.println(lista.toString());
    System.out.println("Número de elementos na lista: " + lista.size());
    lista.remove(b); //ou lista.remove(2);
    System.out.println("O número 7 está na lista: " + lista.contains(7));
    System.out.println("O número 1 está na lista: " + lista.contains(1));
    System.out.println(lista.toString());
    System.out.println("Número de elementos na lista: " + lista.size());
    lista.clear();

    int n = 1;
    for(int i = 0; i < 100; i++){
      lista.add(n++);
    }
    System.out.println(lista.toString());

    List<Integer> listaPar = new ArrayList<Integer>();
    for(int i = 0; i < 100; i++){
      if(lista.get(i) % 2 == 0){
        listaPar.add(lista.get(i));
      }
    }
    System.out.println("Números pares de 0 a 100: " + listaPar.toString());

    //exercício 2
    //teste de funcionário
    Funcionario exemplo = new Funcionario("A", "00001", 1050.45);
    exemplo.imprimirDados();
    exemplo.aumentarSalario(20);
    exemplo.imprimirDados();

    List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
    Funcionario funcionario1 = new Funcionario("A", "00001", 1050.45);
    Funcionario funcionario2 = new Funcionario("B", "00002", 13500.99);
    Funcionario funcionario3 = new Funcionario("C", "00003", 4100.76);
    Funcionario funcionario4 = new Funcionario("D", "00004", 21310.44);
    Funcionario funcionario5 = new Funcionario("E", "00005", 2305.50);
    listaFuncionarios.add(funcionario1);
    listaFuncionarios.add(funcionario2);
    listaFuncionarios.add(funcionario3);
    listaFuncionarios.add(funcionario4);
    listaFuncionarios.add(funcionario5);
    System.out.print("\nNúmero de funcionários: " + listaFuncionarios.size());
    listaFuncionarios.get(2).imprimirDados();
    listaFuncionarios.get(3).aumentarSalario(15);
    listaFuncionarios.get(3).imprimirDados();
    listaFuncionarios.remove(1);
    System.out.print("\nNúmero de funcionários: " + listaFuncionarios.size());
  }
}