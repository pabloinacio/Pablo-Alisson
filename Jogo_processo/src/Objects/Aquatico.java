package Objects;

public class Aquatico extends Animal{

	public Aquatico() {
		
	}
		
	public Aquatico(String nome2, String diferenca2) {
		boolean ambiente2 = false;
		setAmbiente(ambiente2);
		setNome(nome2);
		setDiferenca(diferenca2);
	}
 
	@Override
		public boolean getAmbiente() {
			return super.getAmbiente();
		}
   @Override
	public String getDiferenca() {
		return super.getDiferenca();
	}
	@Override
		public String getNome() {
			return super.getNome();
		}


	
	
}
