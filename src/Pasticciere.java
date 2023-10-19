

import java.util.List;

public class Pasticciere extends Dipendente {
	boolean troppeTorte;
	boolean troppiCupcake;
	boolean ingredientiDisponibili = false;
	int latte, farina, uova, burro, lievito;
	
	public Pasticciere(String nome, String cognome, String ruolo) {
		super(nome, cognome, ruolo);
	}
	
	public void crea(List<Ingrediente> scorta) {
		
		// inserisco la disponibilita` degli ingredienti
		for(Ingrediente ingrediente : scorta) {
			if(ingrediente.getNome().equalsIgnoreCase("latte")) {
				latte = ingrediente.getQuantita();
			}
			else if(ingrediente.getNome().equalsIgnoreCase("uova")) {
				uova = ingrediente.getQuantita();
			}
			else if(ingrediente.getNome().equalsIgnoreCase("burro")) {
				burro = ingrediente.getQuantita();
			}
			else if(ingrediente.getNome().equalsIgnoreCase("lievito")) {
				lievito = ingrediente.getQuantita();
			}
		}
		
		controllaIngredienti();
		
		// il pasticciere valuta cosa si puo` fare
		//e crea finche ci sono ingredienti adatti
		while(ingredientiDisponibili)
			
		//TORTA
		if(latte >= 3 && uova >= 4 && burro >= 2 && lievito >= 2 && !troppeTorte) {
			for(Ingrediente ingrediente : scorta) {
				if(ingrediente.getNome().equalsIgnoreCase("latte")) {
					ingrediente.setQuantita(ingrediente.getQuantita() - 3);
				}
				else if(ingrediente.getNome().equalsIgnoreCase("uova")) {
					ingrediente.setQuantita(ingrediente.getQuantita() - 4);
				}
				else if(ingrediente.getNome().equalsIgnoreCase("burro")) {
					ingrediente.setQuantita(ingrediente.getQuantita() - 2);
				}
				else if(ingrediente.getNome().equalsIgnoreCase("lievito")) {
					ingrediente.setQuantita(ingrediente.getQuantita() - 2);
				}
			}
			for(Ingrediente ingrediente : scorta) {
				if(ingrediente.getNome().equals("torta")) {
					System.out.println("Il Pasticciere ha creato una torta");
					ingrediente.setQuantita(ingrediente.getQuantita() + 1);
			}
		}
			//aggiorno gli ingredienti e controllo
			controllaIngredienti();
			checkTorta();
	}
		//CUPCAKE
		else if(latte >= 1 && uova >= 1 && burro >= 1 && !troppiCupcake) {
			for(Ingrediente ingrediente : scorta) {
				if(ingrediente.getNome().equalsIgnoreCase("latte")) {
					ingrediente.setQuantita(ingrediente.getQuantita() - 1);
				}
				else if(ingrediente.getNome().equalsIgnoreCase("uova")) {
					ingrediente.setQuantita(ingrediente.getQuantita() - 1);
				}
				else if(ingrediente.getNome().equalsIgnoreCase("burro")) {
					ingrediente.setQuantita(ingrediente.getQuantita() - 1);
				}
			}
			for(Ingrediente ingrediente : scorta) {
				if(ingrediente.getNome().equals("cupcake")) {
					System.out.println("Il Pasticciere ha creato un cupcake");
					ingrediente.setQuantita(ingrediente.getQuantita() + 1);
				}
			}
			//aggiorno gli ingredienti e controllo
			controllaIngredienti();
			checkCupcake();
		}
		
		//Biscotti
		else if(latte >= 1 && uova >= 1 && burro >= 1) {
			for(Ingrediente ingrediente : scorta) {
				if(ingrediente.getNome().equalsIgnoreCase("latte")) {
					ingrediente.setQuantita(ingrediente.getQuantita() - 1);
				}
				else if(ingrediente.getNome().equalsIgnoreCase("uova")) {
					ingrediente.setQuantita(ingrediente.getQuantita() - 1);
				}
				else if(ingrediente.getNome().equalsIgnoreCase("burro")) {
					ingrediente.setQuantita(ingrediente.getQuantita() - 1);
				}
			}
			for(Ingrediente ingrediente : scorta) {
				if(ingrediente.getNome().equals("cupcake")) {
					System.out.println("Il Pasticciere ha creato un cupcake");
					ingrediente.setQuantita(ingrediente.getQuantita() + 1);
				}
			}
		}
		//aggiorno gli ingredienti e controllo
		controllaIngredienti();
	}
	
	
	public void controllaIngredienti() {
		//importo il check sulla possibilita` di creare
				if(latte >= 1 && uova >= 1 && burro >= 1 && lievito >= 0) {
					System.out.println("Ingredienti disponibili");
					ingredientiDisponibili = true;
				}
				else {
					System.out.println("Ingredienti non disponibili");
					ingredientiDisponibili = false;
					
				}
	}
	
	//controllo su quante torte ha fatto
	public void checkTorta() {
		int troppo = 0;
		if( troppo < 3) {
			troppo =+ 1;
			troppeTorte = true;
			
		} else if(troppo == 3){
			troppo = 0;
			troppeTorte = false;
		}
	}
	
	public void checkCupcake() {
		int troppo = 0;
		if( troppo < 3) {
			troppo =+ 1;
			troppiCupcake = true;
			
		} else if(troppo == 3){
			troppo = 0;
			troppiCupcake = false;
		}
	}
}
