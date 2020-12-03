//aluna: veronica bertolucci scislewski
//matrícula: 201800216

/*Escreva uma classe cujos objetos representam alunos matriculados em uma 
disciplina. Cada objeto dessa classe deve guardar os seguintes dados do aluno: 
matrícula, nome, 2 notas de prova e 1 nota de trabalho. Escreva os seguintes 
métodos para esta classe:
a) media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho 
tem peso 2);
b) final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não 
for para a final).*/

class Main {
  public static void main(String[] args) {
    /*AlunosMatriculados aluno = new AlunosMatriculados();
    aluno.entraDados();
    aluno.imprimeResultado();*/
    
    //exemplos
    AlunosMatriculados exemplo1 = new AlunosMatriculados("A", "210A", 10.0, 6.6, 8.6);
    exemplo1.imprimeResultado();
    AlunosMatriculados exemplo2 = new AlunosMatriculados("B", "180B", 3.4, 7.1, 5.9);
    exemplo2.imprimeResultado();
  }
}