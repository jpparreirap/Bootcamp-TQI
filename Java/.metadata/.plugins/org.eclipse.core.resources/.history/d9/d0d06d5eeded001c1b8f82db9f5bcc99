package br.com.dio.collection.set.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class CoresArcoIris {

	public static void main(String[] args) {
		// VERMELHO LARANJA AMARELO VERDE AZUL ANIL VIOLETA
		Set<ArcoIris> arcoIris = new HashSet<>();
		
		arcoIris.add(new ArcoIris("VERMELHO"));
		arcoIris.add(new ArcoIris("LARANJA"));
		arcoIris.add(new ArcoIris("AMARELO"));
		arcoIris.add(new ArcoIris("VERDE"));
		arcoIris.add(new ArcoIris("AZUL"));
		arcoIris.add(new ArcoIris("ANIL"));
		arcoIris.add(new ArcoIris("VIOLETA"));
		
		System.out.println("Exiba todas as cores uma abaixo da outra: ");
		for (ArcoIris cor : arcoIris) {
			System.out.println(cor.getNomeCor());
		}
		
		System.out.println("\nA quantidade de cores que o arco-íris tem: " + arcoIris.size());
		
		System.out.println("\nExiba as cores em ordem alfabética: ");
		Set<ArcoIris> arcoIris2 = new TreeSet<>(new ComparatorNome());
		arcoIris2.addAll(arcoIris);
		
		for (ArcoIris cor : arcoIris2) {
			System.out.println(cor.getNomeCor());
		}
		System.out.println("\nExiba as cores na ordem inversa da que foi informada: ");
		Set<ArcoIris> arcoIris3 = new LinkedHashSet<>() {{
			add(new ArcoIris("VERMELHO"));
			add(new ArcoIris("LARANJA"));
			add(new ArcoIris("AMARELO"));
			add(new ArcoIris("VERDE"));
			add(new ArcoIris("AZUL"));
			add(new ArcoIris("ANIL"));
			add(new ArcoIris("VIOLETA"));
		}};
		
		ArrayList<ArcoIris> arrCores = new ArrayList<>(arcoIris3);
		Collections.reverse(arrCores);
		
		for (ArcoIris cor : arrCores) {
			System.out.println(cor.getNomeCor());
		}
		
		System.out.println("\nExiba todas as cores que começam coma  letra \"v\": ");
		for (ArcoIris cor : arcoIris) {
			if(cor.getNomeCor().startsWith("V"))
				System.out.println(cor.getNomeCor());
		}
		
		Integer index = 0;
		System.out.println("\nRemova todas as cores que não começam com a letra \"v\": ");
		for (ArcoIris cor : arrCores) {
			if(cor.getNomeCor().startsWith("V"))
				arrCores.remove(index);
			index++;
		}
		
		for (ArcoIris cor : arrCores) {
			System.out.println(cor.getNomeCor());
		}
		
		System.out.println("\nLimpe o conjunto: ");
		arcoIris.clear();
		
		System.out.println("\nConfira se o conjunto está vazio: ");
		System.out.println(arcoIris);
	}

}

class ArcoIris{
	private String nomeCor;
	
	public ArcoIris(String nomeCor) {
		super();
		this.nomeCor = nomeCor;
	}

	public String getNomeCor() {
		return nomeCor;
	}

	public void setNomeCor(String nomeCor) {
		this.nomeCor = nomeCor;
	}

	@Override
	public String toString() {
		return "[nomeCor=" + nomeCor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeCor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArcoIris other = (ArcoIris) obj;
		return Objects.equals(nomeCor, other.nomeCor);
	}

//	@Override
//	public int compareTo(ArcoIris cor) {
//		return this.getNomeCor().compareTo(cor.getNomeCor());
//	}
	
}

class ComparatorNome implements Comparator<ArcoIris>{

	@Override
	public int compare(ArcoIris cor1, ArcoIris cor2) {
		return cor1.getNomeCor().compareTo(cor2.getNomeCor());
	}
	
}