package exoFDesignere.javaDebutant;

import java.util.Scanner;

public class CoursEnPratique {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		
		System.out.println("Donnez votre prénom et votre nom");
		String prenom = entree.next();
		String nom = entree.next();
		System.out.println("Donnez votre âge");
		int age = entree.nextInt();
		entree.nextLine();
		System.out.println("Ecrire votre phrase");
		String phrase = entree.nextLine();
		System.out.println(prenom + " " + nom + ", " +
		age + " ans, dit : " + phrase);
	}

}
