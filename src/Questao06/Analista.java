package Questao06;

public abstract class Analista {
	
	private String nome;
	private float salario;
	private int nivel;
	
	public abstract float salario();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return 2000;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
}
