package systemSimplifie;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Menu extends JMenuBar{
	
	private JMenu adherents = new JMenu("Adhérents");
	
	private JMenuItem nouveauA = new JMenuItem("Nouveau");
	private JMenuItem consulterA = new JMenuItem("Consulter");
	private JMenuItem supprimerA = new JMenuItem("Supprimer");
	
	private JMenu oeuvre = new JMenu("Oeuvres");
	private JMenuItem nouveauO = new JMenuItem("Nouveau");
	private JMenuItem consulterO = new JMenuItem("Consulter");
	private JMenuItem supprimerO = new JMenuItem("Supprimer");
	
	public Menu(Adherents listeAdherent,ListeOeuvre listeOeuvre) {
		this.add(adherents);
		adherents.add(nouveauA);
		adherents.add(consulterA);
		adherents.add(supprimerA);
		
		consulterA.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ConsulterAdherent fen = new ConsulterAdherent(listeAdherent);
				
				
				
			}
		});
		
		nouveauA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				NouveauAdh fenNewA = new NouveauAdh(listeAdherent);
				
			}
		});
		
		supprimerA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SupprimerAdh fenSupA = new SupprimerAdh(listeAdherent);
				
			}
		});
		
		this.add(oeuvre);
		oeuvre.add(nouveauO);
		oeuvre.add(consulterO);
		oeuvre.add(supprimerO);
		
		nouveauO.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				NouveauOeuvre fenNO = new NouveauOeuvre(listeOeuvre);
			}
		});
		
		consulterO.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ConsulterOeuvre fenConOe = new ConsulterOeuvre(listeOeuvre);
			}
		});
		
		supprimerO.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SupprimerOeuvre fenSO = new SupprimerOeuvre(listeOeuvre);
			}
		});
		
		
		
		
	}

}
