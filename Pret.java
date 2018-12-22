package systemSimplifie;

import java.io.Serializable;
import java.time.LocalDate;

public class Pret implements Serializable{
	private int numero;
	private LocalDate debut;
	private LocalDate fin;
	private static int numSuiv = 0;
	
	public Pret(LocalDate d, LocalDate f) {
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

	public LocalDate getDebut() {
		return this.debut;
	}

	public void setDebut(LocalDate debut) {
		this.debut = debut;
	}

	public LocalDate getFin() {
		return this.fin;
	}

	public void setFin(LocalDate fin) {
		this.fin = fin;
	}
	
	public boolean Depasse() {
		if(Time.diff_time(fin) > 0) {
			return true;
		}
		else
			return false;
	}
	
	public String toString() {
		return "Numéro du prêt : "+this.getNumero() + ", Date de début : "+this.getDebut()+", Date de fin : "+this.getFin();
	}
	
	

}
