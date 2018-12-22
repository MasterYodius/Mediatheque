package systemSimplifie;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JMenu;

public class Test {

	public static void main(String[] args)  {
		JFrame fenetre = new JFrame("Médiathèque");
		Dimension ecran = Toolkit.getDefaultToolkit().getScreenSize();
		//fenetre.setPreferredSize(new Dimension(ecran.width, ecran.height));
		fenetre.setLocation(ecran.width / 4, ecran.height / 4);
		
		fenetre.setSize(ecran.width/4, ecran.height/4);
		
		
		//System.out.println(Time.diff_time(Time.add_time(Time.current_time(), -10)));
		
		
		
		  try{          
			  Adherent adherent1 = new Adherent( "Albert", "Durant", "2 allee tataouine" ) ;             
			  Adherent adherent2 = new Adherent( "Joseph", "Beauve", "14 rue de la grange" ) ;                       
			  String titre = "BestOfLouisMariano" ;             
			  String auteur = "Louis Mariano" ;            
			  int nombreExemplaire = 3 ;             
			  Varietee varietee1 = new Varietee( titre, auteur, nombreExemplaire ) ;
			  ListeOeuvre listeO = new ListeOeuvre();
			 // System.out.println( "Adherent 1 avant emprunt = " + adherent1 ) ; 
			  Exemplaire exemplaire = adherent1.emprunter( varietee1,10,5 ) ;             
			 // System.out.println( "Adherent 1 apres emprunt = " + adherent1 ) ; 
			  
	        //  adherent1.ramener( exemplaire ) ;          
	       //   System.out.println( "Adherent 1 apres restitution = " + adherent1 ) ; 
	          Adherents liste = new Adherents();
			  liste.addAdherent(adherent1);
			  liste.addAdherent(adherent2);
			  Adherent joris = new Adherent("Joris","Muratet","Efrei");
			  Varietee v1 = new Varietee("Harry Potter","JKRowling",6);
			  Varietee v2 = new Varietee("Harry Potter 2","JKRowling",6);
			  Varietee v3 = new Varietee("Harry Potter 3","JKRowling",6);
			  Varietee v4 = new Varietee("Harry Potter 4","JKRowling",6);
			  Varietee v5 = new Varietee("Harry Potter 5","JKRowling",6);
			  Varietee v6 = new Varietee("Harry Potter 6","JKRowling",6);
			  Exemplaire e1 = joris.emprunter(v1, 1, 14);
			  Exemplaire e2 = joris.emprunter(v2, 1, 14);
			  Exemplaire e3 = joris.emprunter(v3, 1, 14);
			  Exemplaire e4 = joris.emprunter(v4, -16, -1);
			  Exemplaire e5 = joris.emprunter(v5, 1, 14);
			  Exemplaire e6 = joris.emprunter(v6, 1, 14);
			  listeO.ajout(varietee1);
			  listeO.ajout(v1);
			  listeO.ajout(v2);
			  listeO.ajout(v3);
			  listeO.ajout(v4);
			  listeO.ajout(v5);
			 // listeO.sauvegarder();
			  listeO.ajout(v6);
			 
			  
			  Adherents liste2 = new Adherents();
			  liste.addAdherent(joris);
			 // liste.sauvegarder();
			  
			  liste2.restaurer();
			  ListeOeuvre listeO2 = new ListeOeuvre();
			  listeO2.restaurer();
			
			  
			 
		//	  System.out.println(liste.toString());
			  /*Vector v = adherent1.getExemplairesEmpruntes();
			  String s = "";
			  for(int i = 0;i<v.size();i++) {
				  s = s + v.get(i).toString()+"\n";
			  }
			  System.out.println(s);
	 */
		//	  liste.sauvegarder();
			 
			 // System.out.println(liste2.toString());
			 /* String test2 = "Albert Durant";
			 
			  
			  String[] np = test2.split(" ");
			  np[0] = np[0].trim();
			  System.out.println(np[0]);
			  System.out.println(np[1]);
			  np[1] = np[1].trim();*/
			 /* for(int i = 0; i<test2.length()-1; i++) {
				
				  System.out.println(np[i]);
			  }
			 /* np[0] = "Albert";
			  np[1] = "Durant";*/
			 // Adherent aaa = liste.getAdherent2((String)np[0], (String)np[1]);
			 // System.out.println(aaa);
			// System.out.println( aaa.toString() );
			  
			  
			  	Menu menu = new Menu(liste2,listeO2);
				fenetre.setJMenuBar(menu);
				
				
				
				
			  	fenetre.setVisible(true);
			  
	        } catch( Exception e ){             
	        	e.printStackTrace() ;         
	        	}
	/*	System.out.println(Time.current_time());
		System.out.println(Time.add_time(Time.current_time(), 10));
		LocalDate c = Time.add_time(Time.current_time(), -10);
		System.out.println(Time.diff_time(c));
		  */

	}

}
