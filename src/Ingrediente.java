
public class Ingrediente {
	
	private String nome;
	private Integer quantita;
	
	
	
	
	public Ingrediente(String nome, Integer quantita) {
		super();
		this.nome = nome;
		this.quantita = quantita;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuantita() {
		return quantita;
	}
	public void setQuantita(Integer quantita) {
		this.quantita = quantita;
	}

	@Override
	public String toString() {
		return "Ingrediente [nome=" + nome + ", quantita=" + quantita + "]";
	}
	
	

}
