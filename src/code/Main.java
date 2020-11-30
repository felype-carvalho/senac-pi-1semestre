package code;

import java.util.Scanner;
import java.util.Random;

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
	static String embaralha[] = new String[4];
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
		System.out.println(
				"1: Os estudiosos\n" + "2: Turma do fundão\n" + "3: Matadores de Aula\n" + "4: Os copiadores\n");
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
				opSair();

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
		historia[2] = "Agora que você faz parte do projeto ultra secreto, vamos por a mão na massa!\r\n"
				+ "Muitas vidas já foram perdidas com essa guerra, estamos correndo contra o tempo para salvar o maior número de pessoas e vencer a guerra.\r\n"
				+ "Temos que começar resolvendo essa primeira questão, vamos lá...\r\n" + "";
		historia[3] = "*Agora faremos uma viagem para nossa base militar, os desafios se tornarão maiores e precisamos que você esteja concentrado para vencer...\r\n"
				+ "A enigma funciona com diversos códigos que mudam a cada ataque do inimigo, conseguimos resgatar um, mas não temos a resposta, vejamos se você pode nos ajudar...\r\n"
				+ "";
		historia[4] = "Agora que estamos pertos do primeiro sucesso, surgiu um problema mais difícil, envolve  expressões equivalentes, seja o gênio que precisamos...\r\n"
				+ "Respira e vamos ao primeiro sucesso...\r\n" + "";
		historia[5] = "*Mensagem da história 06*";
		historia[6] = "*Mensagem da história 07*";
		historia[7] = "*Mensagem da história 08*";
		historia[8] = "*Mensagem da história 09*";
		historia[9] = "*Mensagem da história 10*";

		// Vetor com os enunciados das questões
		enunciado[0] = "1) Qual é o dobro de dois elevado a décima oitava potência?\"";
		enunciado[1] = "2) No sistema de numeração de base binária, como escrevemos o número 10?";
		enunciado[2] = "3) Quais expressões são equivalentes a raiz[5](b^9)? ";
		enunciado[3] = "4) Quais expressões são equivalentes a (d^1/8)^5?";
		enunciado[4] = "5) Sua resposta deve ser um polinômio na forma padrão. ";
		enunciado[5] = "6) Qual expressão exponencial é equivalente a (^7a)^2 ?";
		enunciado[6] = "7) Sua resposta deve ser um polinômio na forma padrão(x^2+4)(x^2−6)";
		enunciado[7] = "8) Descubra o numero escondido por trás do código abaixo: 3x – 15 = 5x + 25";
		enunciado[8] = "9) Descubra o numero escondido por trás do código abaixo: 2.(3x-10) = 8x.(10-4)²";
		enunciado[9] = "10) Decodifique as raízes do criptografo dos nazista: x² - 10x – 25 = 0";

		// Vetor com as alternativas das questões

		alternativaA[0] = "Dois elevado a décima nona potência ";
		alternativaA[1] = "1010";
		alternativaA[2] = "(b^5)^1/9";
		alternativaA[3] = "(d^5)^8";
		alternativaA[4] = "-5^3 - 28y^2-33y+18";
		alternativaA[5] = "a^7a^2";
		alternativaA[6] = "x^4-2x^2-28";
		alternativaA[7] = "20";
		alternativaA[8] = "-20";
		alternativaA[9] = "-25 ; 5";

		alternativaB[0] = "Dois elevado a trigésima sexta potência";
		alternativaB[1] = "11";
		alternativaB[2] = "b^5/9";
		alternativaB[3] = "(raiz[8](d))^5";
		alternativaB[4] = "-5^3 - 28y^2-33y+17";
		alternativaB[5] = "a^2a^7";
		alternativaB[6] = "x^4-2x^2-22";
		alternativaB[7] = "15";
		alternativaB[8] = "-10*";
		alternativaB[9] = "-5;5*";

		alternativaC[0] = "Um elevado a décima sexta potência";
		alternativaC[1] = "1001";
		alternativaC[2] = "b^9/5 ";
		alternativaC[3] = "(d^5)^1/8";
		alternativaC[4] = "-5^3 - 28y^2-33y+16";
		alternativaC[5] = "2|7";
		alternativaC[6] = "x^4-2x^2-24";
		alternativaC[7] = "10";
		alternativaC[8] = "-6";
		alternativaC[9] = "25;-10";

		alternativaD[0] = "Um elevado a trigésima nona potência";
		alternativaD[1] = "22";
		alternativaD[2] = "Nenhuma das anteriores";
		alternativaD[3] = "Nenhuma das anteriores";
		alternativaD[4] = "Nenhuma das anteriores";
		alternativaD[5] = "Nenhuma das anteriores";
		alternativaD[6] = "Nenhuma das anteriores";
		alternativaD[7] = "5";
		alternativaD[8] = "6";
		alternativaD[9] = "-10 ; 10";

		// Deixando as alternativas aleatórias

		for (int i = 0; i <= 9; i++) {

			embaralha[0] = alternativaA[i];
			embaralha[1] = alternativaB[i];
			embaralha[2] = alternativaC[i];
			embaralha[3] = alternativaD[i];
			
			embaralhaVetores(embaralha);

			alternativaA[i] = embaralha[0];
			alternativaB[i] = embaralha[1];
			alternativaC[i] = embaralha[2];
			alternativaD[i] = embaralha[3];

		}

		// Vetores com as respostas postivas e negativa dependendo da resposta do
		// usuário á questão
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

		// Vetor com as respostas certas
		respostaCerta[0] = "";
		respostaCerta[1] = "";
		respostaCerta[2] = "";
		respostaCerta[3] = "";
		respostaCerta[4] = "";
		respostaCerta[5] = "";
		respostaCerta[6] = "";
		respostaCerta[7] = "";
		respostaCerta[8] = "";
		respostaCerta[9] = "";

	}

	static void embaralhaVetores(String embaralha[]) {
		
		Random random = new Random();
		
		for (int i = 0; i < embaralha.length; i++) {
			// sorteia um índice
			int j = random.nextInt(embaralha.length);

			// troca o conteúdo dos índices i e j do vetor
			String temp = embaralha[i];
			embaralha[i] = embaralha[j];
			embaralha[j] = temp;
		}
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

	public static void opJogar() {
		System.out.println("|---Opção Jogar---|");

		String resposta;
		boolean confimaResposta = false;

		for (int i = 0; i <= 9; i++) {
			// System.out.println(i);

			System.out.println("\n" + historia[i]);
			System.out.println("\n" + enunciado[i]);
			System.out.println("a) " + alternativaA[i]);
			System.out.println("b) " + alternativaB[i]);
			System.out.println("c) " + alternativaC[i]);
			System.out.println("d) " + alternativaD[i] + "\n");

//			if(numPergunta == 10) {
//				perguntaSecreta();
//			}

			do {

				System.out.println("Digite a opção escolhida abaixo: ");
				resposta = entrada.next();
				
				resposta.toUpperCase();

				switch (resposta) {

				case "A":
					System.out.println("\n");
					if (alternativaA[i] == respostaCerta[i]) {
						System.out.println("Acertou!!!!");
						contPontos++;
					}
					confimaResposta = true;
					break;

				case "B":
					System.out.println("\n");
					if (alternativaB[i] == respostaCerta[i]) {
						System.out.println("Acertou!!!!");
						contPontos++;
					}
					confimaResposta = true;
					break;



				case "C":
					System.out.println("\n");
					confimaResposta = true;
					if (alternativaC[i] == respostaCerta[i]) {
						System.out.println("Acertou!!!!");
						contPontos++;
					}
					break;

				case "D":
					System.out.println("\n");
					confimaResposta = true;
					if (alternativaD[i] == respostaCerta[i]) {
						System.out.println("Acertou!!!!");
						contPontos++;
					}
					break;

				// Default

				default:
					System.out.println("Resposta Incorreta!");
					break;
				}
			} while (confimaResposta == false);

		}

		System.out.println("Você acertou " + contPontos + " pontos");
		opSair();
	}

	static void opIntrucoes() {
		System.out.println("|---Opção Instruções---|");

	}

	static void opCreditos() {
		System.out.println("|---Opção Créditos---|");

	}

	static void opSair() {
		boolean confirmaResp = false;
		String resp;
		
		System.out.println("\n |---Fim de Jogo---|");
		
		do {
			System.out.println("Deseja ir para o menu principal? ");
			System.out.println("Digite Abaixo:");
			
			resp = entrada.next();
			resp.toUpperCase();
			
			switch (resp) {
			case "SIM":
				menu();
				
				break;
			case "NÃO":
				System.out.println("\nAté a proxíma!");
				System.exit(0);
				
				break;
			default:
				System.out.println("Respota ");
				break;
			}
		} while(confirmaResp == false);
		
	}

}
