import java.util.Scanner;

public class Ex2airevolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Traduction du pseudo code en code java
		
		//DECLARATION DES VARIABLES
		//R�el rayon r
		float rayonr;
		//R�el rayon aire
		double aire;
		//R�el volume
		double volume;

		//SAISIES
		//ECRIRE "Input the radius of a sphere"
		
		System.out.println("Input radius of the sphere");
		//LIRE rayon r
		Scanner sc = new Scanner(System.in);
		rayonr = sc.nextFloat();		
		System.out.println("You input rayonr="+rayonr);

		//TRAITEMENT
		//aire <--(4pR�)

		aire=(4*Math.PI*Math.pow(rayonr,2));
		//volume <--(4/3pR�)
		volume=4D/3*Math.PI*Math.pow(rayonr,3)/3;

		//AFFICHAGE
		//ecrire "The sphere's area is:", aire
		//ecrire "And the volume is:", volume 
		System.out.println("The shere's area is:" +aire);
		System.out.println("The volume is:" +volume);
	}

}
