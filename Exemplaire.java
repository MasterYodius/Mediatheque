package SystemeSimplifie;

public class Exemplaire {
	private int numero;
	private static int nextNum = 0;
	private boolean disponible;
	
	public Exemplaire() {
		this.numero = this.nextNum;
		Exemplaire.nextNum++;
		this.setDisponible(true);
		
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
		return ""+this.getNumero();
	}

	

}
