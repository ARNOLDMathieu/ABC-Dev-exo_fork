package ex271jeunes20;

import java.util.Scanner;

public class jeunes20ex271 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Exercice 2.7.1 : Calculer le nombre de jeunes
		//Il s'agit de d�nombrer toutes les personnes d'�ge inf�rieur strictement � 20 ans 
		//parmi un �chantillon de 20 personnes. L�utilisateur est invit� � saisir les 20 valeurs.
		//D�crivez l'algorithme qui affiche le nombre de jeunes et codez la solution.

		Scanner sc = new Scanner(System.in);
		int [] age = new int[5];
		int nbAge=0;
		int ageCount=0;
		System.out.println("Enter 20 numbers, please.");

		for (int i=0; i<age.length; i++) {
			nbAge=sc.nextInt();
			if (nbAge<20) {
				ageCount++;
			}
		}
		System.out.println("Found " + ageCount + " people under 20.");
		sc.close();
	}

}
