package systemSimplifie;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class Adherent implements Serializable{
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
	
	public Exemplaire emprunter(Oeuvre o,int d,int fin) throws PasdExemplaireException {
		if(o.getNbExCourrant() == 0) {
			throw new PasdExemplaireException("Il n'y a pas d'exemplaire disponible");
			
		}
		else {
			o.setNbExCourrant(o.getNbExCourrant() - 1);
			Exemplaire exemplaire = o.checkDispo();
			exemplaire.setDisponible(false);
			Pret pret = new Pret(Time.add_time(Time.current_time(), -d),Time.add_time(Time.current_time(), fin));
			this.emprunts.put(exemplaire, pret);
			return exemplaire;
		}
		
		
		
		
	}
	
	
	public void ramener(Exemplaire e) {
		this.emprunts.remove(e);
		e.getOeuvre().setNbExCourrant(e.getOeuvre().getNbExCourrant()+1);
		
		
	}
	
	public Vector getExemplairesEmpruntes() {
		Vector v = new Vector<Exemplaire>();
		Set<Exemplaire> keySet = this.emprunts.keySet();
		Iterator<Exemplaire> it = keySet.iterator();
		while(it.hasNext()) {
			Exemplaire key = (Exemplaire)it.next();
			System.out.println(key.toString());
			v.add(key);
			
		}
		return v;
		
	}
	
	public int getNbPret() {
		return this.emprunts.size();
	}
	
	public String affichePret(int i) {
		//return this.emprunts.get(i).toString();
		ArrayList<Exemplaire> exemplaires = new ArrayList<Exemplaire>();
		ArrayList<Pret> prets = new ArrayList<Pret>();
		
		Set<Exemplaire> keySet = this.emprunts.keySet();
		Iterator<Exemplaire> it = keySet.iterator();
		while(it.hasNext()) {
			Exemplaire key = (Exemplaire)it.next();
			Pret vPret = this.emprunts.get(key);
			exemplaires.add(key);
			prets.add(vPret);
			
			}
		return ""+prets.get(i) + " " +exemplaires.get(i);
		}
		
	public boolean verifRetard() {
		boolean res = true;
		ArrayList<Exemplaire> exemplaires = new ArrayList<Exemplaire>();
		ArrayList<Pret> prets = new ArrayList<Pret>();
			
		Set<Exemplaire> keySet = this.emprunts.keySet();
		Iterator<Exemplaire> it = keySet.iterator();
		while(it.hasNext()) {
			Exemplaire key = (Exemplaire)it.next();
			Pret vPret = this.emprunts.get(key);
			exemplaires.add(key);
			prets.add(vPret);
		}
		
		for(Pret p : prets ) {
			if(p.Depasse() == false) {
				res = false;
				break;
			}
		}
		return res;
		
	}
		
	public boolean DelaiDepasse(int i) {
		ArrayList<Exemplaire> exemplaires = new ArrayList<Exemplaire>();
		ArrayList<Pret> prets = new ArrayList<Pret>();
			
		Set<Exemplaire> keySet = this.emprunts.keySet();
		Iterator<Exemplaire> it = keySet.iterator();
		while(it.hasNext()) {
				Exemplaire key = (Exemplaire)it.next();
				Pret vPret = this.emprunts.get(key);
				exemplaires.add(key);
				prets.add(vPret);
				
				}
		return prets.get(i).Depasse();
	}
	
	
		
	
	public String toString() {
		String s = "\nNom: "+this.getNom()+"\nPrénom: "+this.getPrenom()+" \nAdresse: "+this.getAdresse()+"\n";
		Set<Exemplaire> keySet = this.emprunts.keySet();
		Iterator<Exemplaire> it = keySet.iterator();
		while(it.hasNext()) {
			Exemplaire key = (Exemplaire) it.next();
			
			
			String valeur = this.emprunts.get(key).toString();
			
			s = s + "[Numéro exemplaire: "+key +" Titre: "+key.getOeuvre().getTitre()+  "] [Numéro du Prêt : " + valeur +"]\n";
		}
		
		
		return s;
		
		
	}

}
