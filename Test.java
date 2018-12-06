package systemSimplifie;

public class Test {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	
		/*Oeuvre o = new Oeuvre("Harry Potter", "JK Rowling", 5);
		Oeuvre o2 = new Oeuvre("Harry Potter 2", "JK Rowling", 1);
		Oeuvre o3 = new Oeuvre("Harry Potter 3", "JK Rowling", 3);
		Oeuvre o4 = new Oeuvre("Harry Potter 4", "JK Rowling", 2);
		Oeuvre o5 = new Oeuvre("Harry Potter 5", "JK Rowling", 4);
		Oeuvre o6 = new Oeuvre("Harry Potter 6", "JK Rowling", 8);
		Oeuvre o7 = new Oeuvre("Harry Potter 7", "JK Rowling", 1);
		
		Adherent a1 = new Adherent("OUDNI", "Alexandre", "70 avenue Jean Lolive");
		
	//	System.out.println(o2.getNbExCourrant());
	
		try {
			a1.emprunter(o);
		
			a1.emprunter(o);
			a1.emprunter(o);
			a1.emprunter(o);
			a1.emprunter(o);
			a1.emprunter(o3);
			a1.emprunter(o2);
			a1.emprunter(o2);
			a1.emprunter(o7);
		
		}catch (PasdExemplaireException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(a1.toString());
		
		/*try {
			a1.emprunter(o);
		 
		a1.emprunter(o2);
		a1.emprunter(o3);
		a1.emprunter(o4);
		a1.emprunter(o4);
		a1.emprunter(o2);
		a1.emprunter(o7);
		}catch (PasdExemplaireException e) {
			// TODO Auto-generated catch block
			
		}
		*/
	/*	try {
			a1.emprunter(o);
		} catch (PasdExemplaireException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a1.toString();
		*/
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
	 
	        } catch( Exception e ){             
	        	e.printStackTrace() ;         
	        	}
		  

	}

}
