
public class Principale {

	public static void main(String[] args) {

		Punto p = new Punto(3,8);
		
		Punto p1 = new Punto(2.2,6);
		
		System.out.println(p);
		System.out.println(p1);
		
		p.distance(p1);
		p1.distance(p);
		
		// Distanza tra p e p1???
		
		

	}

}
