package Objects;

public abstract class Animal {

	private String nome;
	private String diferenca;
	private boolean ambiente;
	
	

	
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected boolean getAmbiente() {
		return ambiente;
	}
	
	protected void setAmbiente(boolean ambiente) {
		this.ambiente = ambiente;
	}
	protected String getDiferenca() {
		return diferenca;
	}
	protected void setDiferenca(String diferenca) {
		this.diferenca = diferenca;
	}

	

	
	
	
	
	
	
}
