package questao01;

public class Pokemon {

	private String nome;
	private String tipo;
	private int nivel;

	private Ataque ataqueA;
	private Ataque ataqueB;
	private Ataque ataqueC;
	private Ataque ataqueD;

	public void ataqueA() {
		ataqueA.ataque();
	}

	public void ataqueB() {
		ataqueB.ataque();
	}

	public void ataqueC() {
		ataqueC.ataque();
	}

	public void ataqueD() {
		ataqueD.ataque();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public Ataque getAtaqueA() {
		return ataqueA;
	}

	public void setAtaqueA(Ataque ataqueA) {
		this.ataqueA = ataqueA;
	}

	public Ataque getAtaqueB() {
		return ataqueB;
	}

	public void setAtaqueB(Ataque ataqueB) {
		this.ataqueB = ataqueB;
	}

	public Ataque getAtaqueC() {
		return ataqueC;
	}

	public void setAtaqueC(Ataque ataqueC) {
		this.ataqueC = ataqueC;
	}

	public Ataque getAtaqueD() {
		return ataqueD;
	}

	public void setAtaqueD(Ataque ataqueD) {
		this.ataqueD = ataqueD;
	}
}
