public class Triângulo{
  public int base;
  public int altura;

  public void atribuirBase(int b){
    base = b;
  }

  public void atribuirAltura(int h){
    altura = h;
  }

  public void calculaÁrea(){
    System.out.printf("\nA área do triângulo é %d.\n", (base*altura)/2 );
  }

  public void calculaPerímetro(){
    System.out.printf("\nO perímetro do triângulo é %d.\n", base*3 );
  }
}