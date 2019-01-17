package exoFDesignere.javaDebutant;

import java.math.*;

public class Exercice4 {

	static double PI = 3.14; 
	
	public void estMajeur () {
		
		int age = (int) (Math.random()*99) +2;
		String result;
		
		if (age > 18) {
			result = "vous êtes majeur.";
		}else {
			result = "vous n'êtes pas majeur.";		
		}
		
		System.out.print(" Si vous avez " + age + "ans, " + result );
	}
	
}
