import java.util.*;

class Main {
  public static void main(String[] args) {
    //exercício 1
    TestaConta exemplo = new TestaConta();
    exemplo.testaConta();

    //exercício 2
    Tempo tempo = new Tempo();
    tempo.entraDados();
    tempo.imprimeDados();

    //exercício 2 - exemplos
    Tempo tempoA = new Tempo(17, 15, 40);
    Tempo tempoB = new Tempo(9, 55, 30);
    Tempo tempoC = tempoA.soma(tempoB);

    tempoA.imprimeDados();
    tempoB.imprimeDados();
    tempoC.imprimeDados();

    //exercício 3
    Estacionamento carro = new Estacionamento();
    carro.entraDados();
    carro.imprimeDados();

    //exercício 3 - exemplos
    Estacionamento carro1 = new Estacionamento("ABC-1234", "Honda Civic");
    carro1.entraHorário();
    carro1.imprimeDados();

    Estacionamento carro2 = new Estacionamento("XYZ-7890", "Fiat 500");
    carro2.entraHorário();
    carro2.imprimeDados();

    Estacionamento carro3 = new Estacionamento("YYY-5555", "Mustang");
    carro3.entraHorário();
    carro3.imprimeDados();
  }
}