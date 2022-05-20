package questão04;

public class TV extends ConectarTodosOsAparelhos {

	private boolean ligada;

	public void ligar() {
		ligada = true;
	}

	public void desligar() {
		ligada = false;
	}

	@Override
	public void ligarTodosOsAparelhos() {
		ligar();
	}
}
