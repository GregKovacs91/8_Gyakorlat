package masik;

import java.awt.Color;
import Szinezo.Szinezheto;
public class SzinesPont extends Pont implements Szinezheto {
	private Color szin;
	
	public SzinesPont(int x, int y, Color szin){
		super (x, y);
		this.szin = szin;
	}
	
	
	public  String toString(){
		return "Szinespont: "+super.toString();
	}

	@Override
	public Color getAlapertelmezettt() {
		
		// TODO Auto-generated method stub
		return alapertelmezett;
	}

	@Override
	public void setAlapertelmezett(Color szin) {
		// TODO Auto-generated method stub
		//szin = alapertelmezett;
		this.szin = szin;
	}

}
