import java.util.Scanner;

public class bopasbobovary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chainecharacter beauTemps
		//chainecharacter lectureBovary
		//chainecharacter etatVelo
		//chainecharacter reparationVelo
		//chainecharacter dispoBovary
		
		String beauTemps;
		String lectureBovary;
		String etatVelo;
		String reparationVelo;
		String dispoBovary;
		
		//�crire  "J�irai faire du v�lo, s�il fait beau demain"
		//�crire  "Est-ce qu�il fait beau ? OUI/NON"
		//lire  beauTemps
		
		System.out.println("J�irai faire du v�lo, s�il fait beau demain.");
		System.out.println("Est-ce qu�il fait beau ? oui/non");
		Scanner sc = new Scanner (System.in);
		beauTemps = sc.next();
		
		//si (beauTemps == ��oui��)
		//alors
	 	//�crire  ��J�irai chez le garagiste, si le v�lo n�est pas en �tat��
		//�crire  ��Est-ce que le v�lo est-il cass� ? OUI/NON ��
		//lire  etatVelo
		//si (etatVelo == ��non��)
		//alors
		//�crire  "J�irai chez le garagiste"
		//�crire  "Est-ce que la r�paration est-elle rapide ? oui/non "
		//lire  reparationVelo
		//si (reparationVelo == "non")
		//alors
		//�crire  "J�irai ceuillir des joncs"
				//Finsi
		//Sinon
		//�crire  "J�irai faire du v�lo"

		
		if (beauTemps.equals("oui")) {
			System.out.println("J�irai chez le garagiste, si le v�lo n�est pas en �tat.");
			System.out.println("Est-ce que le v�lo est-il cass� ? oui/non");
			etatVelo = sc.next();
			if (etatVelo.equals("non")) {
				System.out.println("J�irai chez le garagiste.");
				System.out.println("Est-ce que la r�paration est-elle rapide ? oui/non ");
				reparationVelo = sc.next();
				if (reparationVelo.equals("non")) {
					System.out.println("J�irai ceuillir des joncs.");
				}
				else { 
					System.out.println("J�irai faire du v�lo.");
				}
			}
			else {
				System.out.println("J�irai faire du v�lo.");
			}
			
		//Sinon
		//�crire  ��Je ferai une lecture de Madame Bovary��
		//�crire  ��Est-ce qu�il est dispo dans le salon? OUI/NON ��
		//lire  lectureBovary
		//si (lectureBovary == ��NON��)
		//alors
		//�crire  ��J�irai � la biblioteque��
		//�crire  ��Est-ce qu�il est dispo ? OUI/NON ��
		//lire  dispoBovary
		//si (dispoBovary == ��NON��)
		//alors
		//�crire  ��Je prends un roman policier��
		//Finsi
		//Finsi
		//�crire  ��Je m�installe confortablement et je lis��
		//Finsi
		}
	else {
		System.out.println("Je ferai une lecture de Madame Bovary ? ");
		System.out.println("Est-ce qu�il est dispo dans le salon? oui/non");
		lectureBovary = sc.next();
			if (lectureBovary.equals("non")) {
				System.out.println("J�irai � la biblioth�que.");
				System.out.println("Est-ce qu�il est dispo ? oui/non");
				dispoBovary = sc.next();
				if (dispoBovary.equals("non")) {
					System.out.println("Je prends un roman policier.");
					}
				}
			System.out.println("Je m�installe confortablement et je lis.");
		}
	}
}