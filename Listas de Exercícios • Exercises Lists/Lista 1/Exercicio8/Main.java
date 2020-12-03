//aluna: veronica bertolucci scislewski
//matrícula: 201800216

/*Escreva em Java uma classe Contador, que encapsule um valor usado para 
contagem de itens ou eventos. A classe deve oferecer métodos que devem:
a) Inicializar;
b) Zerar;
c) Incrementar;
d) Retornar o valor do contador.*/

class Main {
  public static void main(String[] args) {
    Contador contador = new Contador();
    contador.iniciaContador();
    contador.imprimeContador();
    contador.incrementaContador(5);
    contador.imprimeContador();
    contador.zeraContador();
    contador.imprimeContador();
    contador.incrementaContador(10);
    contador.imprimeContador();

    //exemplos
    Contador contador1 = new Contador(7);
    contador1.imprimeContador();
    contador1.incrementaContador(1);
    contador1.imprimeContador();
    contador1.zeraContador();
    contador1.imprimeContador();
    contador1.incrementaContador(50);
    contador1.imprimeContador();

    Contador contador2 = new Contador(99);
    contador2.imprimeContador();
    contador2.incrementaContador(1);
    contador2.imprimeContador();
    contador2.zeraContador();
    contador2.imprimeContador();
    contador2.incrementaContador(23);
    contador2.imprimeContador();

    Contador contador3 = new Contador(13);
    contador3.imprimeContador();
    contador3.incrementaContador(5);
    contador3.imprimeContador();
    contador3.zeraContador();
    contador3.imprimeContador();
    contador3.incrementaContador(99);
    contador3.imprimeContador();
  }
}