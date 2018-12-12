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
			if((ad.getNom() == n) && (ad.getPrenom() == p) && (ad.getAdresse() == a))
				res = ad;
			break;
			}
		return res;
		
	}
	
	/*public void addDelaiRestitutionDepasseListener(DelaiRestitutionDepasseListener l) {
		l.exemplaireNonRestitue(evt);
		
	}
	*/
	
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
