package geomHaszn;
import geometria.Henger;
import geometria.Hasab;

public class Ter {
	private Hasab[] testek;

	public Ter(int hasabokSzama){
		this.testek = new Hasab[hasabokSzama];
	}
	public void setHasab(int index, Hasab h){
		this.testek[index] = h;
	}
	public int maxHasabSzam(){
		return this.testek.length;
	}
	public Hasab getHasab(int index){
		return this.testek[index];
	}
	public int NemNullDb(){
		int db=0;
		for(int j=0; j< this.testek.length; j++)
			if (testek[j] != null) db++;
		return db;
	}
	
	public double atlagosTerfogat(){
		int db = maxHasabSzam();
		if (db == 0) return 0;
		double szum = 0;
		db = 0;
		for (int j = 0; j<this.testek.length; j++)
		if(testek[j] != null){
			szum+=testek[j].terfogat();
			db++;
		}
		return szum/db;
	}
	public int hengerekSzama(){
		int db =0;
		for (int j = 0; j < maxHasabSzam(); j++){
			if (testek[j] != null) {
				if (testek[j] instanceof Henger) db++;
			}
		}
		return db;
	}
	
}
