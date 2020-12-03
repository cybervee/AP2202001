import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // exercício 1
    Lâmpada lâmpada = new Lâmpada();
    lâmpada.mostraEstado();
    lâmpada.apaga();
    lâmpada.mostraEstado();
    lâmpada.acende();
    lâmpada.mostraEstado();

    // exercício 2
    Quadrado quadrado = new Quadrado();
    Scanner leitura = new Scanner(System.in);
    System.out.print("\nDigite o valor do lado: ");
    int l = leitura.nextInt();
    quadrado.atribuirLado(l);
    quadrado.calculaPerímetro();

    //exercício 3
    Triângulo triângulo = new Triângulo();
    System.out.print("\nDigite o valor da base: ");
    int b = leitura.nextInt();
    triângulo.atribuirBase(b);
    System.out.print("\nDigite o valor da altura: ");
    int h = leitura.nextInt();
    triângulo.atribuirAltura(h);
    triângulo.calculaÁrea();
    triângulo.calculaPerímetro();
    leitura.close();
  }
}