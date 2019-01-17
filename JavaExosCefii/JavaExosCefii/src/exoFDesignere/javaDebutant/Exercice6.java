package exoFDesignere.javaDebutant;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/*
 * Créez une variable tableau en lui affectant plusieurs nombres entiers correspondant aux effectifs de classes.
 * Affichez le contenu du tableau ligne à ligne au moyen d'une boucle.
 * Affichez la somme des éléments et la moyenne. 
 */

public class Exercice6 {

	private static int[] EFF_CLASSES = {15,22, 18, 16};
	
	public void effectifsClasse () {
		
		int iSomme=0;
		int i;
		double fMoyenne, fMoyArr;
		DecimalFormat df = new DecimalFormat("#.#");
		String fMoyDf;
				
		for(i=0;i<EFF_CLASSES.length;i++) {
			System.out.println(" - L'effectif de la classe " + (i+1) + " est : "+ EFF_CLASSES[i]);
			iSomme += EFF_CLASSES[i];
		}
		
		if (i>0) {
			fMoyenne = (double)iSomme/i;
			fMoyArr = (Math.round(fMoyenne*10))/(double) 10 ;
			fMoyDf = df.format(fMoyenne);
			
			System.out.println(" Le total des effectifs est de " + iSomme );
			System.out.println(" La moyenne par classe est de " + df.format(fMoyenne) +" (arrondie 1 décimale) ");
			
		}
	}
	
}
