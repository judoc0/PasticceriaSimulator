
public class Dipendente {
	private String nome;
	private String cognome;
	private int dataDiNascita;
	private int dataAssunzione;
	private String ruolo;
	
	public Dipendente(String nome, String cognome, String ruolo) {
		this.nome = nome;
		this.cognome = cognome;
		this.ruolo = ruolo;
	}
	
	public Dipendente(String nome, String cognome, String ruolo, int nascita, int assunzione) {
		this.nome = nome;
		this.cognome = cognome;
		this.ruolo = ruolo;
		this.dataDiNascita = nascita;
		this.dataAssunzione = assunzione;
	}
	
	public void lavora() {
		System.out.println(nome +" " + cognome + " : sta lavorando come " + ruolo);
	}

	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String dettagli() {
		System.out.println("Nome: " + nome);
		System.out.println("Cognome: " + cognome);
		System.out.println("Ruolo: " + ruolo);
		System.out.println("Data di nascita: " + dataDiNascita);
		System.out.println("Data di assunzione: " + dataAssunzione);
		return null;
	}
}
