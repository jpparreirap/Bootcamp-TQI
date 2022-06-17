package desafiosDeCodigo.q5;

import java.util.Scanner;

public class DuasNotas {

	public static void main(String[] args) {
		//a classe Scanner auxilia na leitura dos dados de entrada
		Scanner leitor = new Scanner(System.in);

		while (true) {
			int N = leitor.nextInt();
			int M = leitor.nextInt();

			int troco = M - N;

			int[] notas = {2, 5, 10, 20, 50, 100};

			boolean possivel = false;

			if (N == 0 && M == 0) 
				break;

			for (int i = 0; i < notas.length; i++) {
				for (int j = 0; j < notas.length; j++) {
					if(troco - notas[j] == notas[i])
						possivel = true;
				}
			}

			if(possivel) 
				System.out.println("possible");
			else
				System.out.println("impossible");
		}

	}

}
