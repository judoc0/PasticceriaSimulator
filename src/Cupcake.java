import java.util.List;

public class Cupcake extends Prodotto{
	
	private String gusto;
	
	public Cupcake(String nome, Float prezzo, List<Ingrediente> ingredienti, String descrizione,
			Integer quantitaDisponibile, String gusto) {
		super(nome, prezzo, ingredienti, descrizione, quantitaDisponibile);
		this.gusto = gusto;
	}

	public String getGusto() {
		return gusto;
	}

	public void setGusto(String gusto) {
		this.gusto = gusto;
	}
	
	

}
