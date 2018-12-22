package systemSimplifie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DetailAdherentPret extends JFrame{
	public DetailAdherentPret(Adherents liste,String nom) {
		this.build(liste,nom);
		this.setTitle("Détails");
		this.setSize(500,400);
		this.setVisible(true);
	}
	
	public void build(Adherents liste,String nom) {
		String[] np = nom.split(" ");
		System.out.println(np[0] +" "+np[1]);
		Adherent a = liste.getAdherent2(np[0], np[1]);
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		JLabel nomPrenom  =new JLabel(a.getNom() + " "+a.getPrenom());
		
		panel1.add(nomPrenom);
		this.add(panel1,BorderLayout.NORTH);
		
		//JOptionPane test = new JOptionPane("ALERTE");
		
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
		if(a.verifRetard() == false) {
			JOptionPane test = new JOptionPane();
			test.showMessageDialog(null, "Cet Adhérent a des prêts en retard", "Information", JOptionPane.INFORMATION_MESSAGE);
		}
		this.add(panel2, BorderLayout.WEST);
		
		/*JLabel prets = new JLabel(a.affichePret2());

		panel2.add(prets);
		this.add(panel2, BorderLayout.WEST);
		*/
	}

}
