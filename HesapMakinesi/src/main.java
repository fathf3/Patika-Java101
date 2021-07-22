import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("1.Sayi : ");
		double sayi1 = inp.nextDouble(); 
		
		System.out.print("2.Sayi : ");
		double sayi2 = inp.nextDouble(); 
		System.out.println();
		System.out.println("1-> Topla / 2-> Cikar / 3-> Bol / 4-> Carp ");
		System.out.print("Ýslem Seciniz : ");
		double toplam=0;
		int secim = inp.nextInt();
		switch(secim) {
			case 1:
				toplam = sayi1+sayi2; System.out.println(toplam); break;
			case 2:
				toplam = sayi1-sayi2; System.out.println(toplam); break;
			case 3:
				toplam = sayi1/sayi2; System.out.println(toplam); break;
			case 4:
				toplam = sayi1*sayi2; System.out.println(toplam); break;
			default:
				System.out.println("Boyle bir islem yok"); break;
			}	
	}

}
