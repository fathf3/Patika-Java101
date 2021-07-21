import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		double alan = 0;
		int a = inp.nextInt();
		int b = inp.nextInt();
		int c = inp.nextInt();
		/*
		 * Formul
		 * Üçgenin çevresi = 2u
		 * u = (a+b+c) / 2
		 * Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
		 * 
		 * */
		
		double u = (a+b+c)/2;
		double cevre = 2*u;
		
		alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

		System.out.println("alan : " + alan);
				
		
	}

}
