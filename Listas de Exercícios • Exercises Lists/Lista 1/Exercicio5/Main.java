//aluna: veronica bertolucci scislewski
//matrícula: 201800216

/*Escrever um algoritmo para uma empresa que decide dar um reajuste a seus 
funcionários de acordo com os seguintes critérios: a) 50% para aqueles que 
ganham menos do que três salários mínimos; b) 20% para aqueles que ganham 
entre três até dez salários mínimos; c) 15% para aqueles que ganham acima de 
dez até vinte salários mínimos; d) 10% para os demais funcionários. Receba 
como entrada o nome do funcionário, seu salário e o valor do salário-mínimo.
Em seguida, calcule o seu novo salário reajustado. Imprima na tela o nome do 
funcionário, o reajuste e seu novo salário. Forneça, também, quanto à empresa 
irá aumentar sua folha de pagamento.*/

class Main {
  public static void main(String[] args) {
    ReajusteSalario funcionario = new ReajusteSalario();
    funcionario.entraDados();
    funcionario.imprimeDados();

    //exemplos
    ReajusteSalario exemplo1 = new ReajusteSalario("José", 1050, 1045);
    exemplo1.imprimeDados();
    ReajusteSalario exemplo2 = new ReajusteSalario("Amélia", 5500, 1045);
    exemplo2.imprimeDados();
    ReajusteSalario exemplo3 = new ReajusteSalario("Vicente", 13250, 1045);
    exemplo3.imprimeDados();
    ReajusteSalario exemplo4 = new ReajusteSalario("Clarice", 25810, 1045);
    exemplo4.imprimeDados();
  }
}