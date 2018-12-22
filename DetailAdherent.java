package systemSimplifie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DetailAdherent extends JFrame{
	
	public DetailAdherent(Adherents liste,String nom) {
		this.build(liste,nom);
		this.setTitle("Détails");
		this.setSize(600,400);
		this.setVisible(true);
		
	}
	
	public void build(Adherents liste,String nom) {
		this.setLayout(new GridBagLayout());
		GridBagConstraints g = new GridBagConstraints();
		g.weighty =0;


		String[] np = nom.split(" ");
		System.out.println(np[0] +" "+np[1]);
		Adherent a = liste.getAdherent2(np[0], np[1]);
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		JLabel nomPrenom  =new JLabel("Nom : " + a.getNom() + "        Prénom : "+a.getPrenom());
		JLabel coord = new JLabel("       Adresse : "+a.getAdresse());
		panel1.add(nomPrenom);
		panel1.add(coord,BorderLayout.SOUTH);
		this.add(panel1,g);
		g.gridy = 1;
		
		System.out.println("verif "+a.verifRetard());
		
		
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.weightx = a.getNbPret();
		JLabel tousPret = new JLabel();
		for(int i =0;i<a.getExemplairesEmpruntes().size();i++) {
			System.out.println(i);
			JLabel prets = new JLabel(a.affichePret(i));
			if(a.DelaiDepasse(i) != true)
				prets.setForeground(Color.RED);
			else
				prets.setForeground(Color.BLACK);
			panel2.add(prets, gc);
			gc.gridx = 0;
			gc.gridy = i+1;
		}
		this.add(panel2,g);
		
		
		
		if(a.verifRetard() == false) {
			JOptionPane test = new JOptionPane();
			test.showMessageDialog(null, "Cet Adhérent a des prêts en retard", "Information", JOptionPane.INFORMATION_MESSAGE);
			
			
		}
		
		/*JLabel prets = new JLabel(a.affichePret2());

		panel2.add(prets);
		this.add(panel2, BorderLayout.WEST);
		*/
	}

}
