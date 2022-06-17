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
				System.out.print(index + " - " + "Janeiro: " + elem + "�\n");
			else if(index == 2)
				System.out.print(index + " - " + "Fevereiro: " + elem + "�\n");
			else if(index == 3)
				System.out.print(index + " - " + "Mar�o: " + elem + "�\n");
			else if(index == 4)
				System.out.print(index + " - " + "Abril: " + elem + "�\n");
			else if(index == 5)
				System.out.print(index + " - " + "Maio: " + elem + "�\n");
			else
				System.out.print(index + " - " + "Junho: " + elem + "�\n");
		}
		
		System.out.println("M�dia: " + soma/temperaturas.size()+ "�");
		
//		System.out.println(temperaturas);
		
	}
}
