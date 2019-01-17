package exoFDesignere.javaDebutant;

import java.math.*;

public class Exercice5 {

	
	public void tblMultipl () {
		
		int nombre = (int) (Math.random()*10+1);		
		
		for(int i=0;i<10;i++) {
			System.out.println(nombre + "x" + i + "="+ i*nombre);
		}		
	}
		
}
