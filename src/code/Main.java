package code;

import java.util.Scanner;

public class Main {
	
	static String nomeJogador;
	static Scanner entrada = new Scanner(System.in);
	
	static String historia[] = new String [10];
	static String enunciado[] = new String [10];
	static String alternativas[] = new String [10];
	
	public static void main(String[] args) {
		
		alimentaVetores();

		System.out.println("*Mensagem de Introdução*");

		System.out.println("Qual é o seu nome? ");

		System.out.println("Digite abaixo: ");
		nomeJogador = entrada.next();
		
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
		
				
	}
	
	
	static void menu() {


		do {
			System.out.println("Bem-vindo ao Menu Principal! " + "\n 1 - Jogar" + "\n 2 - Instruções" + "\n 3 - Créditos"
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
