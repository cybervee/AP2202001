//aluna: veronica bertolucci scislewski
//matrícula: 201800216

/*Elaborar um programa que efetue a apresentação do valor da conversão em real 
(R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da 
cotação do dólar e, também, a quantidade de dólares disponíveis com o usuário.*/

class Main {
  public static void main(String[] args) {
    Dolar dolar = new Dolar();
    dolar.entrarDados();
    dolar.imprimirDados();

    //exemplos
    Dolar exemplo1 = new Dolar(240, 5.57);
    exemplo1.imprimirDados();
    Dolar exemplo2 = new Dolar(170.35, 7.80);
    exemplo2.imprimirDados();
    Dolar exemplo3 = new Dolar(13.92, 2.47);
    exemplo3.imprimirDados();
  }
}