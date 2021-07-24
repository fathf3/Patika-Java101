import java.util.Scanner;
public class main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("KM : ");
		double km = inp.nextDouble();
		
		
		
		System.out.print("Yas : ");
		int yas = inp.nextInt();
		
		if(km<0) {System.out.println("Hatali Veri Girdiniz");}
		
		double anaUcret = km*0.10;
		double ucret = km*0.10;
		
		if(yas<12) {
			ucret = ucret*0.5;
		}
		else if(yas>=12 && yas <= 24) {
			ucret = ucret-(ucret*0.1);
		}
		else if(yas>65) {
			ucret = ucret-(ucret*0.3);
		}
		else {}
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiþ Dönüþ ):");
		int yon = inp.nextInt();
		
		if(yon<0 && yon>2) {System.out.println("Hatali Veri Girdiniz");}
		
		switch(yon) {
		case 1:
			System.out.println(ucret); break;
			
		case 2:
			ucret = (ucret-(ucret*0.2))*2; System.out.println(ucret); break;
		}
	}

}
