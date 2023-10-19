import java.util.List;

public class Torta extends Prodotto{
	
	private Integer numeroPezzi;
	
	public Torta(String nome, Float prezzo, List<Ingrediente> ingredienti, String descrizione, Integer quantitaDisponibile, Integer numeroPezzi) {
		super(nome, prezzo, ingredienti, descrizione, quantitaDisponibile);
		this.numeroPezzi = numeroPezzi;
	}

	public Integer getNumeroPezzi() {
		return numeroPezzi;
	}

	public void setNumeroPezzi(Integer numeroPezzi) {
		this.numeroPezzi = numeroPezzi;
	}

	
	public void taglia(Integer quantitaTagliata) {
		System.out.println("Numero pezzi : " + numeroPezzi);
		System.out.println("Quantità da tagliare: " + quantitaTagliata);
		this.numeroPezzi-=quantitaTagliata;
		System.out.println("Quantita rimanenti: " + numeroPezzi);
	}
	
	public Float getPrezzoFetta() {
		return getPrezzo()/getNumeroPezzi();
	}

}
