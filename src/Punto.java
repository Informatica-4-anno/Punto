
public class Punto {
	private double x;
	private double y;

	public Punto(double x, double y) {
		System.out.println("Eseguo il costruttore!!");
		this.x=x;
		this.y=y;
		System.out.println("Fine costruttore");
	}
	
	public Punto(Punto p /* Parametro formale */) {  // Copy constructor
		System.out.println("Eseguo il copy constructor");
		this.x=p.getX();
		this.y=p.getY();
	}
	
	public void move(double deltax, double deltay) {
		x=x+deltax;   // x+=deltax;
		y=y+deltay;   // y+=deltay;
		deltax=99;
	}
	
	public void allign(Punto p) {
		p.y=this.y;  // copia del valore
		p=new Punto(99,99); // questa istruzione invece non avrà effetto 
		                    // fuori da questo metodo!!! (non posso cambiare il valore di p)
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
