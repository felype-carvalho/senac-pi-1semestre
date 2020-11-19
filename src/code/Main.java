package code;

import java.util.Scanner;

public class Main {

	static int contPontos = 0;
	static String nomeJogador;
	static Scanner entrada = new Scanner(System.in);

	static String historia[] = new String[10];
	static String enunciado[] = new String[10];
	static String alternativaA[] = new String[10];
	static String alternativaB[] = new String[10];
	static String alternativaC[] = new String[10];
	static String alternativaD[] = new String[10];
	static String respostaPositiva[] = new String[10];
	static String respostaNegativa[] = new String[10];
	static String respostaCerta[] = new String[10];
	
	
	public static void main(String[] args) {

		boolean confirmaCaneta = false;
		String papelCaneta;

		boolean confirmaAluno = false;
		String aluno;

		alimentaVetores();

		System.out.println("PI – O jogo da imitação\n");
		System.out.println(
				"Espero que esteja ansioso para um projeto ultrassecreto, com o objetivo de tentar quebrar o indecifrável \n"
						+ "código nazista, feito pela maquina enigma, vencer a guerra e trazer paz novamente! \n");
		System.out.println("Matemático(a), para começarmos, por favor, diga-me o seu nome:");
		nomeJogador = entrada.next();

		System.out.println("Seja bem-vindo. \n");

		do {
			System.out.println(nomeJogador + ", está com papel e caneta na mãos? Digite abaixo:");
			papelCaneta = entrada.next();

			switch (papelCaneta) {
			case "sim":
				confirmaCaneta = true;
				break;
			case "SIM":
				confirmaCaneta = true;
				break;
			case "Sim":
				confirmaCaneta = true;
				break;
			default:
				System.out.println("\nAinda não está com o papel e caneta em mãos? A gente espera sem problema.");
				break;
			}

		} while (confirmaCaneta == false);

		System.out.println("\nEntão bora lá " + nomeJogador + "...\n"
				+ "\nAntes de começar o projeto para decifrar o enigma, precisamos voltar no tempo e relembrar alguns conceitos que serão essenciais para decifrarmos os códigos...\n"
				+ "Você precisa nos provar que realmente está capacitado para esse projeto, com isso vamos começar relembrando algumas coisas do ensino médio.\n"
				+ "\nPergunta: Em que classe de grupo você ficava?");
		System.out.println("1: Os estudiosos\n" + "2: Turma do fundão\n" + "3: Matadores de Aula\n"
				+ "4: Os copiadores\n");
		do {
			
			 System.out.println("Digite a opção escolhida abaixo: ");
			 aluno = entrada.next();
			 
			switch (aluno) {
			case "1":
				System.out.println("\nParabéns, então você consegue nos ajudar nesse projeto!");
				confirmaAluno = true;
				break;

			case "2":
				System.out.println("\nVocê terá um pouco mais de dificuldade, mas lhe daremos uma chance!");
				confirmaAluno = true;
				break;

			case "3":
				System.out.println("\nPuxa, infelizmente você está dispensado do projeto");
				confirmaAluno = true;
				break;

			case "4":
				System.out.println("\nvocê terá algumas dificuldades ao longo do jogo, mas lhe daremos uma chance");
				confirmaAluno = true;
				break;

			default:
				System.out.println("Resposta Incorreta!");
				break;
			}
		} while (confirmaAluno == false);

		menu();

	}

	static void alimentaVetores() {
		
		// Vetor com os textos da História
		historia[0] = "Antes de começar o projeto para decifrar o enigma, precisamos voltar no tempo e relembrar alguns conceitos que serão essenciais para decifrarmos os códigos...";
		historia[1] = "Você precisa nos provar que realmente está capacitado para esse projeto, com isso vamos começar relembrando algumas coisas do ensino médio";
		historia[2] = "*Mensagem da história 03*";
		historia[3] = "*Mensagem da história 04*";
		historia[4] = "*Mensagem da história 05*";
		historia[5] = "*Mensagem da história 06*";
		historia[6] = "*Mensagem da história 07*";
		historia[7] = "*Mensagem da história 08*";
		historia[8] = "*Mensagem da história 09*";
		historia[9] = "*Mensagem da história 10*";

		// Vetor com os enunciados das questões
		enunciado[0] = "1)Qual é o dobro de dois elevado a décima oitava potência?\"";
		enunciado[1] = "*1 - Qual é o dobro de dois elevado a décima oitava potência?";
		enunciado[2] = "*Enunciado Pergunta 03*";
		enunciado[3] = "*Enunciado Pergunta 04*";
		enunciado[4] = "*Enunciado Pergunta 05*";
		enunciado[5] = "*Enunciado Pergunta 06*";
		enunciado[6] = "*Enunciado Pergunta 07*";
		enunciado[7] = "*Enunciado Pergunta 08*";
		enunciado[8] = "*Enunciado Pergunta 09*";
		enunciado[9] = "*Enunciado Pergunta 10*";
		
		//Vetor com as alternativas das questões
		
		
		alternativaA[0] = "a) Dois elevado a décima nona potência ";
		alternativaA[1] = "a) Respota certa";
		alternativaA[2] = "a) Respota certa";
		alternativaA[3] = "a) Respota certa";
		alternativaA[4] = "a) Respota certa";
		alternativaA[5] = "a) Respota certa";
		alternativaA[6] = "a) Respota certa";
		alternativaA[7] = "a) Respota certa";
		alternativaA[8] = "a) Respota certa";
		alternativaA[9] = "a) Respota certa";
		
		alternativaB[0] = "b)Dois elevado a trigésima sexta potência";
		alternativaB[1] = "Alternativa B pergunta 02";
		alternativaB[2] = "Alternativa B pergunta 03";
		alternativaB[3] = "Alternativa B pergunta 04";
		alternativaB[4] = "Alternativa B pergunta 05";
		alternativaB[5] = "Alternativa B pergunta 06";
		alternativaB[6] = "Alternativa B pergunta 07";
		alternativaB[7] = "Alternativa B pergunta 08";
		alternativaB[8] = "Alternativa B pergunta 09";
		alternativaB[9] = "Alternativa B pergunta 10";
		
		alternativaC[0] = "c)Um elevado a décima sexta potência";
		alternativaC[1] = "Alternativa C pergunta 02";
		alternativaC[2] = "Alternativa C pergunta 03";
		alternativaC[3] = "Alternativa C pergunta 04";
		alternativaC[4] = "Alternativa C pergunta 05";
		alternativaC[5] = "Alternativa C pergunta 06";
		alternativaC[6] = "Alternativa C pergunta 07";
		alternativaC[7] = "Alternativa C pergunta 08";
		alternativaC[8] = "Alternativa C pergunta 09";
		alternativaC[9] = "Alternativa C pergunta 10";
		
		alternativaD[0] = "d)Um elevado a trigésima nona potência";
		alternativaD[1] = "Alternativa D pergunta 02";
		alternativaD[2] = "Alternativa D pergunta 03";
		alternativaD[3] = "Alternativa D pergunta 04";
		alternativaD[4] = "Alternativa D pergunta 05";
		alternativaD[5] = "Alternativa D pergunta 06";
		alternativaD[6] = "Alternativa D pergunta 07";
		alternativaD[7] = "Alternativa D pergunta 08";
		alternativaD[8] = "Alternativa D pergunta 09";
		alternativaD[9] = "Alternativa D pergunta 10";
		
		//Vetores com as respostas postivas e negativa dependendo da resposta do usuário á questão
		respostaPositiva[0] = "";
		respostaPositiva[1] = "";
		respostaPositiva[2] = "";
		respostaPositiva[3] = "";
		respostaPositiva[4] = "";
		respostaPositiva[5] = "";
		respostaPositiva[6] = "";
		respostaPositiva[7] = "";
		respostaPositiva[8] = "";
		respostaPositiva[9] = "";
	
		respostaNegativa[0] = "";
		respostaNegativa[1] = "";
		respostaNegativa[2] = "";
		respostaNegativa[3] = "";
		respostaNegativa[4] = "";
		respostaNegativa[5] = "";
		respostaNegativa[6] = "";
		respostaNegativa[7] = "";
		respostaNegativa[8] = "";
		respostaNegativa[9] = "";
		
		//Vetor com as respostas certas
		respostaCerta[0] = "a) Respota certa"; 
		respostaCerta[1] = "a) Respota certa";
		respostaCerta[2] = "a) Respota certa";
		respostaCerta[3] = "a) Respota certa";
		respostaCerta[4] = "a) Respota certa";
		respostaCerta[5] = "a) Respota certa";
		respostaCerta[6] = "a) Respota certa";
		respostaCerta[7] = "a) Respota certa";
		respostaCerta[8] = "a) Respota certa";
		respostaCerta[9] = "a) Respota certa";
		
	}

	static void menu() {

		do {
			System.out.println(
					"\nBem-vindo ao Menu Principal! " + "\n 1 - Jogar" + "\n 2 - Instruções" + "\n 3 - Créditos"
							+ "\n 4 - Sair" + "\nSelecione uma opção digitando por seu número equivalente:");

			switch (entrada.nextInt()) {
			case 1:
				opJogar();

			case 2:

				opIntrucoes();

			case 3:
				opCreditos();

				break;
			case 4:
				opSair();

			default:
				System.out.println("Opção Invalida! Digite Novamente");
				break;
			}
		} while (true);

	}

	static void opJogar() {
		System.out.println("|---Opção Jogar---|");
		
		String resposta;
		boolean confimaResposta = false;
        
		for (int i = 0; i <= 9; i++) {
			//System.out.println(i);
			
			System.out.println(historia[i]);
			System.out.println(enunciado[i]);
			System.out.println(alternativaA[i]);
			System.out.println(alternativaB[i]);
			System.out.println(alternativaC[i]);
			System.out.println(alternativaD[i]);
			
//			if(numPergunta == 10) {
//				perguntaSecreta();
//			}
				
			do {
				
				 System.out.println("Digite a opção escolhida abaixo: ");
				 resposta = entrada.next();
				 
				switch (resposta) {
				
				// Variações de "A"
				
				case "a":
					System.out.println("\n");
					if(alternativaA[i] == respostaCerta[i]) {
						System.out.println("Acertou!!!!");
						contPontos++; 
					}
					
					confimaResposta = true;
					break;
				case "A":
					System.out.println("\n");
					if(alternativaA[i] == respostaCerta[i]) {
						System.out.println("Acertou!!!!");
						contPontos++; 
					}
					confimaResposta = true;
					break;
					
					// Variações de "B"
					
				case "b":
					System.out.println("\n");
					if(alternativaB[i] == respostaCerta[i]) {
						System.out.println("Acertou!!!!");
						contPontos++; 
					}
					confimaResposta = true;
					break;
				case "B":
					System.out.println("\n");
					if(alternativaB[i] == respostaCerta[i]) {
						System.out.println("Acertou!!!!");
						contPontos++; 
					}
					confimaResposta = true;
					break;
					
					// Variações de "C"
					
				case "c":
					System.out.println("\n");
					confimaResposta = true;
					if(alternativaC[i] == respostaCerta[i]) {
						System.out.println("Acertou!!!!");
						contPontos++; 
					}
					break;
					
				case "C":
					System.out.println("\n");
					confimaResposta = true;
					if(alternativaC[i] == respostaCerta[i]) {
						System.out.println("Acertou!!!!");
						contPontos++; 
					}
					break;
					
					// Variações de "D"
					
				case "d":
					System.out.println("\n");
					confimaResposta = true;
					if(alternativaD[i] == respostaCerta[i]) {
						System.out.println("Acertou!!!!");
						contPontos++; 
					}
					break;
					
				case "D":
					System.out.println("\n");
					confimaResposta = true;
					if(alternativaD[i] == respostaCerta[i]) {
						System.out.println("Acertou!!!!");
						contPontos++; 
					}
					break;
					
					//Default
					
				default:
					System.out.println("Resposta Incorreta!");
					break;
				}
			} while (confimaResposta == false);
			
			
			
			
		}
		
	}

	static void opIntrucoes() {
		System.out.println("|---Opção Instruções---|");

	}

	static void opCreditos() {
		System.out.println("|---Opção Créditos---|");

	}

	static void opSair() {
		System.out.println("|---Opção Sair---|");
		System.exit(0);
	}

}
