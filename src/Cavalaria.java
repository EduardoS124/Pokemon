package batalhaDosExercitos;

public class Cavalaria extends Exercito{
	public boolean ganhaQuandoAtacadoPor(Exercito exercito) {
		if (exercito.getClass() == Cavalaria.class) {
			System.out.print("Empate. Os dois exercitos perdem...");
			return false;
		}
		if(exercito.getClass() == Infantaria.class) {
			System.out.println("Cavalaria nao ganha de Infantaria.");
			return false;
		}
		else {
			System.out.println("Cavalaria ganha de Catapultas.");
			return true;
		}	
	}
	public String toString() {
		return " Cavalaria ";
	}

}
