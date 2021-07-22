import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		double PI = 3.14;
		
		/*
		 * Daire Cevre ve Alan Hesaplama
		 * Cevre = pi*r*r
		 * Alan = 2*pi*r 
		 * Açý ile Alan = (pi*(r*r)*açý)/360
		 * 
		 * */
		
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Yari Cap : ");
		int r = inp.nextInt();
		System.out.print("Aci : ");
		int aci = inp.nextInt();
		
		double alan = (PI*(r*r)*aci)/360;
		
		System.out.println(r+" yari capli dairenin alani : "+alan);
		
	}

}
