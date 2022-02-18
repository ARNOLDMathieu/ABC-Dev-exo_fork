package conversionKmMiles;

import java.util.Scanner;

public class conversionKmMi213 {

	// L�utilisateur peut saisir plusieurs valeurs � convertir.
	//Il saisit une valeur � convertir avec son unit� de mesure (km ou mi).
	//Si aucune unit� de mesure n�est indiqu�e, le programme consid�re la valeur en kilom�tres.
	//A l�appui de la touche � Entr�e �, la valeur saisie est enregistr�e dans un tableau en m�moire.
	//L�utilisateur peut enregistrer autant de valeurs qu�il souhaite.
	//Si l�utilisateur saisit la commande � go �, le programme convertit toutes les valeurs 
	//m�moris�es et affiche le r�sultat de chaque conversion.
	//La commande � quit � permet de quitter le programme. Tant que cette commande n�est pas saisie, 
	//l�utilisateur peut continuer � faire des conversions.
	/**
	 * 1-r�cuperer les valeurs
	 * 2- stocker chaque valeur + unit� dans un tableau tableauDeConversion
	 * 3- so l'utilisateur saisit GO --> affichage des conversions
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);

		System.out.println("");
		/** var String saisie en cours */
		String valeurAConvertir;
		String[] tableauDeConversion=null;
		Boolean go = false;
		int index=0;


		do {
			System.out.println("Saisir une valeur � convertir.");
			valeurAConvertir = sc.nextLine();
			if(valeurAConvertir.equals("go")) {
				go=true;
			}
			else {
				tableauDeConversion [ index ]=valeurAConvertir;
				index++;
			}
		}while(go==false);

		/* 1- Parcourir tableauDeConversion
		 * 2- Pour chaque valeur du tableau, effectuer la conversion
		 * 
		 */

		for (int i = 0; i < index; i++) {

		}

		System.out.println("Programme termin�.");

		sc.close();
	}


	// fin du main
	public static void convertirUneValeur( String valeur)
	{
		String [ ] valeurEtUnite = valeur.split(" ");
		String unite;
		double conversion;
		String uniteResultat;
		if (valeurEtUnite.length >1) {
			unite = valeurEtUnite[1];
		}
		else {
			unite= "km";
		}
		conversion = Double.parseDouble(valeurEtUnite[0]);
		if (unite.equals("km")){
			conversion = (conversion /1.609);
			uniteResultat = "mi";
		}
		else {
			conversion = (conversion *1.609);
			uniteResultat = "km";
		}
		System.out.println(valeur+ " = " + conversion +" "+uniteResultat);
	}
}