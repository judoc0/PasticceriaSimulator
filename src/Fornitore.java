
import java.util.List;

public class Fornitore {
	private String nome;
	private String cognome;
	
	public void rifornisci(List<Ingrediente> scorta) {
		// genero valori casuali e li aggiungo alla quantita` della scorta
				for(Ingrediente ingrediente : scorta) {
					Integer random = ((int) (Math.random() * 10));
					if(ingrediente.getNome().equalsIgnoreCase("latte")) {
						ingrediente.setQuantita(ingrediente.getQuantita() + random);
					}
					else if(ingrediente.getNome().equalsIgnoreCase("uova")) {
						ingrediente.setQuantita(ingrediente.getQuantita() + random);
					}
					else if(ingrediente.getNome().equalsIgnoreCase("burro")) {
						ingrediente.setQuantita(ingrediente.getQuantita() + random);
					}
					else if(ingrediente.getNome().equalsIgnoreCase("lievito")) {
						ingrediente.setQuantita(ingrediente.getQuantita() + random);
					}
				}
	}
}
