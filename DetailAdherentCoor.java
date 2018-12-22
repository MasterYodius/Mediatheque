package systemSimplifie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DetailAdherentCoor extends JFrame{
	
	public DetailAdherentCoor(Adherents liste,String nom) {
		this.build(liste,nom);
		this.setTitle("Détails");
		this.setSize(200,200);
		this.setVisible(true);
	}
	
	public void build(Adherents liste,String nom) {
		String[] np = nom.split(" ");
		System.out.println(np[0] +" "+np[1]);
		Adherent a = liste.getAdherent2(np[0], np[1]);
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		JLabel nomPrenom  =new JLabel(a.getNom() + " "+a.getPrenom());
		JLabel coord = new JLabel("Adresse : "+a.getAdresse());
		panel1.add(nomPrenom);
		
		this.add(panel1,BorderLayout.NORTH);
		this.add(coord,BorderLayout.CENTER);
		
		//JOptionPane test = new JOptionPane("ALERTE");
		
		
		
		/*JLabel prets = new JLabel(a.affichePret2());

		panel2.add(prets);
		this.add(panel2, BorderLayout.WEST);
		*/
	}

}
