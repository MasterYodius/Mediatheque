package systemSimplifie;

import java.io.Serializable;

public class Exemplaire implements Serializable{
	private int numero;
	private static int nextNum = 0;
	private boolean disponible;
	private Oeuvre oeuvre;
	
	public Exemplaire(Oeuvre o) {
		this.numero = this.nextNum;
		Exemplaire.nextNum++;
		this.setDisponible(true);
		this.setOeuvre(o);
		
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean isDisponible() {
		return this.disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
	public String toString() {
		return ""+this.getNumero() + " " + this.getOeuvre().getTitre();
	}

	public Oeuvre getOeuvre() {
		return oeuvre;
	}

	public void setOeuvre(Oeuvre oeuvre) {
		this.oeuvre = oeuvre;
	}

	

	

}
