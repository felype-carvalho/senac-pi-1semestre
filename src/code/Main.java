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

		System.out.println("*Mensagem de Introdu��o*");

		System.out.println("Qual � o seu nome? ");

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
			System.out.println("Bem-vindo ao Menu Principal! " + "\n 1 - Jogar" + "\n 2 - Instru��es" + "\n 3 - Cr�ditos"
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
