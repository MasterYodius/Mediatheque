package systemSimplifie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar{
	
	private JMenu adherents = new JMenu("Adhérents");
	
	private JMenuItem nouveauA = new JMenuItem("Nouveau");
	private JMenuItem consulterA = new JMenuItem("Consulter");
	private JMenuItem supprimerA = new JMenuItem("Supprimer");
	
	private JMenu oeuvre = new JMenu("Oeuvres");
	private JMenuItem nouveauO = new JMenuItem("Nouveau");
	private JMenuItem consulterO = new JMenuItem("Consulter");
	private JMenuItem supprimerO = new JMenuItem("Supprimer");
	
	public Menu(Adherents listeAdherent) {
		this.add(adherents);
		adherents.add(nouveauA);
		adherents.add(consulterA);
		adherents.add(supprimerA);
		
		consulterA.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame fenetreConsulter = new JFrame("Consulter Adherents"); 
				JComboBox listeA = new JComboBox();
				
				
				fenetreConsulter.setSize(500,200);
				fenetreConsulter.setVisible(true);
				
				
			}
		});
		
		this.add(oeuvre);
		oeuvre.add(nouveauO);
		oeuvre.add(consulterO);
		oeuvre.add(supprimerO);
		
		
		
		
	}

}
