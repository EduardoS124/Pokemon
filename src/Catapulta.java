package batalhaDosExercitos;

public class Catapulta extends Exercito {
	public boolean ganhaQuandoAtacadoPor(Exercito exercito) {
		if (exercito.getClass() == Catapulta.class) {
			System.out.print("Empate. Os dois exercitos perdem...");
			return false;
		}	
		if (exercito.getClass() == Cavalaria.class) {
			System.out.println("Catapulta nao ganha de Cavalaria.");
			return false;
		}
		else {
			System.out.println("Catapultas ganham de Infantaria.");
			return true;
		}
	}
	
	public String toString() {
		return " Catapulta ";
	}
}
