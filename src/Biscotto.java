import java.util.List;

public class Biscotto extends Prodotto{
	
	private Float diametro;

	public Biscotto(String nome, Float prezzo, List<Ingrediente> ingredienti, String descrizione,
			Integer quantitaDisponibile, Float diametro) {
		super(nome, prezzo, ingredienti, descrizione, quantitaDisponibile);
		this.diametro = diametro;
	}

	public Float getDiametro() {
		return diametro;
	}

	public void setDiametro(Float diametro) {
		this.diametro = diametro;
	}
	 

	
	

}
