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
		 * รรงgenin รงevresi = 2u
		 * u = (a+b+c) / 2
		 * Alan * Alan = ๐ข * (๐ข โ ๐)* (๐ข โ ๐) * (๐ข โ ๐)
		 * 
		 * */
		
		double u = (a+b+c)/2;
		double cevre = 2*u;
		
		alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

		System.out.println("alan : " + alan);
				
		
	}

}
