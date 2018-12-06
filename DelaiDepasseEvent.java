package systemSimplifie;

import java.util.EventObject;

public class DelaiDepasseEvent extends EventObject{
	private Exemplaire exemplaire;
	private Adherent adherent;
	
	public DelaiDepasseEvent(Adherents a) {
		super(a);
		}
	
	
	

}
