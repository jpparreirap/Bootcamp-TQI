package desafioPratico.bancoDigital;

public class Cliente {
	
	private String nome;

	@Override
	public String toString() {
		return "[nome =" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
