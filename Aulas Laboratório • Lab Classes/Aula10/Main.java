class Main {
  public static void main(String[] args) {
    //exercício 1
    Conta conta = new Conta("A", 100);
    conta.depositar(50);
    conta.sacar(10);
    conta.imprimir();

    ContaEspecial contaEspecial = new ContaEspecial("B", 100);
    contaEspecial.depositar(50);
    contaEspecial.sacar(10);
    contaEspecial.imprimir();

    //exemplos exercício 1
    Conta conta1 = new Conta("César", 1045);
    conta1.depositar(300);
    conta1.sacar(750);
    conta1.imprimir();

    ContaEspecial conta2 = new ContaEspecial("Carolina", 13500);
    conta2.depositar(2100);
    conta2.sacar(520.75);
    conta2.imprimir();

    //exercício 2
    Imovel imovel = new Imovel("Rua A", 50000);
    imovel.imprimeEndereco();
    imovel.imprimePreco();

    Novo imovelNovo = new Novo("Rua A", 50000);
    imovelNovo.imprimeEndereco();
    imovelNovo.imprimePreco();

    Antigo imovelAntigo = new Antigo("Rua A", 50000);
    imovelAntigo.imprimeEndereco();
    imovelAntigo.imprimePreco();

    //exemplos exercício 2
    Imovel imovel1 = new Imovel("Rua B, quadra 10, lote 7", 75000);
    imovel1.imprimeEndereco();
    imovel1.imprimePreco();

    Novo imovel2 = new Novo("Rua C, quadra 45, lote 13", 30450);
    imovel2.imprimeEndereco();
    imovel2.imprimePreco();

    Antigo imovel3 = new Antigo("Rua Z, quadra 95, lote 50", 90765);
    imovel3.imprimeEndereco();
    imovel3.imprimePreco();
  }
}