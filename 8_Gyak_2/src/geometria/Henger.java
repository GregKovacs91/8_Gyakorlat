package geometria;

public class Henger extends Hasab {
	private double sugar;
	public Henger(int magassag, double sugar){
		super(magassag);
		this.sugar = sugar;
	}

	@Override
	public double alapterulet() {
		// TODO Auto-generated method stub
		return Math.pow(this.sugar, 2)*Math.PI;
	}
	@Override
	public String toString(){
		return "Henger: "+this.sugar+", "+this.getMagassag();
	}

}
