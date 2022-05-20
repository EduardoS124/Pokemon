package Questao06;

public class AnalistaSenior extends Analista{

	@Override
	public float salario() {
		return getSalario() + 1800 * getNivel();
	}

}
