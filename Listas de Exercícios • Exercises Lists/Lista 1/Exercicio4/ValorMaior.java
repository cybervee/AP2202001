import java.util.Scanner;

public class ValorMaior{
  private int a, b;

  //construtores
  public ValorMaior(){
    a = 0;
    b = 0;
  }

  public ValorMaior(int a, int b){
    this.a = a;
    this.b = b;
  }

  //getters
  public int getA(){
    return this.a;
  }

  public int getB(){
    return this.b;
  }

  //setters
  public void setA(int a){
    this.a = a;
  }

  public void setB(int b){
    this.b = b;
  }

  //métodos
  public void entraDados(){
    Scanner leitura = new Scanner(System.in);
    System.out.print("Digite o valor A: ");
    int a = leitura.nextInt();
    setA(a);
    System.out.print("Digite o valor B: ");
    int b = leitura.nextInt();
    setB(b);
    leitura.close();
  }
  
  public void menorMaior(){
    if(a > b){
      System.out.printf("\nO valor A = %d é maior do que B = %d.", a, b);
    }
    else{
      System.out.printf("\nO valor B = %d é maior do que A = %d.", b, a);
    }
    intervalo(a, b);
  }

  public void intervalo(int a, int b){
    if(a >= 100 && a <= 200 && b >= 100 && b <= 200){
      System.out.printf("\nA e B estão no intervalo entre 100 e 200.\n\n");
    }
    else{
      System.out.printf("\nA e B não estão no intervalo entre 100 e 200.\n\n");
    }
  }
}