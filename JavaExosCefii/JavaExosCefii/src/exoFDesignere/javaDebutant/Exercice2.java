package exoFDesignere.javaDebutant;
import java.math.*;

public class Exercice2 {

	public void calcCarre () {
		
		int nbAlea = (int) (Math.random()*10) +1;
		int nbAleaCarre = nbAlea * nbAlea;
		System.out.println(" " + nbAlea + " au carré = " + nbAlea + "x" + nbAlea);
		System.out.println(" " + nbAlea + " au carré = " + nbAleaCarre);
	}
	
}
