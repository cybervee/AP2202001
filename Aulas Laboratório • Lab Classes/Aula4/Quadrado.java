public class Quadrado{
  public int lado;

  Quadrado(){
    lado = 0;
  }

  public void atribuirLado(int l){
    lado = l;
  }

  public void calculaPerímetro(){
    System.out.printf("\nO perímetro do quadrado é %d.\n", lado*4 );
  }
}