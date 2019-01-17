package exoFDesignere.javaDebutant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


/*
 * Cr�ez un tableau avec ArrayList.
 * Ajoutez 5 noms
 * Affichez le contenu du tableau ligne � ligne au moyen d'une boucle.
 * Ajoutez un nom entre le 1er et le 2�me �l�ment et un autre entre le 3�me et le 4�me
 * Affichez � nouveau le contenu du tableau. 
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
		
		// insertion de 2 nouveaux pr�noms aux emplacement demand�e
		lstPrenoms.add(3, "+tata");
		lstPrenoms.add(1, "+toto");

		System.out.println(" --- apr�s ajouts ---");

		
		// liste parcourue par it�rateur de liste
		ListIterator<String> lli = lstPrenoms.listIterator();
		while(lli.hasNext()) {
			System.out.println(" postition" + (lli.nextIndex()+1) + " : " +lli.next());
		}
	}

}
