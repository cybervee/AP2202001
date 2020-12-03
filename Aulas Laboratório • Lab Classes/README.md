#Aulas de Laboratório com exercícios • Lab classes with exercises

//Aula 1 • Class 1 (04/09/2020)

Exercício 1: Crie um programa que receba quatro números inteiros e exiba o resultado da soma e da multiplicação entre eles.

Exercício 2: Escrever um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No final informar o nome do aluno e os valores de suas médias (média aritmética e média geométrica).

Exercício 3: Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30 dias. (Ex: 5 anos, 1 meses e 10 dias = 1865 dias.)

Exercício 4: Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado. (1 salário mínimo corresponde a 1045,00 reais)

Exercício 5: O coração humano bate em média uma vez por segundo. Desenvolver um algoritmo para ler, calcular e escrever quantas vezes o coração de uma pessoa baterá se viver X anos.

Exercício 6: Ler dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Imprimir na tela os valores trocados.

//Aula 4 • Class 4 (11/09/2020)

Exercício 1: Implemente a classe Lâmpada. O atributo estadoDaLampada começa com o valor “acesa”. O método acende muda o estado da lâmpada para “acesa”. O método apaga muda o estado da lâmpada para “apagada”. O método mostraEstado escreve a mensagem “A lâmpada está xxxx”, onde xxxx deve ser substituído pela string “acesa” ou “apagada”, dependendo do estado da lâmpada.

Exercício 2: Implemente a classe Quadrado, cujos atributos são capazes de guardar os lados de um quadrado. Implemente, o construtor (L=0), um método para atribuir um valor para o lado L (com parâmetro) e um método para calcular o perímetro do quadrado. Em seguida, atribua (no método Main) um valor para os lados (obtido pelo usuário/teclado) e utilize o método calculaPerimetro.

Exercício 3: Implemente a classe Triangulo, cujos atributos são capazes de guardar a base e a altura de um triângulo. Essa classe possui métodos que calculam a área e o perímetro do triângulo. O usuário deverá fornecer os valores dos atributos dos triângulos.

//Aula 6 • Class 6 (20/09/2020)

Exercício 1: Implemente a classe Conta abaixo. Implemente na classe Conta os métodos gets e sets para todos os atributos. Crie também uma classe TestaConta que cria duas contas. Defina os seguintes dados para as contas pelo método: Conta: (Ana, 1000, true) e (José, 200, false). Efetue depósitos e retiradas nas contas criadas. Imprima os dados das contas na classe principal.

Exercício 2: Crie uma classe Tempo com três atributos: horas, minutos e segundos. Crie dois construtores: um para inicializar os atributos com valor zero e outro para inicializar os atributos com valores passados como argumentos. Crie métodos para:

	    a. Funcionar como getter e setter;
	    b. Imprimir os atributos no formato hh:mm:ss;
	    c. Somar dois objetos e colocar o resultado no objeto que o chamou.
    
Exercício 3: Crie uma classe Estacionamento para armazenar dados de um estacionamento. Os atributos devem representar a placa e modelo do carro além da hora de entrada e saída do estacionamento. Utilize objetos da classe Tempo criada no exercício anterior. Crie métodos para:

	    a. Funcionar como getter e setter;
	    b. Inicializar os dados como zero;
	    c. Imprimir os dados de um carro estacionado;
	    d. Calcular e retornar o valor a ser pago pelo carro estacionado.
	    
Considere o preço de R$5,50 por hora. Utilize o método da classe Tempo.

//Aula 6 • Class 6 (01/10/2020)

Exercício 1: Escreva a classe ConversaoDeUnidadesDeTempo com métodos estáticos para conversão aproximada das unidades de velocidade segundo a lista abaixo.
	
	• 1 minuto = 60 segundos
	• 1 hora = 60 minutos
	• 1 dia = 24 horas
	• 1 semana = 7 dias
	• 1 mês = 30 dias
	• 1 ano = 365.25 dias

	• O tempo de gestação de um elefante indiano é de aproximadamente 624 dias. Usando a classe ConversaoDeUnidadesDeTempo, escreva um programa em Java que mostre qual é o tempo de gestação de um elefante indiano em dias, horas, minutos e segundos. Escreva métodos adicionais para a classe ConversaoDeUnidadesDeTempo, se necessário. Implemente outros exemplos de uso dos métodos estáticos implementados.
	
Exercício 2: Escreva a classe ConversaoDeUnidadesDeArea com métodos estáticos para conversão das unidades de área segundo a lista abaixo.

	• 1 metro quadrado = 10,76 pés quadrados
	• 1 hectare = 0,01 quilômetro quadrado
	• 1 alqueire goiano = 48.400,00 metros quadrados

	• Em seguida, escreva um programa Java na qual o usuário forneça a unidade de entrada (ou seja, se é metro quadrado – opção 1, hectare – opção 2 ou alqueire – opção 3) e retorne a resposta correspondente à conversão apresentada na lista acima (ex.: “100 hectares = 1 quilômetro quadrado”). Utilize atributos e métodos estáticos.
	
//Aula 10 • Class 10 (05/10/2020)

Exercício 1: Crie uma classe para representar uma conta corrente, com métodos para depositar uma quantia, sacar uma quantia e obter o saldo. Para cada saque será debitada também uma taxa de operação equivalente à 0,5% do valor sacado. Crie, em seguida, uma subclasse da classe anterior para representar uma conta corrente de um cliente especial. Clientes especiais pagam taxas de operação de apenas 0,1% do valor sacado. 
Implemente a classe principal (Main), faça testes com as classes e verifique seus resultados. Além disso, defina os atributos de uma conta corrente, implemente os construtores e forneça um método para imprimir os valores das contas.

Exercício 2: Crie a classe Imovel, que possui um endereço e um preço, além de um método imprimeEndereco() e imprimePreco().

	a. Crie uma classe Novo, que herda Imovel e possui um adicional de 20% no preço. Crie métodos de acesso e de modificação para as variáveis de instância, além de sobrescrever o método de impressão do valor do Imovel.
	b. Crie uma classe Antigo, que herda Imovel e possui um desconto de 10% no preço. Crie métodos de acesso e de modificação para as variáveis de instância, além de sobrescrever o método de impressão do valor do Imovel com desconto.

Implemente a classe principal (Main) e crie objetos para as três classes e teste seus métodos. Implemente, também, os construtores.

//Aula 11 • Class 11 (10/10/2020)

Exercício 1: Escreva um programa que insira valores inteiros e percorra (imprima) todos os elementos em um ArrayList. Insira novos elementos, remova elementos, realize a busca de elementos e imprima a quantidade dos elementos armazenados. Utilize os métodos fornecidos pela classe ArrayList quando possível.
Em seguida, modifique seu código de forma a inserir os elementos de 1 a 100 e, em seguida, imprima todos os valores pares.

Exercício 2: Crie uma classe Funcionario que possua os seguintes atributos: nome, codigo e salario. Forneça o construtor que inicialize todos os atributos. Implemente os métodos get e set, além de um método para aumentar o salário (baseado em porcentagem fornecida como parâmetro) e um método para imprimir todos os dados do funcionário.
Na classe principal, crie, no mínimo, 5 funcionários em um ArrayList e teste seus métodos.

//Aula 13 • Class 13 (20/10/2020)

Exercício 1: Implemente as Classes abaixo, crie um ArrayList, insira objetos das classes e realize operações utilizando o conceito de herança e polimorfismo.

Exercício 2: Implemente as Classes abaixo, crie um ArrayList, insira objetos das classes e realize operações utilizando o conceito de herança e polimorfismo.

//Aula 15 • Class 15 (03/11/2020)

Exercício 1: Implemente, em Java, uma classe abstrata de nome Paciente com um atributo String nome e dois métodos:
	
	– String GetNome()
	– void Print()
	
Crie um classe derivada de Paciente de nome Assegurado:
	
	– Cujas instâncias são caracterizadas pelos atributos String seguradora e int numSeguro;
	– Implemente na classe Assegurado o método Print() herdado de Paciente e GetSeguro() para obter os atributos (dados) da classe.

Crie um classe derivada de Paciente de nome NaoAssegurado:

	– Cujas instâncias são caracterizadas pelos atributos float consulta, int banco e int cheque;
	– Implemente na classe NaoAssegurado o método Print() herdado de Paciente e GetValor() para obter os atributos (dados) da classe.

Elabore um programa de teste onde é declarado um vetor do tipo Paciente. Nesse vetor devem ser guardadas instâncias de Assegurado e NaoAssegurado a partir de uma seleção inicial. Após o usuário optar em não incluir mais pacientes, o programa de teste deve imprimir a relação de pacientes cadastrados. Implemente construtores e/ou métodos que julgar necessário.

Exercício 2: Implementar uma aplicação que declara uma variável polimórfica do tipo OperacaoMatematica. A partir de dados fornecidos pelo usuário, a aplicação deve realizar uma operação matemática e imprimir o seu resultado. Oferecer para o usuário um menu para a escolha entre as operações matemáticas disponíveis. Tratar a exceção de divisão por zero.
