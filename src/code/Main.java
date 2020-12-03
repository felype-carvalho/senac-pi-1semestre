package code;

import java.util.Random;
import java.util.Scanner;
public class Main {

	static long milisPorChar = 1;
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

	public static void main(String[] args) throws InterruptedException {

		boolean confirmaCaneta = false;
		String papelCaneta;

		boolean confirmaAluno = false;
		String aluno;

		alimentaVetores();

		digita("PI – O jogo da imitação \n\n", milisPorChar);
//		System.out.println("\n");
//		
		digita(
				"Espero que esteja ansioso para um projeto ultrassecreto, com o objetivo de tentar quebrar o indecifrável \n"
						+ "código nazista, feito pela maquina enigma, vencer a guerra e trazer paz novamente! \n", milisPorChar);
		digita("\nMatemático(a), para começarmos, por favor, diga-me o seu nome: \n", milisPorChar);
		nomeJogador = entrada.next();
		digita("\nSeja bem-vindo. \n", milisPorChar);
		

		do {
			digita(nomeJogador + ", está com papel e caneta na mãos? Digite abaixo: \n", milisPorChar);
			papelCaneta = entrada.next();
			
			papelCaneta = papelCaneta.toUpperCase();

			switch (papelCaneta) {
			
			case "SIM":
				confirmaCaneta = true;
				break;
		
			default:
				System.out.println("\nAinda não está com o papel e caneta em mãos? A gente espera sem problema.");
				break;
			}

		} while (confirmaCaneta == false);

		digita("\nEntão bora lá " + nomeJogador + "...\n"
				+ "\nAntes de começar o projeto para decifrar o enigma, precisamos voltar no tempo e relembrar alguns conceitos que serão essenciais para decifrarmos os códigos...\n"
				+ "Você precisa nos provar que realmente está capacitado para esse projeto, com isso vamos começar relembrando algumas coisas do ensino médio.\n"
				+ "\nPergunta: Em que classe de grupo você ficava?\n", milisPorChar);
		digita(
				"1: Os estudiosos\n" + "2: Turma do fundão\n" + "3: Matadores de Aula\n" + "4: Os copiadores\n", milisPorChar);
		do {

			digita("Digite a opção escolhida abaixo: ", milisPorChar);
			aluno = entrada.next();

			switch (aluno) {
			case "1":
				digita("\nParabéns, então você consegue nos ajudar nesse projeto!", milisPorChar);
				confirmaAluno = true;
				break;

			case "2":
				digita("\nVocê terá um pouco mais de dificuldade, mas lhe daremos uma chance!", milisPorChar);
				confirmaAluno = true;
				break;

			case "3":
				digita("\nPuxa, infelizmente você está dispensado do projeto", milisPorChar);
				opSair();

			case "4":
				digita("você terá algumas dificuldades ao longo do jogo, mas lhe daremos uma chance", milisPorChar);
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
		historia[4] = "Agora antes de entrar na guerra, para provar que voce é qualificado para nos ajudar a\r\n" + 
				"decodificar o codigo, devemos testar suas habiliadades para provar o seu conhecimento\r\n" + 
				"tecnico e suas capacidades dedutivas.\r\n" + 
				". Agora que estamos pertos do primeiro sucesso, surgiu um problema mais difícil, envolve  expressões equivalentes, seja o gênio que precisamos...\r\n"
				+ "Respira e vamos ao primeiro sucesso...\r\n" + "";
		historia[5] = "Estamos chegando no momento perto de interceptar o primeiro ataque nazista, a partir daqui, cada ação que você tomar pode salvar ou matar mais vidas...*";
		historia[6] = "Agora que conseguimos interceptar o primeiro ataque, estamos no meio do jogo, continue assim e logo venceremos essa guerra, me ajude com um código, é o seguinte...";
		historia[7] = "Os nazistas estão tentando entrar em contado com o grande navio de guerra Bismark que está\r\n" + 
				"a procura de uma saida para o oceano, como ajudante do deparatmento de comunicações do\r\n" + 
				"Exercito britanico, sua missão sera triangular a posição da torre de cominicações\r\n" + 
				"alemã no pacifico:";
		historia[8] = "Perfeito, agora que a base esta pronta, devemos nos concentrar em criar os vetores\r\n" + 
				"necessarios para a configuração do codigo que desvendara a criptografia da Enigma, que\r\n" + 
				"foram encontrados parcialmente por Alan Turing, basta terminar o que ele já começou:";
		historia[9] = "Agora só falta o ultimo ingrediente que são as variaveis da maquina que conseguimos na\r\n" + 
				"vitoria contra o navio Bismark, faça a engenharia reversa da maquina e insira as variaveis no\r\n" + 
				"computador:\r\n" + 
				"A vitória será nossa, milhões de vidas serão salvas e ficaremos marcados na história!!!";

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

		alternativaA[0] = "Dois elevado a décima nona potência";
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
		respostaPositiva[0] = "PARABÉNS, AGORA ACREDITAMOS EM VOCE PARA DECIFRAR O EGNIMA";
		respostaPositiva[1] = "Boa! Matemático, você é a nossa esperança, parabéns pelo raciocínio...";
		respostaPositiva[2] = "Isso ai gênio! Estamos perto de interceptar o primeiro ataque dos malditos nazistas!";
		respostaPositiva[3] = "Parabéns! Conseguimos interceptar o primeiro ataque, com isso salvamos milhares de vida, estamos no caminho certo...";
		respostaPositiva[4] = "Isso ai gênio! Conseguimos impedir o primeiro ataque, estamos caminhando ao sucesso!";
		respostaPositiva[5] = ": Aha! Uma base na Groelândia, essa descoberta nos trará a vantagem";
		respostaPositiva[6] = "Parece que tentaram fazer os reparos em altom mar em vez de um porto,\r\n" + 
				"será nossa chance";
		respostaPositiva[7] = "Continue assim e logo estaremos voltando em paz para casa!";
		respostaPositiva[8] = "Quanta emoção! Finalmente estamos perto do fim, falta só mais uma";
		respostaPositiva[9] = "Vitória Vitória Vitória, a enigma foi decifrada e os nazistas derrotados!!! PARABÉNS!!!";

		respostaNegativa[0] = "Puxa! Errou na primeira, não nos decpicone!";
		respostaNegativa[1] = "Não! Não nos faça se arrepender por ter escolhido você, lá vai uma dica para que você não erre.";
		respostaNegativa[2] = "Não! Estamos tão perto do fracasso, não podemos errar de novo, milhares de vidas dependem disso!";
		respostaNegativa[3] = "Não! Vidas foram perdidas com esse erro, não podemos dar esse gostinho aos nazistas novamente...";
		respostaNegativa[4] = "Não! Milhares de vidas dependem disso! Tome mais cuidado!";
		respostaNegativa[5] = " Parece que o codigo vai precisar de aprimoramento!";
		respostaNegativa[6] = "Estou começando achar que você é um espião";
		respostaNegativa[7] = "Não!!! não erre novamente";
		respostaNegativa[8] = "Meu Deus, estavamos tão perto da vitória";
		respostaNegativa[9] = "Não Acredito, só faltava isso para vencermos essa guerra!";

		// Vetor com as respostas certas
		respostaCerta[0] = "Dois elevado a décima nona potência";
		respostaCerta[1] = "1010";
        respostaCerta[2] = "b^9/5";
        respostaCerta[3] = "(d^5)^1/8";
        respostaCerta[4] = "-5^3 - 28y^2-33y+18";
        respostaCerta[5] = "a^2a^7";
        respostaCerta[6] = "x^4-2x^2-24";
        respostaCerta[7] = "5";
        respostaCerta[8] = "-10";
        respostaCerta[9] = "-5 ; 5";

	}

	public static void digita(String mensagem, long milisPorChar) throws InterruptedException {
		for (int i = 0; i < mensagem.length(); i++) {
			System.out.print(mensagem.charAt(i));

			Thread.sleep(milisPorChar);
		}
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

	static void menu() throws InterruptedException {

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

	public static void opJogar() throws InterruptedException {
		System.out.println("|---Opção Jogar---|");
		
		int contPontos = 0;
		String aux1; 

		String resposta = null;
		boolean confimaResposta = false;

		for (int i = 0; i <= 9; i++) {
			
			String altA = "a) ", altB = "b) ", altC = "c) ", altD = "d) ";

			System.out.println("\n");
			aux1 = historia[i];
			digita(aux1, milisPorChar);
			
			System.out.println("\n");
			aux1 = enunciado[i];
			digita(aux1, milisPorChar);
			
			System.out.println("\n");
			aux1 = alternativaA[i];
			aux1 = altA.concat(aux1);
			digita(aux1, milisPorChar);
			
			System.out.println("");
			aux1 = alternativaB[i];
			aux1 = altB.concat(aux1);
			digita(aux1, milisPorChar);
			
			System.out.println("");
			aux1 = alternativaC[i];
			aux1 = altC.concat(aux1);
			digita(aux1, milisPorChar);
			
			System.out.println("");
			aux1 = alternativaD[i];
			aux1 = altD.concat(aux1);
			digita(aux1, milisPorChar);
			System.out.println("\n");
			
//			if(numPergunta == 10) {
//				perguntaSecreta();
//			}

			do {

				System.out.println("Digite a opção escolhida abaixo: ");
				resposta = entrada.next();
				String aux2 = "";

				resposta = resposta.toUpperCase();
				switch (resposta) {

				case "A":
					System.out.println("");
					if (alternativaA[i] == respostaCerta[i]) {
						aux2 = respostaPositiva[i];
						digita(aux2, milisPorChar);
						contPontos++;
					} else {
						aux2 = respostaNegativa[i];
						digita(aux2, milisPorChar);
						confimaResposta = true;
					}
					break;

				case "B":
					System.out.println("");
					if (alternativaB[i] == respostaCerta[i]) {
						aux2 = respostaPositiva[i];
						digita(aux2, milisPorChar);
						contPontos++;
					} else {
						aux2 = respostaNegativa[i];
						digita(aux2, milisPorChar);
						confimaResposta = true;
					}

				case "C":
					System.out.println("");
					confimaResposta = true;
					if (alternativaC[i] == respostaCerta[i]) {
						aux2 = respostaPositiva[i];
						digita(aux2, milisPorChar);
						contPontos++;
					} else {
						aux2 = respostaNegativa[i];
						digita(aux2, milisPorChar);
						confimaResposta = true;
					}
					break;

				case "D":
					System.out.println("");
					confimaResposta = true;
					if (alternativaD[i] == respostaCerta[i]) {
						aux2 = respostaPositiva[i];
						digita(aux2, milisPorChar);
						contPontos++;
					} else {
						aux2 = respostaNegativa[i];
						digita(aux2, milisPorChar);
						confimaResposta = true;
					}
					break;

				// Default
				default:
					digita("Respotas Invalida!", milisPorChar);
					break;
				}
			} while (confimaResposta == false);

		}

		System.out.println("Você acertou " + contPontos + " pontos \n");
		finalJogo(contPontos);
	}

	static void opIntrucoes() {
		System.out.println("|---Opção Instruções---|");

	}

	static void opCreditos() {
		System.out.println("|---Opção Créditos---|");

	}

	static void opSair() throws InterruptedException {
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
		} while (confirmaResp == false);

	}

	static void finalJogo(int contPontos) throws InterruptedException {

		if (contPontos <= 3) {
			System.out.println("Final Ruim");
			opSair();
		} else if (contPontos <= 5) {
			System.out.println("Final mais ou menos ruim");
			opSair();
		} else if (contPontos <= 7) {
			System.out.println("Final mais ou menos bom");
			opSair();
		} else {
			System.out.println("Final bom");
			opSair();
		}
	}
}
