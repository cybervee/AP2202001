public class Lâmpada{
  public String estadoDaLâmpada;

  Lâmpada(){
    estadoDaLâmpada = "acesa";
  }

  public void acende(){
    estadoDaLâmpada = "acesa";
  }

  public void apaga(){
    estadoDaLâmpada = "apagada";
  }

  public void mostraEstado(){
    System.out.printf("\nA lâmpada está %s.\n", estadoDaLâmpada);
  }
}