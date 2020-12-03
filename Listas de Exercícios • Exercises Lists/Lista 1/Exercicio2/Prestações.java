import java.util.Scanner;

public class Prestacoes{
  private double valorCompra;

  //construtores
  public Prestacoes(){
    valorCompra = 0;
  }

  public Prestacoes(double valorCompra){
    this.valorCompra = valorCompra;
  }

  //getters
  public double getValorCompra(){
    return this.valorCompra;
  }

  //setters
  public void setValorCompra(double valorCompra){
    this.valorCompra = valorCompra;
  }

  //métodos
  public void entraDados(){
    Scanner leitura = new Scanner(System.in);
    System.out.print("Digite o valor da compra: ");
    double valorCompra = leitura.nextDouble();
    setValorCompra(valorCompra);
    leitura.close();
  }

  public double quantidadePrestacoes(){
    return getValorCompra() / 5;
  }

  public void imprimeDados(){
    System.out.printf("\nA compra de R$ %.2f será dividida em 5 prestações de R$ %.2f sem juros.\n", getValorCompra(), quantidadePrestacoes());
  }
}
