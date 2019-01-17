package exoFDesignere.javaDebutant;

import java.util.Scanner;

public class JeuNombreMystere {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String prenom = "";
		boolean bSaisieOk = false, bAbandon = false, bTrouve = false;
		int iNbSaisie = 0, iNbTentative=0 ;
		String sSaisie;
		

		System.out.println("== Jeu du nombre mystère == ");
		System.out.println(" pour jouer, merci de renseigner votre prénom");
		prenom = scan.next();
		System.out.println(" Bonjour " + prenom);
		System.out.println(" ------------------------");

		int iNbAtrouver = (int) (Math.random()*100);		
		System.out.println("(nbre à trouver = " + iNbAtrouver + ")"); // TODO à commenter
		
		do {
			do {
				System.out.print(" Saisir le nombre à deviner entre 0 et 100 (ou 'Stop' pour abandoner) : ");
				sSaisie = scan.next();
				if (sSaisie.matches("-?\\d+")){
					iNbSaisie = Integer.parseInt(sSaisie);
					if (iNbSaisie>=0 && iNbSaisie <= 100) {
						bSaisieOk = true;
						iNbTentative++;
					}				
				}else if(sSaisie.equals("Stop")){
					bAbandon = true;
					System.out.println(" Vous abandonnez après "+ iNbTentative + " tentatives");
					System.out.println(" Le nombre à trouver était "+ iNbAtrouver);
				}
			}while(!bSaisieOk && !bAbandon);
			
			if(!bAbandon) {
				if (iNbSaisie == iNbAtrouver) {
					System.out.println(" Bravo, vous avez trouvé au bout de : "+ iNbTentative +" tentatives");
					bTrouve = true;
				}else if(iNbSaisie > iNbAtrouver) {
					System.out.println(" le nombre à trouver est plus petit");
				}else if(iNbSaisie < iNbAtrouver) {
					System.out.println(" le nombre à trouver est plus grand");				
				}
			}
		
		}while(!bAbandon && !bTrouve);
		
		scan.close();
		System.out.println("Au revoir");
	}
}