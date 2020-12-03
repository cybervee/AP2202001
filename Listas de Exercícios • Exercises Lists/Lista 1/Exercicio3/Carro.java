import java.util.Scanner;

public class Carro{
  private double custoFabrica, custoFinal;

  //construtores
  public Carro(){
    custoFabrica = 0;
    custoFinal = 0;
  }

  public Carro(double custoFabrica){
    this.custoFabrica = custoFabrica;
  }

  //getters
  public double getCustoFabrica(){
    return this.custoFabrica;
  }

  public double getCustoFinal(){
    return this.custoFinal;
  }

  //setters
  public void setCustoFabrica(double custoFabrica){
    this.custoFabrica = custoFabrica;
  }

  public void setCustoFinal(double custoFinal){
    this.custoFinal = custoFinal;
  }

  //métodos
  public void entraDados(){
    Scanner leitura = new Scanner(System.in);
    System.out.print("Digite o custo de fábrica em R$: ");
    double custoFabrica = leitura.nextDouble();
    setCustoFabrica(custoFabrica);
    leitura.close();
  }

  public double calculaImposto(){
    double custoFinal = custoFabrica + ((custoFabrica + (custoFabrica * 0.45)) * 0.28);
    setCustoFinal(custoFinal);
    return getCustoFinal();
  }

  public void imprimeDados(){
    System.out.printf("\nO custo final do carro é R$ %.2f.\n", calculaImposto());
  }
}
