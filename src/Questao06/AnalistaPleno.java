package Questao06;

public class AnalistaPleno extends Analista {

	@Override
	public float salario() {
		return getSalario() + 1000 * getNivel();
	}

}
