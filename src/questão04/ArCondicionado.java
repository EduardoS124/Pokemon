package questão04;

public class ArCondicionado extends ConectarTodosOsAparelhos{

	private int temperatura;
	
	public void temperatura() {
		temperatura = 24;
	}
	
	@Override
	public void ligarTodosOsAparelhos() {
		temperatura();
	}
}
