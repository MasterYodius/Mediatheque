package systemSimplifie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ListeOeuvre implements Serializable{
	private ArrayList<Oeuvre> liste;
	
	public ListeOeuvre() {
		this.liste = new ArrayList<Oeuvre>();
	}
	
	public Oeuvre getOeuvre(int i) {
		return this.liste.get(i);
	}
	
	public Oeuvre getOeuvre2(String t) {
		Oeuvre o = null;
		for(Oeuvre courant : this.liste) {
			if((courant.getTitre().equals(t))){
				o = courant;
				break;
			}
		}
		return o;
	}
	
	public int getNbOeuvre() {
		return this.liste.size();
	}
	
	public ArrayList<Oeuvre> getListe(){
		return this.liste;
	}
	
	public void ajout(Oeuvre o) {
		boolean exist = false;
		for(Oeuvre a : this.liste) {
			if((a.getTitre().equals(o.getTitre())) &&( a.getAuteur().equals(o.getAuteur()))) {
				exist = true;
				a.setNbExemplaire(a.getNbExemplaire() + o.getNbExemplaire());
				a.setNbExCourrant(a.getNbExCourrant()+o.getNbExemplaire());
			}
		}
		if(exist == false) {
			this.liste.add(o);
		}
	}
	public void supprimer(Oeuvre o) {
		this.liste.remove(o);
	}
	
	public void sauvegarder() {
		try {
			FileOutputStream file = new FileOutputStream("listeOeuvre");
			ObjectOutputStream oos = new ObjectOutputStream(file);
			//System.out.println(this.listeAdherents);
			oos.writeObject(this.liste);
			/*for(Adherent a : this.listeAdherents) {
				oos.writeObject(a);
			}*/
			oos.close();
			file.close();
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void restaurer() throws IOException, ClassNotFoundException {
		
			FileInputStream file = new FileInputStream("listeOeuvre");
			ObjectInputStream ois = new ObjectInputStream(file);
			this.liste = (ArrayList<Oeuvre>)ois.readObject();
			ois.close();
			file.close();
		
	}
	
	public String toString() {
		String s = "";
		for(Oeuvre o : this.liste) {
			s = s + o.toString() + "\n";
		}
		return s;
	}

}
