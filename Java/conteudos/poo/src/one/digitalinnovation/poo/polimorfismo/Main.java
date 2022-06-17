package one.digitalinnovation.poo.polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();
		
//		Gerente gerente2 = new Funcionario();
		Vendedor vendedor2 = (Vendedor) new Funcionario();
	}

}
