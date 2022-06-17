package br.com.dio.collection.list.exercicios;

import java.util.ArrayList;
import java.util.List;

public class MediaTemperaturas {
	public static void main(String[] args) {
		List<Double> temperaturas = new ArrayList<>();
		
		temperaturas.add(4.0);
		temperaturas.add(10.0);
		temperaturas.add(8.0);
		temperaturas.add(12.0);
		temperaturas.add(15.0);
		temperaturas.add(18.0);
		
		Double soma = 0.0;
		int index = 0;
		
		for (Double elem : temperaturas) {
			soma += elem;
			index = temperaturas.indexOf(elem) + 1;
			
			if(index == 1)
				System.out.print(index + " - " + "Janeiro: " + elem + "º\n");
			else if(index == 2)
				System.out.print(index + " - " + "Fevereiro: " + elem + "º\n");
			else if(index == 3)
				System.out.print(index + " - " + "Março: " + elem + "º\n");
			else if(index == 4)
				System.out.print(index + " - " + "Abril: " + elem + "º\n");
			else if(index == 5)
				System.out.print(index + " - " + "Maio: " + elem + "º\n");
			else
				System.out.print(index + " - " + "Junho: " + elem + "º\n");
		}
		
		System.out.println("Média: " + soma/temperaturas.size()+ "º");
		
//		System.out.println(temperaturas);
		
	}
}
