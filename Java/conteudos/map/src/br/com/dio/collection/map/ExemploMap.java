package br.com.dio.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {

	public static void main(String[] args) {
		
		Map<String, Double> carrosPopulares = new HashMap<>();
		
		carrosPopulares.put("gol", 14.4);
		carrosPopulares.put("uno", 15.6);
		carrosPopulares.put("mobi", 16.1);
		carrosPopulares.put("hb20", 14.5);
		carrosPopulares.put("kwid", 15.6);
		
		System.out.println(carrosPopulares);
		
		System.out.println("\nSubstitua o consumo do gol por 15,2 km/l: ");
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);
		
		System.out.println("\nConfira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
		
		System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("uno"));
		
//		System.out.println("Exiba o terceiro modelo adicionado: ");
		
		System.out.println("\nExiba os modelos: ");
		Set<String> modelos = carrosPopulares.keySet();
		System.out.println(modelos);
		
		System.out.println("\nExiba os consumos dos carros: ");
		Collection<Double> consumos = carrosPopulares.values();
		System.out.println(consumos);
		
		System.out.println("\nExiba o modelo mais econômico e seu consumo: ");
		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries =  carrosPopulares.entrySet();
		
		String modeloMaisEficiente = "";
		
		for (Map.Entry<String, Double> entry : entries) {
			if (entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
			}
		}
		
		System.out.println(modeloMaisEficiente + " - " + consumoMaisEficiente);
		
		System.out.println("\nExiba o modelo menos econômico e seu consumo: ");
		Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
		
		String modeloMenosEficiente = "";
		
		for (Map.Entry<String, Double> entry : entries) {
			if (entry.getValue().equals(consumoMenosEficiente)) {
				modeloMenosEficiente = entry.getKey();
			}
		}
		
		System.out.println(modeloMenosEficiente + " - " + consumoMenosEficiente);
		
		System.out.println("\nExiba a soma dos consumos: ");
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0.0;
		
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		
		System.out.println(soma);
		
		System.out.println("\nExiba a média dos consumos deste dicionário de carros: " + soma/carrosPopulares.size());
		
		System.out.println("\nRemova os modelos com o consumo igual a 15,6km/l: ");
		Iterator<Double> iterator2 = carrosPopulares.values().iterator();
		System.out.println(carrosPopulares);
		
		while(iterator2.hasNext()) {
			if(iterator2.next().equals(15.6)) {
				iterator2.remove();
			}
		}
		
		System.out.println(carrosPopulares);
		
		System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
		Map<String, Double> carrosPopulares2 = new LinkedHashMap<>();
		
		carrosPopulares2.put("gol", 14.4);
		carrosPopulares2.put("uno", 15.6);
		carrosPopulares2.put("mobi", 16.1);
		carrosPopulares2.put("hb20", 14.5);
		carrosPopulares2.put("kwid", 15.6);
		
		System.out.println(carrosPopulares2);
		
		System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
		Map<String, Double> carrosPopulares3 = new TreeMap<>();
		
		carrosPopulares3.put("gol", 14.4);
		carrosPopulares3.put("uno", 15.6);
		carrosPopulares3.put("mobi", 16.1);
		carrosPopulares3.put("hb20", 14.5);
		carrosPopulares3.put("kwid", 15.6);
		
		System.out.println(carrosPopulares3);
		
		System.out.println("\nApague o dicionário de carros: ");
		carrosPopulares.clear();
		
		System.out.println("\nConfira se o dicionário está vazia: ");
		System.out.println(carrosPopulares.isEmpty());
		
		
	}

}
