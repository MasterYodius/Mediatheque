package systemSimplifie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NouveauOeuvre extends JFrame{
	
	public NouveauOeuvre(ListeOeuvre liste) {
		this.build(liste);
		this.setTitle("Nouvelle Oeuvre");
		this.setSize(800,500);
		this.setVisible(true);
	}
	
	public void build(ListeOeuvre liste) {
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		
		//champNom.setBounds(n.getX()+20, n.getY(), 100, 25);

		String[] types = new String[2]; 
		types[0] = "Variétée";
		types[1] = "Opéra";
		
		JLabel t = new JLabel("Type : ");
		t.setBackground(Color.WHITE);
		JComboBox champType = new JComboBox(types);
		//champNom.setBackground(Color.WHITE);
		panel1.add(t);
		t.setBounds(120, 70, 80, 25);
		panel1.add(champType);
		champType.setBounds(t.getX()+40, t.getY(), 150, 25);
		
		JLabel n = new JLabel("Titre : ");
		JTextField champTitre = new JTextField();
		panel1.add(n);
		n.setBounds(t.getX(), t.getY()+40, t.getWidth(), t.getHeight());
		panel1.add(champTitre);
		champTitre.setBounds(n.getX() + 60, n.getY(), champType.getWidth(), champType.getHeight());
		
		JLabel a = new JLabel("Auteur : ");
		JTextField champAuteur = new JTextField();
		panel1.add(a);
		a.setBounds(n.getX(), n.getY()+40, n.getWidth(), n.getHeight());
		panel1.add(champAuteur);
		champAuteur.setBounds(a.getX() + 60, a.getY(), champType.getWidth(), champType.getHeight());
		
		JLabel e = new JLabel("Nombre d'exemplaires : ");
		JTextField champExemplaire = new JTextField();
		panel1.add(e);
		e.setBounds(n.getX(), a.getY()+40, 150, n.getHeight());
		panel1.add(champExemplaire);
		champExemplaire.setBounds(e.getX() + 160, e.getY(), champType.getWidth(), champType.getHeight());
		
		JButton cancel = new JButton("Annuler");
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		JButton valider = new JButton("Valider");
		valider.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String type = (String)champType.getSelectedItem();
				boolean res = type.equals("Variétée");
				if(res == true) {
					Oeuvre o = new Varietee(champTitre.getText(), champAuteur.getText(), Integer.parseInt(champExemplaire.getText()));
					liste.ajout(o);
				}
				
				else {
					Oeuvre o = new Opera(champTitre.getText(), champAuteur.getText(), Integer.parseInt(champExemplaire.getText()));
					liste.ajout(o);
				}
				liste.sauvegarder();
				dispose();
			}
		});
		
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(cancel);
		panel2.add(valider);
		
		
		this.add(panel1);
		this.add(panel2,BorderLayout.SOUTH);
	}

}
