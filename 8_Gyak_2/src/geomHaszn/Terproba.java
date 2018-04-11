package geomHaszn;
import geometria.Hasab;
import geometria.Henger;
import geometria.Teglatest;
public class Terproba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ter a = new Ter(5);
		a.setHasab(0, new Henger(10, 2));
		a.setHasab(2, new Teglatest(5, 4, 6));
		a.setHasab(4, new Henger(4, 4));
		
		for (int j = 0; j<a.maxHasabSzam(); j++){
			Hasab elem = a.getHasab(j);
			if (elem == null) System.out.println(j+ ": nincs");
			else{
				if (elem instanceof Henger)
					System.out.println(j+ ": "+((Henger)elem));
				else if (elem instanceof Teglatest)
					System.out.println(j+ ": "+((Teglatest)elem));
			}
		}
		System.out.println("Átlagos Térfogat: "+a.atlagosTerfogat());
		System.out.println("Hengerek száma: "+a.hengerekSzama());
		
	}

}
