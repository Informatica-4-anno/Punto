
public class Principale {

	public static void main(String[] args) {

		Punto p; // Allocazione della variabile che conterrà l'indirizzo dell'oggetto
		
		p = new Punto(3,8);  // Creazione dell'oggetto Punto (con richiamo del costruttore)
		                     // Assegna l'indirizzo dell'oggetto alla variabile p di tipo punto
		
		
		Punto p1 = new Punto(2.2,6);
		
		System.out.println(p);
		System.out.println(p1);
		
		System.out.println(p.distance(p1));
		System.out.println(p1.distance(p));
		System.out.println(p.distance(p));
		
		
		
		// Distanza tra p e p1???
		
		

	}

}
