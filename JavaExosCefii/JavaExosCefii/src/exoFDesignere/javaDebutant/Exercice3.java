package exoFDesignere.javaDebutant;

import java.math.*;

public class Exercice3 {

	static double PI = 3.14; 
	
	public void calcPerimetre () {
		
		int rayon = (int) (Math.random()*10) +1;
		double perimetre = rayon * 2 * PI;
		System.out.println(" Le périmetre d'un cerlce de rayon " + rayon + " vaut " + rayon + " x 2 x le nombre PI" );
		System.out.println(" donc le ici le périmetre est égal à : " + perimetre);
	}
	
}
