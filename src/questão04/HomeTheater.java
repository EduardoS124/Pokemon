package questão04;

import java.util.ArrayList;
import java.util.List;

public class HomeTheater {
	
	private List<ConectarTodosOsAparelhos> ligar = new ArrayList<>();
	
	public void adicionarAparelho(ConectarTodosOsAparelhos conectar) {
		ligar.add(conectar);
	}
	
	public void ligarModoFilme() {
		for(ConectarTodosOsAparelhos c : ligar) {
			c.ligarTodosOsAparelhos();
		}
	}
}
