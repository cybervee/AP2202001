import java.util.Scanner;

public class Contador{
  private int contador;

  //construtores
  public Contador(){
    contador = 0;
  }

  public Contador(int contador){
    this.contador = contador;
  }

  //getter
  public int getContador(){
    return this.contador;
  }

  //setter
  public void setContador(int contador){
    this.contador = contador;
  }

  //métodos
  public void iniciaContador(){
    Scanner leitura = new Scanner(System.in);
    System.out.print("Digite o valor inicial do contador: ");
    int contador = leitura.nextInt();
    setContador(contador);
    leitura.close();
  }

  public void zeraContador(){
    setContador(0);
  }

  public void incrementaContador(int valorIncrementado){
    contador = contador + valorIncrementado;
    setContador(contador);
  }

  public void imprimeContador(){
    System.out.printf("\nO valor do contador é %d.\n", getContador());
  }
}