package br.com.dio.collection.set.exercicios;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioLinguagens {

	public static void main(String[] args) {
		Set<LinguagemFavorita> linguagens = new LinkedHashSet<>();
		
		linguagens.add(new LinguagemFavorita("Python", 1995, "Pycharm"));
		linguagens.add(new LinguagemFavorita("C#", 1992, "VisualStudio"));
		linguagens.add(new LinguagemFavorita("Java", 1990, "Eclipse"));
		linguagens.add(new LinguagemFavorita("JavaScript", 1993, "VsCode"));
		
		System.out.println("Ordem de inser??o");
		for (LinguagemFavorita linguagemFavorita : linguagens) {
			System.out.println(linguagemFavorita.getNome());
		}
		
		System.out.println("\nOrdem Natural (nome)");
		Set<LinguagemFavorita> linguagens2 = new TreeSet<>();
		linguagens2.addAll(linguagens);
		
		System.out.println(linguagens2);
		
		System.out.println("\nIDE");
		Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new comparatorIDE());
		linguagens3.addAll(linguagens);
		
		System.out.println(linguagens3);
		
		System.out.println("\nAno de cria??o e nome");
		Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new comparatorCriacaoNome());
		linguagens4.addAll(linguagens);
		
		System.out.println(linguagens4);
		
		System.out.println("\nNome/anoDeCriacao/IDE");
		Set<LinguagemFavorita> linguagens5 = new TreeSet<>(new comparatorNomeCriacaoIde());
		linguagens5.addAll(linguagens);
		
		System.out.println(linguagens5);

	}

}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
	private String nome;
	private Integer anoCriacao;
	private String ide;
	
	public LinguagemFavorita(String nome, Integer anoCriacao, String ide) {
		super();
		this.nome = nome;
		this.anoCriacao = anoCriacao;
		this.ide = ide;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAnoCriacao() {
		return anoCriacao;
	}
	public void setAnoCriacao(Integer anoCriacao) {
		this.anoCriacao = anoCriacao;
	}
	public String getIde() {
		return ide;
	}
	public void setIde(String ide) {
		this.ide = ide;
	}
	
	@Override
	public String toString() {
		return "[nome=" + nome + ", anoCriacao=" + anoCriacao + ", ide=" + ide + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoCriacao, ide, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinguagemFavorita other = (LinguagemFavorita) obj;
		return Objects.equals(anoCriacao, other.anoCriacao) && Objects.equals(ide, other.ide)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public int compareTo(LinguagemFavorita linguagem) {
		return this.getNome().compareTo(linguagem.getNome());
	}
	
	
}

class comparatorIDE implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
		return linguagem1.getIde().compareTo(linguagem2.getIde());
	}
	
}

class comparatorCriacaoNome implements Comparator<LinguagemFavorita>{
	
	@Override
	public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
		int anoCriacao = Integer.compare(linguagem1.getAnoCriacao(), linguagem2.getAnoCriacao());
		int nome = linguagem1.getNome().compareTo(linguagem2.getNome());
		
		if(anoCriacao != 0)
			return anoCriacao;
		
		
		return nome;
	}
	
}

class comparatorNomeCriacaoIde implements Comparator<LinguagemFavorita>{
	
	@Override
	public int compare(LinguagemFavorita linguagem1, LinguagemFavorita linguagem2) {
		int nome = linguagem1.getNome().compareTo(linguagem2.getNome());
		int anoCriacao = Integer.compare(linguagem1.getAnoCriacao(), linguagem2.getAnoCriacao());
		int ide = linguagem1.getIde().compareTo(linguagem2.getIde());
		
		if(nome != 0)
			return nome;
		
		else if(anoCriacao != 0)
			return anoCriacao;
		
		return ide;
	}

}