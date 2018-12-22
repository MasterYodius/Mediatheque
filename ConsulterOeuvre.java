package systemSimplifie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConsulterOeuvre extends JFrame{
	
	public ConsulterOeuvre(ListeOeuvre liste) {
		this.build(liste);
		this.setTitle("Consulter Oeuvre");
		this.setSize(800,200);
		this.setVisible(true);
	}
	
	public void build(ListeOeuvre liste) {
		/*JPanel panel1 = new JPanel();
		JLabel label = new JLabel(liste.toString());
		panel1.add(label);
		this.add(panel1);*/
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.weightx = liste.getNbOeuvre();
		
		
		for(int i = 0; i<liste.getNbOeuvre() ; i++) {
			JLabel oeuvre = new JLabel(liste.getOeuvre(i).toString());
			panel2.add(oeuvre,gc);
			gc.gridx = 0;
			gc.gridy = i+1;
			
		}
		
		this.add(panel2,BorderLayout.NORTH);
		
	
		
	}

}
