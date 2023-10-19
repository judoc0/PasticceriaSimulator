import java.util.ArrayList;
import java.util.List;

public class Amministrazione {
	
	List<Dipendente> dipendenti = new ArrayList<>();
	
	public void aggiungiProdotto(List<Prodotto> prodotti, Prodotto p) {
		prodotti.add(p);
		System.out.println("Prodotto "+p.getNome()+" aggiunto al catalogo");
	}
	
	public void rimuoviProdotto(List<Prodotto> prodotti, Prodotto p) {
		prodotti.remove(p);
		System.out.println("Prodotto "+p.getNome()+" rimosso dal catalogo");
	}
	
	public List<Dipendente> getDipendenti() {
		return dipendenti;
	}
	
	public void aggiungiDipendente(Dipendente d) {
		dipendenti.add(d);
		System.out.println("Dipendente: " + d.getNome() + " " + d.getCognome() + "assunto");
	}
}
