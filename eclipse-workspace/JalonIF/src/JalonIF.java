import java.util.Scanner;

public class JalonIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String etudiant;
		String mercredi;
		Scanner scanner;

		scanner = new Scanner(System.in);

		System.out.println("Est-ce que s'est un �tudiant? oui/non");
		etudiant = scanner.next();

		if (etudiant.equals("oui")) {
			System.out.println("On est Mercredi? oui/non");
			mercredi = scanner.next();
			if (mercredi.equals("oui")) {

				System.out.println("Vous avez une r�duction de 50%.");
			}
			else {
				System.out.println("Vous avez une r�duction de 20%.");
			}
		}
		else {
			System.out.println("Vous avez aucune r�duction.");
		}
	}
}


