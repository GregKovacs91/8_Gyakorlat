package harmadik;

import java.awt.Color;

import Szinezo.Szinezheto;
import masik.SzinesPont;

public class Futtat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Szinezheto szinespont = new SzinesPont(3, 5,Color.BLUE);
		System.out.println(szinespont);
		szinespont.setAlapertelmezett(Color.GREEN);
		System.out.println(szinespont);
		Atszinez(szinespont);
		
	}
	
	public static void Atszinez(Szinezheto objektum){
		objektum.setAlapertelmezett(objektum.alapertelmezett);	
	}
	
	
}
