package desafioPratico.bancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Cliente jp = new Cliente();
		jp.setNome("Jo?o Paulo");
		
		Conta cc = new ContaCorrente(jp);
		Conta poupanca = new ContaPoupanca(jp);
		
		List<Conta> contas = new ArrayList<>();;
		contas.add(cc);
		contas.add(poupanca);
		
		Banco banco = new Banco(contas);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		System.out.println();
		poupanca.imprimirExtrato();
		System.out.println();
		
		System.out.println(banco.getContas());
		
	}

}
