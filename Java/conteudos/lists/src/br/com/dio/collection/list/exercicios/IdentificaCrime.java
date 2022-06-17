package br.com.dio.collection.list.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IdentificaCrime {

	public static void main(String[] args) {
		List<String> respostas = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		String resposta = "";
		
		Integer quantidadePerguntas = 1;
		Boolean ehCumplice = false;
		
		while(quantidadePerguntas <= 5) {
	
			switch (quantidadePerguntas) {
				case 1:
					System.out.print("Telefonou para a vítima? ");
					break;
				case 2:
					System.out.print("Esteve no local do crime? ");
					break;
				case 3:
					System.out.print("Mora perto da vítima? ");
					break;
				case 4:
					System.out.print("Devia para a vítima? ");
					break;
				case 5:
					System.out.print("Já trabalhou com a vítima? ");
					break;
				default:
					break;
			}
			
			resposta = sc.nextLine();
			respostas.add(resposta);
			
			quantidadePerguntas++;
		}
		
		System.out.println(VerificaRespostas(respostas));
		
		System.out.println(respostas);
		

	}
	
	public static String VerificaRespostas(List<String> respostas){
		char resposta;
		Boolean ehCumplice = false;
		
		for(int i = respostas.size() - 1; i >= 0; i--) {
			resposta = respostas.get(i).toCharArray()[0]; 
			ehCumplice = i+1 == 4 || i+1 == 3;
			
			if(resposta == 'n') {
				continue;
			}
			else if(resposta == 's' && i+1 == 5) {
				return "Assassino(a)!";
			}
			else if(resposta == 's' && ehCumplice) {
				return "Cúmplice!";
			}
			else if(resposta == 's' && i+1 == 2) {
				return "Suspeito(a)!";
			}
		}
		
		return "Inocente!";
	}

}
