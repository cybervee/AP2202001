import java.util.Scanner;

public class Elevador{
  private int andarAtual;
  private int totalAndares;
  private int capacidade;
  private int quantidadePessoas;

  //construtores
  public Elevador(int totalAndares, int capacidade){
    this.totalAndares = totalAndares;
    this.capacidade = capacidade;
  }

  public Elevador(){
    totalAndares = 0;
    capacidade = 0;
  }

  //getters
  public int getAndarAtual(){
    return this.andarAtual;
  }

  public int getTotalAndares(){
    return this.totalAndares;
  }

  public int getCapacidade(){
    return this.capacidade;
  }

  public int getQuantidadePessoas(){
    return this.quantidadePessoas;
  }

  //setters
  public void setAndarAtual(int andarAtual){
    this.andarAtual = andarAtual;
  }

  public void setTotalAndares(int totalAndares){
    this.totalAndares = totalAndares;
  }

  public void setCapacidade(int capacidade){
    this.capacidade = capacidade;
  }

  public void setQuantidadePessoas(int quantidadePessoas){
    this.quantidadePessoas = quantidadePessoas;
  }

  //métodos
  public void inicializaElevador(){
    Scanner leitura = new Scanner(System.in);
    System.out.printf("Digite a capacidade do elevador: ");
    int capacidade = leitura.nextInt();
    setCapacidade(capacidade);
    System.out.printf("Digite o total de andares do prédio: ");
    int totalAndares = leitura.nextInt();
    setTotalAndares(totalAndares - 1);
    setAndarAtual(0);
    setQuantidadePessoas(0);
    leitura.close();
  }

  public void entraElevador(int x){
    if(quantidadePessoas < capacidade){
      setQuantidadePessoas(getQuantidadePessoas() + x);
      System.out.printf("\nTem %d pessoas no elevador.", getQuantidadePessoas());
    }
    else{
      System.out.print("\nElevador cheio!");
    }
  }

  public void saiElevador(int y){
    if(quantidadePessoas > y){
      setQuantidadePessoas(getQuantidadePessoas() - y);
      System.out.printf("\nTem %d pessoas no elevador.", getQuantidadePessoas());
    }
    else{
      System.out.printf("\nElevador vazio!");
    }
  }

  public void sobeElevador(int a){
    if(andarAtual < totalAndares){
      setAndarAtual(getAndarAtual() + a);
      System.out.printf("\nElevador está no andar %d.", getAndarAtual());
    }
    else{
      System.out.printf("\nElevador está no último andar!");
    }
  }

  public void desceElevador(int b){
    setAndarAtual(getAndarAtual() - b);
    if(andarAtual > 0){
        System.out.printf("\nElevador está no andar %d.", getAndarAtual());
    }
    else{
      setAndarAtual(0);
      System.out.printf("\nElevador está no térreo!");
    }
  }
}