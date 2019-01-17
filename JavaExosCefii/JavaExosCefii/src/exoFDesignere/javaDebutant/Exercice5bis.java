package exoFDesignere.javaDebutant;

public class Exercice5bis {

	
	public void tblMultiplBis () {
				
		for(int i=1;i<10;i++) {
			System.out.print(int2car(i)+" || ");
			for (int j=1; j<10;j++) {
				System.out.print(int2car(i*j) +" | ");
			}
			System.out.println("");
		}		
	}
	
	
	
	private String int2car (int inInt) {
		String strInt = String.valueOf(inInt);
		String tmp = (" "+ strInt).substring(strInt.length() - 1);
		return tmp;
	}
	
	
}
