package SystemeSimplifie;

import java.util.Hashtable;

public class Adherent {
	private String nom;
	private String prenom;
	private String adresse;
	private Hashtable<Exemplaire,Pret> emprunts;
	
	public Adherent(String n, String p, String a) {
		this.setNom(n);
		this.setPrenom(p);
		this.setAdresse(a);
		this.emprunts = new Hashtable<Exemplaire,Pret>();
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public Exemplaire emprunter(Oeuvre o) throws PasdExemplaireException {
		if(o.getNbExCourrant() == 0) {
			throw new PasdExemplaireException("Il n'y a pas d'exemplaire disponible");
			
		}
		else {
			o.setNbExCourrant(o.getNbExCourrant() - 1);
			Exemplaire exemplaire = o.checkDispo();
			exemplaire.setDisponible(false);
			Pret pret = new Pret("10/12/1995","10/12/2018");
			this.emprunts.put(exemplaire, pret);
			return exemplaire;
		}
		
		
		
		
	}
	
	public void ramener(Exemplaire e) {
		
		
	}
	
	public String toString() {
		String s = ""+this.getNom()+" "+this.getPrenom()+" "+this.getAdresse()+"\n";
		for(int i = 0; i < this.emprunts.size(); i++) {
			s = s + this.emprunts.
		}
		
		
	}

}
