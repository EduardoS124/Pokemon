package batalhaDosExercitos;

public abstract class Exercito {
	private int dinheiro = 1200;
	
	public int getDinheiro() {
		return this.dinheiro;
	}
	
	public abstract boolean ganhaQuandoAtacadoPor(Exercito exercito);
	
	public abstract String toString();
}
