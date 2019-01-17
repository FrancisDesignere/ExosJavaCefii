package exoFDesignere.javaDebutant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


/*
 * Créez un tableau avec ArrayList.
 * Ajoutez 5 noms
 * Affichez le contenu du tableau ligne à ligne au moyen d'une boucle.
 * Ajoutez un nom entre le 1er et le 2ème élément et un autre entre le 3ème et le 4ème
 * Affichez à nouveau le contenu du tableau. 
 */

public class Exercice7 {

	public void prenomsList () {

		ArrayList<String> lstPrenoms = new ArrayList<String>();
		lstPrenoms.add("Francis");
		lstPrenoms.add("Carole");
		lstPrenoms.add("Manon");
		lstPrenoms.add("Juliette");
		lstPrenoms.add("Maxime");
		
		// liste parcourue via ses index
		for (int i=0; i < lstPrenoms.size(); i++) {
			System.out.println(" position" + (i+1) + " : " +lstPrenoms.get(i));
		}
		
		// insertion de 2 nouveaux prénoms aux emplacement demandée
		lstPrenoms.add(3, "+tata");
		lstPrenoms.add(1, "+toto");

		System.out.println(" --- après ajouts ---");

		
		// liste parcourue par itérateur de liste
		ListIterator<String> lli = lstPrenoms.listIterator();
		while(lli.hasNext()) {
			System.out.println(" postition" + (lli.nextIndex()+1) + " : " +lli.next());
		}
	}

}
