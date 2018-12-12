package systemSimplifie;

import java.io.Serializable;

public class Pret implements Serializable{
	private int numero;
	private String debut;
	private String fin;
	private static int numSuiv = 0;
	
	public Pret(String d, String f) {
		this.setNumero(numSuiv);
		this.setDebut(d);
		this.setFin(f);
		Pret.numSuiv++;
		
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDebut() {
		return this.debut;
	}

	public void setDebut(String debut) {
		this.debut = debut;
	}

	public String getFin() {
		return this.fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}
	
	public String toString() {
		return ""+this.getNumero() + ", Date de début : "+this.getDebut()+", Date de fin : "+this.getFin();
	}
	
	

}
