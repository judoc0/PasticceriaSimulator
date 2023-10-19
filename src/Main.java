import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	
	public static void main(String[] args) {
		final int nProdotti = 20;
		final int nClienti = 10;
		final int nDipendenti = 5;
		
		Prodotto[] prodotto = new Prodotto[nProdotti];
		Cliente[] cliente = new Cliente[nClienti];
		String nomi[] = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Ivy", "Jack"};
		String cognomi[] = {"Smith", "Johnson", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas"};		
		
		// CREAO ISTANZE PRODOTTI 
		/*for(int i = 0; i< nProdotti; i++) {
			// genero quantita` casuale per ogni prodotto
			Integer qta = (int) (Math.random() * 20);
			if(i < 6) {
				String nome = "Torta";
				float prezzo = 40;
				prodotto[i] = new Prodotto(nome, prezzo, qta);
				prodotto[i].setIngredienti();
			}
			else if(i < 11) {
				String nome = "Cupcake";
				float prezzo = 5;
				prodotto[i] = new Prodotto(nome, prezzo, qta);
				prodotto[i].setIngredienti(Arrays.asList(new Ingrediente("Uovo", 1), new Ingrediente("Burro", 1), new Ingrediente("Latte", 1)));
			}
			else if(i < 20) {
				String nome = "Biscotto";
				float prezzo = 3;
				prodotto[i] = new Prodotto(nome, prezzo, qta);
				prodotto[i].setIngredienti(Arrays.asList(new Ingrediente("Uovo", 1), new Ingrediente("Burro", 1), new Ingrediente("Lievito", 1), new Ingrediente("Latte", 1)));
			}
		}*/
		
		List<Prodotto> catalogo = new ArrayList<>();
		String nome = "Torta storta";
		float prezzo = 40;
		String descrizione = "Molto storta";
		List<Ingrediente> ingredienti = Arrays.asList(new Ingrediente("Uovo", 4), new Ingrediente("Burro", 2), new Ingrediente("Lievito", 2), new Ingrediente("Latte", 3));
		Integer pezziTorta = 4;
		catalogo.add(new Torta(nome, prezzo, ingredienti, descrizione, nProdotti, pezziTorta));
		
		nome = "Cupcake cup";
		prezzo = 5;
		descrizione = "Cake nel cup";
		ingredienti = Arrays.asList(new Ingrediente("Uovo", 1), new Ingrediente("Burro", 1), new Ingrediente("Latte", 1));
		String gusto = "Cioccolato";
		catalogo.add(new Cupcake(nome, prezzo, ingredienti, descrizione, nProdotti, gusto));
		
		nome = "Biscotto cotto";
		prezzo = 5;
		descrizione = "2 volte cotto";
		ingredienti = Arrays.asList(new Ingrediente("Uovo", 1), new Ingrediente("Burro", 1), new Ingrediente("Latte", 1), new Ingrediente("Lievito", 1));
		Float diametro = 5f;
		catalogo.add(new Biscotto(nome, prezzo, ingredienti, descrizione, nProdotti, diametro));
		
		System.out.println("CLASSE");
		for (Prodotto p : catalogo) {
			System.out.println(p);
		}
		System.out.println();
		
		
		// CREO ISTANZE DIPENDENTI
		System.out.println("DIPENDENTI");
		for(int i = 0; i< nClienti; i++) {
			// genero quantita` casuale per ogni prodotto
			int soldi = (int) (Math.random() * 20);
			String nomeDipendente = nomi[i];
			String cognome = cognomi[i];
			cliente[i] = new Cliente(nomeDipendente, cognome, soldi);
			System.out.println(cliente[i].getNome() + " " + cliente[i].getCognome());
		}
	}
}
