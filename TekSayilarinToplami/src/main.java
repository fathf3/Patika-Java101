import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Sayi : ");
		int sayi = inp.nextInt();
		int toplam=0;
		
		while(sayi%2==0) {
			
			if(sayi%4==0) {toplam += sayi; System.out.println("Sayi toplami : "+ toplam);}
			
			System.out.print("Sayi : ");
			sayi = inp.nextInt();
		}
		
		
	}

}
