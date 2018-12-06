package systemSimplifie;

import java.util.ArrayList;

public class Adherents {
	
	private ArrayList<Adherent> listeAdherents;
	private ArrayList<DelaiRestitutionDepasseListener> delaisDepasses;
	
	public Adherents() {
		this.listeAdherents = new ArrayList<Adherent>();
		this.delaisDepasses = new ArrayList<DelaiRestitutionDepasseListener>();
	}
	
	public void addAdherent(Adherent a) {
		this.listeAdherents.add(a);
	}
	
	public void addDelaiRestitutionDepasseListener(DelaiRestitutionDepasseListener l) {
		
		
	}
	
	public String toString() {
		String s = "Liste des adhérents :\n";
		for(Adherent a : this.listeAdherents) {
			s += a.toString() + "\n";
			
		}
		return s;
	}

}
