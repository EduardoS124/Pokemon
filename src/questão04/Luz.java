package questão04;

public class Luz extends ConectarTodosOsAparelhos{

    private boolean acesa;

    public void ligar(){
        acesa = true;
    }
    public void desligar(){
        acesa = false;
    }
	@Override
	public void ligarTodosOsAparelhos() {
		desligar();
	}
}
