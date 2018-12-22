package systemSimplifie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Adherents implements Serializable{
	
	private ArrayList<Adherent> listeAdherents;
	//private ArrayList<DelaiRestitutionDepasseListener> delaisDepasses;
	
	public Adherents() {
		this.listeAdherents = new ArrayList<Adherent>();
		//this.delaisDepasses = new ArrayList<DelaiRestitutionDepasseListener>();
	}
	
	public void addAdherent(Adherent a) {
		this.listeAdherents.add(a);
	}
	
	public Adherent getAdherent(String n, String p,String a) {
		Adherent res = null;
		for(Adherent ad : this.listeAdherents) {
			if((ad.getNom().equals(n)) && (ad.getPrenom().equals(p)) && (ad.getAdresse().equals(a)))
				res = ad;
			break;
			}
		return res;
		
	}
	
	public Adherent getAdherent2(String n, String p) {
		Adherent res = null;
		for(Adherent ad : this.listeAdherents) {
			System.out.println("Nom  : "+n +" nom courant :" +ad.getNom());
			
			if((ad.getNom().equals(n)) && (ad.getPrenom().equals(p))) {
				System.out.println("entré");
				res = ad;
				break;
			}
			}
		return res;
	}
	
	public ArrayList<Adherent> AdherentsRetard() {
		ArrayList<Adherent> retards = new ArrayList<Adherent>();
		for(Adherent a : this.listeAdherents) {
			for(int i =0; i<a.getNbPret();i++) {
				if(a.DelaiDepasse(i) == true) {
					retards.add(a);
					break;
				}
			}
		}
		return retards;
		
	}
	
	/*public void addDelaiRestitutionDepasseListener(DelaiRestitutionDepasseListener l) {
		l.exemplaireNonRestitue(evt);
		
	}
	*/
	
	public int getNbadherent() {
		return this.listeAdherents.size();
	}
	
	public ArrayList<Adherent> getList(){
		return this.listeAdherents;
	}
	
	public void supprimer(Adherent a) {
		this.listeAdherents.remove(a);
	}
	
	
	public void sauvegarder() {
		try {
			FileOutputStream file = new FileOutputStream("listeAdherents");
			ObjectOutputStream oos = new ObjectOutputStream(file);
			//System.out.println(this.listeAdherents);
			oos.writeObject(this.listeAdherents);
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
	public void restaurer() {
		try {
			FileInputStream file = new FileInputStream("listeAdherents");
			ObjectInputStream ois = new ObjectInputStream(file);
			this.listeAdherents = (ArrayList<Adherent>)ois.readObject();
			ois.close();
			file.close();
		}catch(ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
         } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public String toString() {
		String s = "Liste des adhérents :\n";
		for(Adherent a : this.listeAdherents) {
			s += a.toString() + "\n";
			
		}
		return s;
	}
	
	

}
