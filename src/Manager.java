import java.util.List;
import java.util.Scanner;

public class Manager extends Dipendente {

	public Manager(String nome, String cognome, String ruolo) {
		super(nome, cognome, ruolo);
		
	}
	
	public void lavora() {
		System.out.println("Sto facendo finta di lavorare perche` sono il Manager");
	}
	
	public Dipendente assumiDipendente(List<Dipendente> dipendenti) {
		Scanner scanner = new Scanner(System.in);
		//Quando si usa questo metodo all'interno di amministrazione, bisogna
		//assegnarli un istanza di dipendente altrimenti non possiamo caricarlo
		//in lista dipendenti
		System.out.println("Inserire il nome del dipendente da licenziare");
		String nome = scanner.nextLine();
		System.out.println("Inserire il cognome del dipendente da licenziare");
		String cognome = scanner.nextLine();
		System.out.println("Inserire il ruolo del dipendente da licenziare");
		String ruolo = scanner.nextLine();
		System.out.println("Inserire l'anno di nascita del dipendente da licenziare");
		int nascita = scanner.nextInt();
		System.out.println("Inserire l'anno di assunzione del dipendente da licenziare");
		int dataAssunzione = scanner.nextInt();
		
		Dipendente dipendente = new Dipendente(nome, cognome, ruolo, nascita, dataAssunzione);
		return dipendente;
	}
	
	public void licenziaDipendente(List<Dipendente> dipendenti) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserire il nome del dipendente da licenziare");
		String nome = scanner.nextLine();
		System.out.println("Inserire il cognome del dipendente da licenziare");
		String cognome = scanner.nextLine();
		
		for(Dipendente dipendente : dipendenti) {
			if (dipendente.getNome().equalsIgnoreCase(nome) && dipendente.getNome().equalsIgnoreCase(cognome)) {
				System.out.println("Rimuovo il dipendente: " + dipendente.dettagli());
				dipendenti.remove(dipendente);
			}
			else {
				System.out.println("Non esiste nessun dipendente con nome e cognome indicati");
			}
		}
	}
	
	public void modificaQtaProdotto (List<Prodotto> prodotti) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserire il nome del prodotto di cui modificare la quantita`");
		String nome = scanner.nextLine();
		System.out.println("Inserire la quantita` del prodotto: " + nome);
		Integer newQuantita = scanner.nextInt();
		
		for(Prodotto prodotto : prodotti) {
			if(prodotto.getNome().equalsIgnoreCase(nome)) {
				prodotto.setQuantitaDisponibile(newQuantita);;
			}
			else {
				System.out.println("Non esiste nessun prodotto con nome indicato");
			}
		}
	}
}