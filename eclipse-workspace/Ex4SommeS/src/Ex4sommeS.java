import java.util.Scanner;

public class Ex4sommeS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DECLARATION DES VARIABLES
		//r�el SommeInit
		//r�el Interet
		//entier NombreAnnees
		//r�el InteretSimple
		//r�el InteretCompose
		
		float sommeInit;
		float interet;
		float nombreAnnees;
		float interetSimple;
		float interetCompose;
		
		//INPUT
		//�crire "Saisir la somme initiale S plac�e sur un compte"
		//�crire "Saisir l'int�r�t i offert par la banque"
		//�crire "Saisir le nombre n d'ann�es de placement de la somme S"
		
		System.out.println("Saisir la somme initiale S plac�e sur un compte");
		Scanner sc = new Scanner(System.in);
		sommeInit = sc.nextFloat();
		
		System.out.println("Saisir l'int�r�t i offert par la banque");
		interet = sc.nextFloat();
		
		System.out.println("Saisir le nombre n d'ann�es de placement de la somme S");
		nombreAnnees = sc.nextFloat();
		
		
		//PROCCESSING
		//InteretSimple <--S ( 1 + n * i )
		//InteretCompos� <--S ( 1 + i )n

		interetSimple = (float)(1 + nombreAnnees*interet);
		interetCompose = (float) ((float) sommeInit*(Math.pow((1 + interet),nombreAnnees)));
		
		
		//OUTPUT
		//�crire "Calculer la valeur somme S pendant n ann�es avec interetSimple et interetCompos�"
		System.out.println("La valeur somme"+sommeInit+"pendant"+nombreAnnees+" avec interetSimple"+interetSimple);
		System.out.println("La valeur somme S pendant n ann�es avec interetCompose"+interetCompose);
	}
}
