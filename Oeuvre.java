package SystemeSimplifie;

import java.util.ArrayList;

public class Oeuvre {
	private String titre;
	private String auteur;
	private int nbExemplaire;
	private ArrayList<Exemplaire> exemplaires;
	private int nbExCourrant;
	
	public Oeuvre(String t, String a, int nb) {
		this.setTitre(t);
		this.setAuteur(a);
		this.setNbExemplaire(nb);
		this.exemplaires = new ArrayList<Exemplaire>();
		for(int i = 0; i < nb; i++) {
			this.exemplaires.add(new Exemplaire());
		}
		this.nbExemplaire = nb;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return this.auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbExemplaire() {
		return this.nbExemplaire;
	}

	public void setNbExemplaire(int nbExemplaire) {
		this.nbExemplaire = nbExemplaire;
	}

	public int getNbExCourrant() {
		return nbExCourrant;
	}

	public void setNbExCourrant(int nbExCourrant) {
		this.nbExCourrant = nbExCourrant;
	}
	
	public Exemplaire checkDispo() {
		Exemplaire res = this.exemplaires.get(0);
		for(Exemplaire e:this.exemplaires) {
			if(e.isDisponible() == true) {
				res = e;
				break;
			}
		}
		return res;
	}
	
	

}
