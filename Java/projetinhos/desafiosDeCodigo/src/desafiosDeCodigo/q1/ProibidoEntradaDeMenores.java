package desafiosDeCodigo.q1;

import java.util.Scanner;

public class ProibidoEntradaDeMenores {

	public static void main(String[] args) {

		//a classe Scanner auxilia na leitura dos dados de entrada
		Scanner scan = new Scanner(System.in);

		int N= scan.nextInt();

		int[] idade = new int[N];        

		for (int i = 0; i < N; i++){
			idade[i] = scan.nextInt();
		}

		System.out.println("Nao poderao entrar as idades: ");
		for (int age: idade) {
			if(age < 18)
				System.out.println(age);
		}

	}

}
