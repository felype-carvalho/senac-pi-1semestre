package code;

import java.util.Scanner;

public class Main {

	static String nomeJogador;
	static Scanner entrada = new Scanner(System.in);

	static String historia[] = new String[10];
	static String enunciado[] = new String[10];
	static String alternativas[] = new String[10];

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
		historia[0] = "";
		historia[1] = "";
		historia[2] = "";
		historia[3] = "";
		historia[4] = "";
		historia[5] = "";
		historia[6] = "";
		historia[7] = "";
		historia[8] = "";
		historia[9] = "";

		enunciado[0] = "";
		enunciado[1] = "";
		enunciado[2] = "";
		enunciado[3] = "";
		enunciado[4] = "";
		enunciado[5] = "";
		enunciado[6] = "";
		enunciado[7] = "";
		enunciado[8] = "";
		enunciado[9] = "";
		
		
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
