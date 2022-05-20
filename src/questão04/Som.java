package questão04;

public class Som extends ConectarTodosOsAparelhos{

	private int volume;

	public void mutar() {
		volume = 0;
	}

	public void aumentar() {
		volume++;
	}

	public void baixar() {
		volume--;
	}

	@Override
	public void ligarTodosOsAparelhos() {
		aumentar();
	}
}
