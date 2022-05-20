package questão04;

public class Main {

	public static void main(String[] args) {

		System.out.println("<><><><><><><><><><><>");
		
		HomeTheater homeTheater = new HomeTheater();
		
		homeTheater.adicionarAparelho(new TV());
		homeTheater.adicionarAparelho(new Som());
		homeTheater.adicionarAparelho(new ArCondicionado());
		homeTheater.adicionarAparelho(new Luz());
		
		homeTheater.ligarModoFilme();
		
	}
}
