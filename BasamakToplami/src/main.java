import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Sayi Giriniz : ");
		int sayi1 = inp.nextInt();
		int sayi2 = 0;
		int sayi3 = 0;
		while(sayi1 != 0) {
			sayi3 = sayi1%10;
			sayi1 /= 10;
			
			sayi2 += sayi3;
			
			
		}
		
		
		System.out.println("Basamak Sayilari Toplami : "+sayi2);
		

	}

}
