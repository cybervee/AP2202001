import java.util.Scanner;

public class Estacionamento{
  private String placa, modelo;
  private Tempo horárioEntrada, horárioSaída, horárioTotal;
  private double valorDevido;

  //construtores
  public Estacionamento(String placa, String modelo){
    this.placa = placa;
    this.modelo = modelo;
  }

  public Estacionamento(){
    placa = "000-000";
    modelo = "Vazio";
  }

  //getters
  public String getPlaca(){
    return this.placa;
  }
  
  public String getModelo(){
    return this.modelo;
  }

  public Tempo getHorárioEntrada(){
    return this.horárioEntrada;
  }

  public Tempo getHorárioSaída(){
    return this.horárioSaída;
  }

  //setters
  public void setPlaca(String placa){
    this.placa = placa;
  }
  
  public void setModelo(String modelo){
    this.modelo = modelo;
  }

  public void setHorárioEntrada(Tempo horárioEntrada){
    this.horárioEntrada = horárioEntrada;
  }

  public void setHorárioSaída(Tempo horárioSaída){
    this.horárioSaída = horárioSaída;
  }

  //métodos
  public void entraDados(){
    Scanner leitura = new Scanner(System.in);
    System.out.print("Digite a placa do carro: ");
    String placa = leitura.next();
    setPlaca(placa);
    System.out.print("\nDigite o modelo do carro: ");
    String modelo = leitura.next();
    setModelo(modelo);
    entraHorário();
  }

  public void entraHorário(){
    System.out.print("Horário de entrada: ");
    Tempo horárioEntrada = new Tempo();
    horárioEntrada.entraDados();
    setHorárioEntrada(horárioEntrada);
    System.out.print("\nHorário de saída: ");
    Tempo horárioSaída = new Tempo();
    horárioSaída.entraDados();
    setHorárioSaída(horárioSaída);
  }

  public double pagamentoEstacionamento(){
    Tempo horárioTotal = horárioSaída.subtração(horárioEntrada);
    double valorDevido = horárioTotal.getHoras() * 5.50;
    return valorDevido;
  }

  public void imprimeDados(){
    System.out.printf("\nO carro estacionado é do modelo %s com a placa %s.\n", getModelo(), getPlaca());
    System.out.printf("O total devido pelo carro estacionado é R$ %.2f.\n", pagamentoEstacionamento());
  }
}