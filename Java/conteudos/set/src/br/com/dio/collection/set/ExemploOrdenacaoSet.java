package br.com.dio.collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
	public static void main(String[] args) {
		
		Set<Serie> minhasSeries = new HashSet<>() {{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "com�dia", 25));
		}};
		
		System.out.println("Ordem aleat�ria");
		for (Serie serie : minhasSeries) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpsodio());
		}
		
		System.out.println("\nOrdem de inser��o");
		Set<Serie> minhasSeries2 = new LinkedHashSet<>() {{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "com�dia", 60));
		}};
		for (Serie serie : minhasSeries2) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpsodio());
		}
		
		System.out.println("\nOrdem Natural (TempoEpsodio)");
		Set<Serie> minhasSeries3 = new TreeSet<>() {{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "com�dia", 25));
		}};
		
		for (Serie serie : minhasSeries3) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpsodio());
		}
		
		System.out.println("\nOrdem Nome/G�nero/TempoEpisodio");
		Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpsodio());
		minhasSeries4.addAll(minhasSeries);
		
		for (Serie serie : minhasSeries4) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpsodio());
		}
		
		
		
		
		/*
		 *System.out.println("Ordem G�nero");
		 *
		 *System.out.println("Ordem Tempo Epis�dio"); 
		 * */
		
	}
}

class Serie implements Comparable<Serie>{
	private String nome;
	private String genero;
	private Integer tempoEpsodio;
	
	public Serie(String nome, String genero, Integer tempoEpsodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpsodio = tempoEpsodio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getTempoEpsodio() {
		return tempoEpsodio;
	}

	public void setTempoEpsodio(Integer tempoEpsodio) {
		this.tempoEpsodio = tempoEpsodio;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", genero=" + genero + ", tempoEpsodio=" + tempoEpsodio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, genero, tempoEpsodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpsodio, other.tempoEpsodio);
	}

	@Override
	public int compareTo(Serie serie) {
		int genero = this.getGenero().compareTo(serie.getGenero());
		int tempoEpsodio = Integer.compare(this.getTempoEpsodio(), serie.getTempoEpsodio());
		
		if(tempoEpsodio != 0)
			return tempoEpsodio;
		
		return genero;
	}
	
	
}

class ComparatorNomeGeneroTempoEpsodio implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		int genero = s1.getGenero().compareTo(s2.getGenero());
		int nome = s1.getNome().compareTo(s2.getNome());
		
		if(nome != 0)
			return nome;
		
		if(genero != 0)
			return genero;
		
		return Integer.compare(s1.getTempoEpsodio(), s2.getTempoEpsodio());
	}
	
}
