package br.com.dio.collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
		
		System.out.println("Crie um conjunto e adicione as notas: ");
		Set<Double> notas = new HashSet<>();
		
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		
		System.out.println(notas);
		
		System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		System.out.println("Exiba a soma dos valores: ");
		
		Iterator<Double> iterator = notas.iterator();
		
		Double soma = 0.0;
		
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		
		System.out.println("Exiba a soma dos valores: " + soma);
		
		System.out.println("Exiba a média das notas: " + soma/notas.size());
		
		System.out.println("Remova a nota 0: ");
		notas.remove(0.0);
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7 e exiva a lista: ");
		Iterator<Double> iterator2 = notas.iterator();
		
		while(iterator2.hasNext()) {
			Double next = iterator2.next();
			if(next<7)
				iterator2.remove();
		}
		
		System.out.println(notas);
		
		System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
		Set<Double> notas2 = new LinkedHashSet<>();
		
		notas2.add(7.0);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5.0);
		notas2.add(7.0);
		notas2.add(0.0);
		notas2.add(3.6);
		
		System.out.println(notas2);
		
		System.out.println("Exiba todas as notas na ordem crescente: ");
		Set<Double> notas3 = new TreeSet<>(notas2);
		
		System.out.println(notas3);
		
		System.out.println("Apague todo o conjunto");
		notas.clear();
		
		System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
		
	}

}
