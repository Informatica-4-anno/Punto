
public class Punto {
	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x=x;
		this.y=y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public double distance( Punto p1) {
        return(Math.sqrt(Math.pow((this.x -p1.getX()),2)+Math.pow((this.y-p1.getY()),2)));    
	}

	@Override
	public String toString() {
		return "Il punto è (" + x + "," + y + ")";
	}
	
}
