//aluna: veronica bertolucci scislewski
//matrícula: 201800216

/*Crie uma classe denominada Elevador para armazenar as informações de um 
elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), capacidade do 
elevador e quantas pessoas estão presentes nele. A classe deve também 
disponibilizar os seguintes métodos:
• Inicializa: que deve receber como parâmetros a capacidade do elevador e 
o total de andares no prédio (os elevadores sempre começam no térreo e 
vazio);
• Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se 
ainda houver espaço);
• Sai: para remover uma pessoa do elevador (só deve remover se houver 
alguém dentro dele);
• Sobe: para subir um andar (não deve subir se já estiver no último andar);
• Desce: para descer um andar (não deve descer se já estiver no térreo);
Encapsular todos os atributos da classe (criar os métodos set e get).
*/

class Main {
  public static void main(String[] args) {
    Elevador elevador = new Elevador();
    elevador.inicializaElevador();

    //exemplos
    Elevador elevador1 = new Elevador(5, 10);
    elevador1.entraElevador(5);
    elevador1.entraElevador(5);
    elevador1.entraElevador(2);
    elevador1.saiElevador(1);
    elevador1.saiElevador(3);
    elevador1.saiElevador(7);
    elevador1.sobeElevador(2);
    elevador1.desceElevador(1);
    elevador1.sobeElevador(9);
    elevador1.sobeElevador(2);
    elevador1.desceElevador(3);
    elevador1.desceElevador(9);
  }
}