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

		System.out.println("PI � O jogo da imita��o\n");
		System.out.println(
				"Espero que esteja ansioso para um projeto ultrassecreto, com o objetivo de tentar quebrar o indecifr�vel \n"
						+ "c�digo nazista, feito pela maquina enigma, vencer a guerra e trazer paz novamente! \n");
		System.out.println("Matem�tico(a), para come�armos, por favor, diga-me o seu nome:");
		nomeJogador = entrada.next();

		System.out.println("Seja bem-vindo. \n");

		do {
			System.out.println(nomeJogador + ", est� com papel e caneta na m�os? Digite abaixo:");
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
				System.out.println("\nAinda n�o est� com o papel e caneta em m�os? A gente espera sem problema.");
				break;
			}

		} while (confirmaCaneta == false);

		System.out.println("\nEnt�o bora l� " + nomeJogador + "...\n"
				+ "\nAntes de come�ar o projeto para decifrar o enigma, precisamos voltar no tempo e relembrar alguns conceitos que ser�o essenciais para decifrarmos os c�digos...\n"
				+ "Voc� precisa nos provar que realmente est� capacitado para esse projeto, com isso vamos come�ar relembrando algumas coisas do ensino m�dio.\n"
				+ "\nPergunta: Em que classe de grupo voc� ficava?");
		System.out.println("1: Os estudiosos\n" + "2: Turma do fund�o\n" + "3: Matadores de Aula\n"
				+ "4: Os copiadores\n");
		do {
			
			 System.out.println("Digite a op��o escolhida abaixo: ");
			 aluno = entrada.next();
			 
			switch (aluno) {
			case "1":
				System.out.println("\nParab�ns, ent�o voc� consegue nos ajudar nesse projeto!");
				confirmaAluno = true;
				break;

			case "2":
				System.out.println("\nVoc� ter� um pouco mais de dificuldade, mas lhe daremos uma chance!");
				confirmaAluno = true;
				break;

			case "3":
				System.out.println("\nPuxa, infelizmente voc� est� dispensado do projeto");
				confirmaAluno = true;
				break;

			case "4":
				System.out.println("\nvoc� ter� algumas dificuldades ao longo do jogo, mas lhe daremos uma chance");
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
		
		// Vetor com os textos da Hist�ria
		historia[0] = "Antes de come�ar o projeto para decifrar o enigma, precisamos voltar no tempo e relembrar alguns conceitos que ser�o essenciais para decifrarmos os c�digos...";
		historia[1] = "Voc� precisa nos provar que realmente est� capacitado para esse projeto, com isso vamos come�ar relembrando algumas coisas do ensino m�dio";
		historia[2] = "*Mensagem da hist�ria 03*";
		historia[3] = "*Mensagem da hist�ria 04*";
		historia[4] = "*Mensagem da hist�ria 05*";
		historia[5] = "*Mensagem da hist�ria 06*";
		historia[6] = "*Mensagem da hist�ria 07*";
		historia[7] = "*Mensagem da hist�ria 08*";
		historia[8] = "*Mensagem da hist�ria 09*";
		historia[9] = "*Mensagem da hist�ria 10*";

		// Vetor com os enunciados das quest�es
		enunciado[0] = "1)Qual � o dobro de dois elevado a d�cima oitava pot�ncia?\"";
		enunciado[1] = "*1 - Qual � o dobro de dois elevado a d�cima oitava pot�ncia?";
		enunciado[2] = "*Enunciado Pergunta 03*";
		enunciado[3] = "*Enunciado Pergunta 04*";
		enunciado[4] = "*Enunciado Pergunta 05*";
		enunciado[5] = "*Enunciado Pergunta 06*";
		enunciado[6] = "*Enunciado Pergunta 07*";
		enunciado[7] = "*Enunciado Pergunta 08*";
		enunciado[8] = "*Enunciado Pergunta 09*";
		enunciado[9] = "*Enunciado Pergunta 10*";
		
		//Vetor com as alternativas das quest�es
		
		
		alternativaA[0] = "a) Dois elevado a d�cima nona pot�ncia ";
		alternativaA[1] = "a) Respota certa";
		alternativaA[2] = "a) Respota certa";
		alternativaA[3] = "a) Respota certa";
		alternativaA[4] = "a) Respota certa";
		alternativaA[5] = "a) Respota certa";
		alternativaA[6] = "a) Respota certa";
		alternativaA[7] = "a) Respota certa";
		alternativaA[8] = "a) Respota certa";
		alternativaA[9] = "a) Respota certa";
		
		alternativaB[0] = "b)Dois elevado a trig�sima sexta pot�ncia";
		alternativaB[1] = "Alternativa B pergunta 02";
		alternativaB[2] = "Alternativa B pergunta 03";
		alternativaB[3] = "Alternativa B pergunta 04";
		alternativaB[4] = "Alternativa B pergunta 05";
		alternativaB[5] = "Alternativa B pergunta 06";
		alternativaB[6] = "Alternativa B pergunta 07";
		alternativaB[7] = "Alternativa B pergunta 08";
		alternativaB[8] = "Alternativa B pergunta 09";
		alternativaB[9] = "Alternativa B pergunta 10";
		
		alternativaC[0] = "c)Um elevado a d�cima sexta pot�ncia";
		alternativaC[1] = "Alternativa C pergunta 02";
		alternativaC[2] = "Alternativa C pergunta 03";
		alternativaC[3] = "Alternativa C pergunta 04";
		alternativaC[4] = "Alternativa C pergunta 05";
		alternativaC[5] = "Alternativa C pergunta 06";
		alternativaC[6] = "Alternativa C pergunta 07";
		alternativaC[7] = "Alternativa C pergunta 08";
		alternativaC[8] = "Alternativa C pergunta 09";
		alternativaC[9] = "Alternativa C pergunta 10";
		
		alternativaD[0] = "d)Um elevado a trig�sima nona pot�ncia";
		alternativaD[1] = "Alternativa D pergunta 02";
		alternativaD[2] = "Alternativa D pergunta 03";
		alternativaD[3] = "Alternativa D pergunta 04";
		alternativaD[4] = "Alternativa D pergunta 05";
		alternativaD[5] = "Alternativa D pergunta 06";
		alternativaD[6] = "Alternativa D pergunta 07";
		alternativaD[7] = "Alternativa D pergunta 08";
		alternativaD[8] = "Alternativa D pergunta 09";
		alternativaD[9] = "Alternativa D pergunta 10";
		
		//Vetores com as respostas postivas e negativa dependendo da resposta do usu�rio � quest�o
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
					"\nBem-vindo ao Menu Principal! " + "\n 1 - Jogar" + "\n 2 - Instru��es" + "\n 3 - Cr�ditos"
							+ "\n 4 - Sair" + "\nSelecione uma op��o digitando por seu n�mero equivalente:");

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
				System.out.println("Op��o Invalida! Digite Novamente");
				break;
			}
		} while (true);

	}

	static void opJogar() {
		System.out.println("|---Op��o Jogar---|");
		
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
				
				 System.out.println("Digite a op��o escolhida abaixo: ");
				 resposta = entrada.next();
				 
				switch (resposta) {
				
				// Varia��es de "A"
				
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
					
					// Varia��es de "B"
					
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
					
					// Varia��es de "C"
					
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
					
					// Varia��es de "D"
					
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
		System.out.println("|---Op��o Instru��es---|");

	}

	static void opCreditos() {
		System.out.println("|---Op��o Cr�ditos---|");

	}

	static void opSair() {
		System.out.println("|---Op��o Sair---|");
		System.exit(0);
	}

}
