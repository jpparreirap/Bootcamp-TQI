package br.com.dio.collection.map.exercicios;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class PopulacaoEstadosNE {

	public static void main(String[] args) {
		Map<String, Integer> estadosNE = new HashMap<>();
		
		estadosNE.put("PE", 9616621);
		estadosNE.put("AL", 3351543);
		estadosNE.put("CE", 9187103);
		estadosNE.put("RN", 3534265);
		
		System.out.println(estadosNE);
		
		System.out.println("\nSubstitua a popula??o do estado do RN por 3534165");
		estadosNE.put("RN", 3534165);
		System.out.println(estadosNE);
		
		System.out.println("\nConfira se o estado PB est? no dicion?rio, caso n?o adicione: PB - 4039277");
		System.out.println(estadosNE.containsKey("PB"));
		if(!estadosNE.containsKey("PB")) {
			estadosNE.put("PB", 4039277);
		}
		System.out.println(estadosNE);
		
		System.out.println("\nExiba a popula??o PE");
		System.err.println(estadosNE.get("PE"));
		
		System.out.println("\nExiba todos os estados e suas popula??es na ordem que foi informado");
		Map<String, Integer> estadosNE2 = new LinkedHashMap<>();
		estadosNE2.put("PE", 9616621);
		estadosNE2.put("AL", 3351543);
		estadosNE2.put("CE", 9187103);
		estadosNE2.put("RN", 3534265);
		
		System.out.println(estadosNE2);
		
		System.out.println("\nExiba os estados e suas popula??es em ordem alfab?tica");
		System.out.println("\nExiba o estado com menor popula??o e sua quantidade");
		System.out.println("\nExiba o estado com maior popula??o e sua quantidade");
		System.out.println("\nExiba a soma da popula??o desses estados");
		System.out.println("\nExiba a m?dia da popula??o deste dicion?rio de estados");
		System.out.println("\nRemova os estados com a popula??o menor que 4000000");
		System.out.println("\nApague o dicion?rio de estados");
		System.out.println("\nConfira se o dicion?rio est? vazio");

	}

}

class EstadosNE{
	private String estado;
	private int populacao;
	
	public EstadosNE(String estado, int populacao) {
		super();
		this.estado = estado;
		this.populacao = populacao;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public int getPopulacao() {
		return populacao;
	}
	
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	
	@Override
	public String toString() {
		return "EstadosNE [estado=" + estado + ", populacao=" + populacao + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(estado, populacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EstadosNE other = (EstadosNE) obj;
		return Objects.equals(estado, other.estado) && populacao == other.populacao;
	}
	
	
}
