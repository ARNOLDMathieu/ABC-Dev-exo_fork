import java.util.Scanner;

public class RechercheDivNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Lire un nombre entier et d�terminer tous ses diviseurs autres que 1 et lui-m�me.

		int n; //entier nombre
		int d; //diviseur
		boolean toutSauf1EtLuiMeme = false;

		Scanner scanner; //d�claration scanner 
		scanner = new Scanner(System.in);

		System.out.println("Entrer un nombre.");
		n = scanner.nextInt();

		for (d=2; d<=(n-1);d++) {
			if(n%d==0) {
				System.out.println(d+" "+"est diviseur de "+n);
				toutSauf1EtLuiMeme = true;
			}
			scanner.close();
		}
		if (!toutSauf1EtLuiMeme) {
			System.out.println("Pas de diviseurs.");
		}
	}
}
