//aluna: veronica bertolucci scislewski
//matrícula: 201800216

/*Escrever um algoritmo que leia dois valores inteiro distintos e informe qual é o 
maior. Além disso, informe se esses dois valores inteiros estão no intervalo entre 
100 e 200.*/

class Main {
  public static void main(String[] args) {
    ValorMaior exemplo = new ValorMaior();
    exemplo.entraDados();
    exemplo.menorMaior();

    //exemplos
    ValorMaior exemplo1 = new ValorMaior(50,100);
    exemplo1.menorMaior();
    ValorMaior exemplo2 = new ValorMaior(170, 125);
    exemplo2.menorMaior();
    ValorMaior exemplo3 = new ValorMaior(199, 200);
    exemplo3.menorMaior();
  }
}