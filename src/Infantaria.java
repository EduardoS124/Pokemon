package batalhaDosExercitos;

public class Infantaria extends Exercito{

	public boolean ganhaQuandoAtacadoPor(Exercito exercito) {
		if (exercito.getClass() == Catapulta.class) {
			System.out.println("Infantaria nao ganha de Catapultas.");
			return false;
		}
		if(exercito.getClass() == Infantaria.class) {
			System.out.print("Empate. Os dois exercitos perdem...");
			return false;
		}
		System.out.println("Infantaria ganha de Cavalaria.");
		return true;
	} 
	public String toString() {
		return " Infantaria ";
	}
}
