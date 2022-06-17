package desafiosDeCodigo.q2;

import java.io.IOException;
import java.util.Scanner;

public class QuemPagaraConta {

	public static void main(String[] args) throws IOException {

		//a classe Scanner auxilia na leitura dos dados de entrada
		Scanner input = new Scanner(System.in);

		while(input.hasNext()){
			int entrada = input.nextInt();

			if (entrada%2 == 0) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		}

	}

}
