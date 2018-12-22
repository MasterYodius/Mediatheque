package systemSimplifie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NouveauAdh extends JFrame{
	
	public NouveauAdh(Adherents liste) {
		this.build(liste);
		this.setTitle("Nouvel Adhérent");
		this.setSize(600,400);
		this.setVisible(true);
		
	}
	
	public void build(Adherents liste) {
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		
		//champNom.setBounds(n.getX()+20, n.getY(), 100, 25);

		
		
		JLabel n = new JLabel("Nom : ");
		n.setBackground(Color.WHITE);
		JTextField champNom = new JTextField();
		//champNom.setBackground(Color.WHITE);
		panel1.add(n);
		n.setBounds(120, 70, 80, 25);
		panel1.add(champNom);
		champNom.setBounds(n.getX()+40, n.getY(), 150, 25);
		
		JLabel p = new JLabel("Prénom : ");
		JTextField champPrenom = new JTextField();
		panel1.add(p);
		p.setBounds(n.getX(), n.getY()+40, n.getWidth(), n.getHeight());
		panel1.add(champPrenom);
		champPrenom.setBounds(p.getX() + 60, p.getY(), champNom.getWidth(), champNom.getHeight());
		
		JLabel a = new JLabel("Adresse : ");
		JTextField champAdress = new JTextField();
		panel1.add(a);
		a.setBounds(n.getX(), p.getY()+40, p.getWidth(), p.getHeight());
		panel1.add(champAdress);
		champAdress.setBounds(a.getX() + 60, a.getY(), champNom.getWidth(), champNom.getHeight());
		
		
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
		
		JButton valid = new JButton("Valider");
		valid.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Adherent a = new Adherent(champNom.getText(),champPrenom.getText(),champAdress.getText());
				liste.addAdherent(a);
				liste.sauvegarder();
				dispose();
			}
		});
		
		panel2.add(cancel);
		panel2.add(valid);
		this.add(panel1);
		this.add(panel2,BorderLayout.SOUTH);
				
		
		
		
	}

}
