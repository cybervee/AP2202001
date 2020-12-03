import java.util.Scanner;

class Main {
  public static void exercicio1(){
    Scanner entrada = new Scanner(System.in);
    System.out.print("\nDigite 4 números: ");
    int num1 = entrada.nextInt();
    int num2 = entrada.nextInt();
    int num3 = entrada.nextInt();
    int num4 = entrada.nextInt();
    int soma = num1 + num2 + num3 + num4;
    int multiplicacao = num1 * num2 * num3 * num4;

    System.out.printf("\nA soma é %d.", soma);
    System.out.printf("\nA multiplicação é %d.\n", multiplicacao);

  }

  public static void exercicio2(){
    Scanner entrada = new Scanner(System.in);
    System.out.print("\nDigite o nome do aluno: ");
    String nome = entrada.next();
    System.out.print("Digite as 3 notas: ");
    float prova1 = entrada.nextFloat();
    float prova2 = entrada.nextFloat();
    float prova3 = entrada.nextFloat();
    float mediaAritmetica = (prova1 + prova2 + prova3) / 3;
    float mediaGeometrica = (float) Math.exp((Math.log(prova1 * prova2 * prova3))/3); 

    System.out.printf("\nO aluno %s tem a média aritmética %.2f e a média geométrica %.2f.\n",nome, mediaAritmetica, mediaGeometrica);

  }

  public static void exercicio3(){
      Scanner entrada = new Scanner(System.in);
      System.out.print("\nDigite sua idade em anos: ");
      int anos = entrada.nextInt();
      System.out.print("Meses: ");
      int meses = entrada.nextInt();
      System.out.print("Dias: ");
      int dias = entrada.nextInt();
      int idade = (anos * 365) + (meses * 30) + dias;

      System.out.printf("\nSua idade é %d dias.\n", idade);

  }

  public static void exercicio4(){
      Scanner entrada = new Scanner(System.in);
      System.out.print("\nInsira o seu salário: ");
      float salario = entrada.nextFloat();
      
      System.out.printf("\nVocê ganha %.2f salários mínimos por mês.\n", salario / 1045);

  }

  public static void exercicio5(){
      Scanner entrada = new Scanner(System.in);
      System.out.print("\nInsira o número de anos: ");
      int anos = entrada.nextInt();

      System.out.printf("\nSeu coração baterá %d vezes ao viver %d anos.\n", anos * 31536000, anos);

  }

  public static void exercicio6(){
    Scanner entrada = new Scanner(System.in);
    System.out.print("\nDigite o valor de A: ");
    int a = entrada.nextInt();
    System.out.print("Digite o valor de B: ");
    int b = entrada.nextInt();
    int aux = a;
    a = b;
    b = aux;
    
    System.out.printf("\nOs valores trocados são %d e %d, respectivamente.\n", a, b);

  }

  public static void main(String[] args) {
      exercicio1();
      exercicio2();
      exercicio3();
      exercicio4();
      exercicio5();
      exercicio6();
  }
}