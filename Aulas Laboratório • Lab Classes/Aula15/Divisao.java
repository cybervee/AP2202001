public class Divisao implements OperacaoMatematica{
  @Override
  public int calcula(int a, int b){
    try{
      return a / b;
    }catch(ArithmeticException e){
      System.out.printf("Erro: divisão por 0!");
      return 0;
    }
  }
}