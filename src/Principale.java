
public class Principale {

	public static void main(String[] args) {
		
		// Reference      Oggetto
		Punto p       =  new Punto(4,5);
		
		Punto p1 = p; // Shallow --> copia il reference dell'oggetto
		              //    Due reference che puntano allo stesso oggetto!!!
		
		
		p1.move(2, -2);
		
		System.out.println("Ecco p1="+p1);
		System.out.println("Ecco p="+p);
		
		Punto p2=new Punto(p1.getX(),p1.getY());  // Deep copy
		Punto p3=new Punto(p2  /* Parametro attuale */ );  //  usando il copy constructor 
		
		double a=6;
		double b=5;
		p2.move(a, b); /* parametri attuali passati per valore */ 
		/*
		 * Con il passaggio dei parametri per valore anche se nel metodo move
		 * un parametro (in questo caso a) viene modificato, all'uscita dal 
		 * metodo il parametro non viene modificato.
		 * Come si vede dalla seguente System.out.println	
		 */
		System.out.println("a="+a); 
		
		p3.move(2, 1); /* Con il passaggio per valore posso quindi passare anche
		               ** valori costanti
		               */
		System.out.println("Ecco p2="+p2);
		System.out.println("Ecco p3="+p3);
		
		/*
		 * Il metodo align invece allinea i punti, cambiando l'ordinata
		 * del punto passato come parametro, quindi modifica il valore 
		 * dell'oggetto parametro, questo è possibile grazie al passaggio
		 * per referenza che vuol dire che io passo il reference (ovvero il 
		 * riferimento all'oggetto) non l'oggetto stesso (come la shallow copy)
		 * quindi posso modificare l'oggetto perchè l'area di memoria che 
		 * lo contiene non viene duplicata.
		 * Non posso cambiare invece il valore del reference, ovvero se all'interno
		 * del metodo creassi un altro oggetto punto, il cambiamento non si 
		 * riperquoterebbe all'esterno del metodo stesso. 
		 */
		p3.allign(p2); /* Passaggio parametri per referenza */
		
		System.out.println("Ecco p2="+p2);
		System.out.println("Ecco p3="+p3);	
	}

}
