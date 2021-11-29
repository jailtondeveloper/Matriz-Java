package eclipseGithub;

import java.util.Scanner;

public class HelloGit {
	
	public static void main(String[] args) {
		// MATRIZ 5X5 E SUAS CONDIÇÕES
		// ATIVIDADE JAILTON SANTANA

		Scanner scan = new Scanner(System.in);
		
		//CRIACAO DA MATRIZ E ENTRADA DE DADOS
		int[][] matriz = new int[5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Informe os valores da Matriz: [" + i + "] [" + j + "]");
				matriz[i][j] = scan.nextInt();
			}
		}
		scan.close();
		//LAÇO DE EXIBICAO DOS VALORES INFORMADOS
		System.out.println();
		int maior = 0;
		System.out.println("Exibindo a matriz...");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print("[" + matriz[i][j] + "] ");
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
			}
			System.out.println();
		}
		//1º LAÇO LÓGICO 
		System.out.println("Valores da Diagonal: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == j) {
					System.out.print("[" + matriz[i][j] + "]");

				}
			}
		}
		// 2º LAÇO LOGICO E IMPRESSAO NO CONSOLE
		System.out.println();
		System.out.println("Maior valor encontrado da diagonal: [" + maior + "]");
		System.out.println();

		System.out.println("Maior valor encontrado X cada vetor da Diagonal: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == j) {
					System.out.print("[" + matriz[i][j] * maior + "]");

				}
			}
		}

	}
}
