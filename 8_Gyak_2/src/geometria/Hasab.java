package geometria;

public abstract class Hasab {
	private int magassag;
	public Hasab(int magassag){
		this.magassag = magassag;
	}
	public double getMagassag(){
		return magassag;
	}
	public abstract double alapterulet();
	
	public double terfogat(){
		return this.magassag * alapterulet();
	}
	public boolean nagyobbTerfogatu(Hasab masik){
		return this.terfogat() > masik.terfogat();
	}

}
