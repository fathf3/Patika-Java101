import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double KM_UCRET = 2.20;
		double TAKSIMETRE_ACILIS = 10;
		
		Scanner inp = new Scanner(System.in);
		
		int km = inp.nextInt();
		double ucret = km*KM_UCRET+TAKSIMETRE_ACILIS;
		
		if(ucret<20) {
			System.out.println("Ucret : 20TL");
		}
		else {
			System.out.println("Ucret : "+ucret+"TL");
		}
		
	}

}
