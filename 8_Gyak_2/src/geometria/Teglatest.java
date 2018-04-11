package geometria;

public class Teglatest extends Hasab {
	private double aold;
	private double bold;
	public Teglatest(int magassag, double aold, double bold) {
		super(magassag);
		this.aold = aold;
		this.bold = bold;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double alapterulet() {
		return this.aold * this.bold;
		// TODO Auto-generated method stub
	}
	@Override
	public String toString(){
		return "Téglatest: "+this.aold+", "+this.bold+", "+this.getMagassag();
	}
}
