package Questao06;

public class AnalistaJunior extends Analista {

	@Override
	public float salario() {
		return getSalario() + 400 * getNivel();
	}
}
