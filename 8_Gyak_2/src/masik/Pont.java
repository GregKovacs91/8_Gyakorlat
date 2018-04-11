package masik;

public class Pont {
		private int x;
		private int y;
		
		public Pont (int x, int y){
			this.x =x;
			this.y = y;
		}
		@Override
		public  String toString(){
			return "Visszaad: "+this.x+", "+this.y;
		}

}
