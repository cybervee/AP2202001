//aluna: veronica bertolucci scislewski
//matrícula: 201800216

/*A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) Prestacoes sem juros. Faça um programa que receba um valor de uma compra e mostre o valor das Prestacoes.*/

class Main {
  public static void main(String[] args) {
    Prestacoes produto = new Prestacoes();
    produto.entraDados();
    produto.imprimeDados();

    //exemplos
    Prestacoes exemplo1 = new Prestacoes(1050.45);
    exemplo1.imprimeDados();
    Prestacoes exemplo2 = new Prestacoes(9100.30);
    exemplo2.imprimeDados();
    Prestacoes exemplo3 = new Prestacoes(80.75);
    exemplo3.imprimeDados();
  }
}