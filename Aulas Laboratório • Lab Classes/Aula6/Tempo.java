import java.util.Scanner;

public class Tempo{
  private int horas, minutos, segundos;

  //construtores
  public Tempo(int horas, int minutos, int segundos){
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }

  public Tempo(){
    horas = 0;
    minutos = 0;
    segundos = 0;
  }

  //getters
  public int getHoras(){
    return this.horas;
  }

  public int getMinutos(){
    return this.minutos;
  }

  public int getSegundos(){
    return this.segundos;
  }

  //setters
  public void setHoras(int horas){
    this.horas = horas;
  }

  public void setMinutos(int minutos){
    this.minutos = minutos;
  }

  public void setSegundos(int segundos){
    this.segundos = segundos;
  }

  //métodos
  public void entraDados(){
    Scanner leitura = new Scanner(System.in);
    System.out.print("Digite as horas: ");
    int horas = leitura.nextInt();
    setHoras(horas);
    System.out.print("\nDigite os minutos: ");
    int minutos = leitura.nextInt();
    setMinutos(minutos);
    System.out.print("\nDigite os segundos: ");
    int segundos = leitura.nextInt();
    setSegundos(segundos);
  }

  public int tempoEmSegundos() {
    return (getHoras() * 3600) + (getMinutos() * 60) + getSegundos();
  }

  public Tempo segundosParaTempo(int totalSegundos) {
    int segundos = totalSegundos;
    int horas = segundos / 3600;
    segundos = segundos - (horas * 3600);
    int minutos = segundos / 60;
    segundos = segundos - (minutos * 60);
    return new Tempo(horas, minutos, segundos);
  }

  public Tempo subtração(Tempo tempo) {
    return segundosParaTempo(this.tempoEmSegundos() - tempo.tempoEmSegundos());
  }

  public Tempo soma(Tempo tempo) {
    return segundosParaTempo(this.tempoEmSegundos() + tempo.tempoEmSegundos());
  }

  public void imprimeDados() {
    System.out.printf("%02d:%02d:%02d\n\n", getHoras(), getMinutos(), getSegundos());
  }
}