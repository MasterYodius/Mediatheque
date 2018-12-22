package systemSimplifie;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SupprimerAdh extends JFrame{
	
	public SupprimerAdh(Adherents liste) {
		this.build(liste);
		this.setTitle("Nouvel Adhérent");
		this.setSize(600,400);
		this.setVisible(true);
		
	}
	public void build(Adherents liste) {
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		
		JLabel l = new JLabel("Liste des adhérents");
		panel1.add(l);
		l.setBounds(90, 30, 150, 25);
		
		String[] noms = new String[liste.getNbadherent()];
		for(int i = 0; i<liste.getList().size();i++) {
			noms[i] = liste.getList().get(i).getNom() + " " +liste.getList().get(i).getPrenom();
		}
		JComboBox listeNom = new JComboBox(noms);
		panel1.add(listeNom);
		listeNom.setBounds(l.getX() + 120, l.getY(), 200, 25);
		
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		JButton cancel = new JButton("Annuler");
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				
			}
		});
		
		JButton supp = new JButton("Supprimer");
		supp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String  n = (String)listeNom.getSelectedItem();
				String[] np = n.split(" ");
				
				
				Adherent a = liste.getAdherent2(np[0], np[1]);
				liste.supprimer(a);
				liste.sauvegarder();
				dispose();
			}
		});
		
		panel2.add(cancel);
		panel2.add(supp);
		this.add(panel1);
		this.add(panel2,BorderLayout.SOUTH);
	}

}
