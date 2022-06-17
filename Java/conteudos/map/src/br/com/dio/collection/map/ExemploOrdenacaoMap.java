package br.com.dio.collection.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenacaoMap {

	public static void main(String[] args) {
		Map<String, Livro> meusLivros = new HashMap<>();
		
		meusLivros.put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
		meusLivros.put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
		meusLivros.put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
		
		System.out.println("Ordem aleatória");
		for (Entry<String, Livro> livro : meusLivros.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());			
		}
		
		System.out.println("\nOrdem inserção");
		Map<String, Livro> meusLivros2 = new LinkedHashMap<>();
		
		meusLivros2.put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
		meusLivros2.put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
		meusLivros2.put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));

		for (Entry<String, Livro> livro : meusLivros2.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());			
		}
		
		System.out.println("\nOrdem alfabética autores");
		Map<String, Livro> meusLivros3 = new TreeMap<>();
		
		meusLivros3.put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
		meusLivros3.put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
		meusLivros3.put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));

		for (Entry<String, Livro> livro : meusLivros3.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());			
		}
		
		System.out.println("\nOrdem alfabética nome dos livros");
		Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
		
		meusLivros4.addAll(meusLivros.entrySet());
		
		for (Entry<String, Livro> livro : meusLivros4) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());			
		}
		
		System.out.println("\nOrdem do número de página");
		Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new ComparatorNumeroPagina());
		
		meusLivros5.addAll(meusLivros.entrySet());
		
		for (Entry<String, Livro> livro : meusLivros5) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());			
		}

	}

}

class Livro{
	private String nome;
	private Integer paginas;
	
	public Livro(String nome, Integer paginas) {
		super();
		this.nome = nome;
		this.paginas = paginas;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getPaginas() {
		return paginas;
	}
	
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(paginas, other.paginas);
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", paginas=" + paginas + "]";
	}
	
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
		return l1.getValue().getNome().compareTo(l2.getValue().getNome());
	}
	
}

class ComparatorNumeroPagina implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
		return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
	}
	
}