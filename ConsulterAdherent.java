package systemSimplifie;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConsulterAdherent extends JFrame{
	
	public ConsulterAdherent(Adherents liste) {
		this.build(liste);
		this.setTitle("Consulter Adhérents");
		this.setSize(500,200);
		this.setVisible(true);
	}
	
	public void build(Adherents listeAdherent) {
		
		String[] noms = new String[listeAdherent.getNbadherent()];
		for(int i = 0; i<listeAdherent.getList().size();i++) {
			noms[i] = listeAdherent.getList().get(i).getNom() + " " +listeAdherent.getList().get(i).getPrenom();
		}
		JComboBox listeNom = new JComboBox(noms);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		JLabel text = new JLabel("Liste des adhérents");
		
		panel.add(text);
		panel.add(listeNom);
		this.add(panel,BorderLayout.NORTH);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridBagLayout());
		JCheckBox coord = new JCheckBox("Afficher les coordonnées de l'adhérent");
		JCheckBox prets = new JCheckBox("Afficher les prêts en cours");
		
		panel2.setBackground(Color.WHITE);
		panel2.add(coord);
		panel2.add(prets);
		this.add(panel2,BorderLayout.CENTER);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		JButton boutonOK = new JButton("OK");
		JButton boutonCancel = new JButton("Annuler");
		//JLabel test = new JLabel((String)listeNom.getSelectedItem());
		//String[] div = test.getText().split(" ");
		//JLabel test2 = new JLabel(div[1]);
		//this.add(test2);
		//Adherent testa = listeAdherent.getAdherent2(div[0], div[1]);
	//	System.out.println(testa.toString());
		boutonOK.addActionListener(new ActionListener() {
		
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if((coord.isSelected() == true) && (prets.isSelected() == true)) {
					System.out.println((String)listeNom.getSelectedItem());
					DetailAdherent d = new DetailAdherent(listeAdherent, (String) listeNom.getSelectedItem());
					//System.out.println(listeNom.getSelectedItem().toString());
				}
				else if((coord.isSelected() == true) && (prets.isSelected() == false)) {
					DetailAdherentCoor d = new DetailAdherentCoor(listeAdherent,(String) listeNom.getSelectedItem());
				}
				else if((coord.isSelected() == false) && (prets.isSelected() == true)) {
					DetailAdherentPret d = new DetailAdherentPret(listeAdherent,(String) listeNom.getSelectedItem());

				}
				
			}
			
		});
		
		boutonCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		panel3.add(boutonOK);
		panel3.add(boutonCancel);
		this.add(panel3, BorderLayout.SOUTH);
		
		
		
		
	}
	

}
