package desafiosDeCodigo.q3;

import java.util.Scanner;

public class DistanciaEntreDoisPontos {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//P1
		String valuesP1 = input.nextLine();
		String[] p1 = valuesP1.split(" ");

		//P2
		String valuesP2 = input.nextLine();
		String[] p2 = valuesP2.split(" ");

		Double distancia = 0.0;
		Double difX = Double.parseDouble(p2[0]) - Double.parseDouble(p1[0]);
		Double difY = Double.parseDouble(p2[1]) - Double.parseDouble(p1[1]);

		distancia = Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));

		System.out.printf("%.4f\n", distancia);

	}

}
