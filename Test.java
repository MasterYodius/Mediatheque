package systemSimplifie;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JMenu;

public class Test {

	public static void main(String[] args)  {
		JFrame fenetre = new JFrame("Médiathèque");
		Dimension ecran = Toolkit.getDefaultToolkit().getScreenSize();
		/*fenetre.setPreferredSize(new Dimension(ecran.width, ecran.height));
		fenetre.setLocation(ecran.width / 4, ecran.height / 4);
		*/
		fenetre.setSize(ecran.width/4, ecran.height/4);
		
		
		
		
		
		
		  try{          
			  Adherent adherent1 = new Adherent( "Albert", "Durant", "2 allee tataouine" ) ;             
			  Adherent adherent2 = new Adherent( "Joseph", "Beauve", "14 rue de la grange" ) ;                       
			  String titre = "BestOfLouisMariano" ;             
			  String auteur = "Louis Mariano" ;            
			  int nombreExemplaire = 3 ;             
			  Varietee varietee1 = new Varietee( titre, auteur, nombreExemplaire ) ;                          
			 // System.out.println( "Adherent 1 avant emprunt = " + adherent1 ) ; 
			  Exemplaire exemplaire = adherent1.emprunter( varietee1 ) ;             
			 // System.out.println( "Adherent 1 apres emprunt = " + adherent1 ) ; 
			  
	        //  adherent1.ramener( exemplaire ) ;          
	       //   System.out.println( "Adherent 1 apres restitution = " + adherent1 ) ; 
	          Adherents liste = new Adherents();
			  liste.addAdherent(adherent1);
			  liste.addAdherent(adherent2);
			  System.out.println(liste.toString());
			  /*Vector v = adherent1.getExemplairesEmpruntes();
			  String s = "";
			  for(int i = 0;i<v.size();i++) {
				  s = s + v.get(i).toString()+"\n";
			  }
			  System.out.println(s);
	 */
			  liste.sauvegarder();
			  Adherents liste2 = new Adherents();
			  liste2.restaurer();
			  System.out.println(liste2.toString());
			  
			  
			  Menu menu = new Menu(liste);
				
				fenetre.setJMenuBar(menu);
				
				
				
				fenetre.setVisible(true);
			  
	        } catch( Exception e ){             
	        	e.printStackTrace() ;         
	        	}
		  

	}

}
