import java.util.Scanner;

public class Dolar{
  private double dolar;
  private double cotacaoDolar;

  Scanner leitura = new Scanner(System.in);

  //construtores
  public Dolar(){
    dolar = 0;
    cotacaoDolar = 0;
  }

  public Dolar(double dolar, double cotacaoDolar){
    this.dolar = dolar;
    this.cotacaoDolar = cotacaoDolar;
  }

  //getters
  public double getDolar(){
    return this.dolar;
  }

  public double getCotacaoDolar(){
    return this.cotacaoDolar;
  }

  //setters
  public void setDolar(double dolar){
    this.dolar = dolar;
  }

  public void setCotacaoDolar(double cotacaoDolar){
    this.cotacaoDolar = cotacaoDolar;
  }

  //métodos
  public void entrarDados(){
    System.out.print("Digite a quantidade de US$: ");
    double dolar = leitura.nextDouble();
    setDolar(dolar);
    System.out.print("Digite a cotação do dólar: ");
    double cotacaoDolar = leitura.nextDouble();
    setCotacaoDolar(cotacaoDolar);
    leitura.close();
  }

  public double dolarEmReal(){
    return (getDolar() * getCotacaoDolar());
  }

  public void imprimirDados(){
    System.out.printf("\nUS$ %.2f equivalem a R$ %.2f com a cotação a R$ %.2f.\n", getDolar(), dolarEmReal(), getCotacaoDolar());
  }
}