//aluna: veronica bertolucci scislewski
//matrícula: 201800216

/*O custo ao consumidor de um carro novo é a soma do custo de fábrica com a 
percentagem do distribuidor e dos impostos (aplicados, primeiro os impostos 
sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o 
resultado). Supondo que a percentagem do distribuidor seja de 28% e os 
impostos 45%. Implemente um programa que leia o custo de fábrica de um carro 
e informe o custo dele ao consumidor.
*/

class Main {
  public static void main(String[] args) {
    Carro carro = new Carro();
    carro.entraDados();
    carro.imprimeDados();

    //exemplos
    Carro exemplo1 = new Carro(20000);
    exemplo1.imprimeDados();
    Carro exemplo2 = new Carro(53500);
    exemplo2.imprimeDados();
    Carro exemplo3 = new Carro(75600);
    exemplo3.imprimeDados();
  }
}