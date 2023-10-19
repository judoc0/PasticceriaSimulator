import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

	private String nome;
	private String cognome;
	private String indirizzo;
	private ArrayList<Prodotto> carrello;
	private int denaro;

	public Cliente(String nome, String cognome, int denaro) {
		this.nome = nome;
		this.cognome = cognome;
		this.denaro = denaro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public ArrayList<Prodotto> getCarrello() {
		return carrello;
	}

	public void setCarrello(ArrayList<Prodotto> carrello) {
		this.carrello = carrello;
	}

	public void aggiungiAlCarrello(Prodotto p) {
		this.carrello.add(p);
	}

	public void effettuaOrdine(Scanner scanner) {

		String scelta;
		do {
			System.out.println("Vuoi confermare l'acquisto dei prodotti nel carrello? s\n");
			scelta = scanner.nextLine();
		} while (scelta.equalsIgnoreCase("s") || scelta.equalsIgnoreCase("n"));

		if (scelta.equalsIgnoreCase("s")) {
			for (Prodotto prodotto : carrello) {
				prodotto.vendi(prodotto.getQuantitaCarrello());
			}
			carrello.clear();
			System.out.println("Acquisto effettuato");
		}

	}
	
    public void setDenaro(int denaro) {
        this.denaro = denaro;
    }

    public int getDenaro() {
        return denaro;
    }

}
