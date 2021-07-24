import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// C(n,r) = n! / (r! * (n-r)!) -> Kombinasyon formulu
		
		Scanner inp = new Scanner(System.in);
		
		int sayi1 = inp.nextInt();
		int sayi2 = inp.nextInt();
		int fark = sayi1-sayi2;
		int sayi3=1;
		int sayi4=1;
		int sayi5 = 1;
		for(int i=1; i<=sayi1; i++) {
			sayi3 *= i;
			
		}
		for(int i=1; i<=sayi2; i++) {
			sayi4 *= i;
		}
		for(int i=1; i<=fark; i++) {
			sayi5 *= i;
		}
		
		int sonuc = sayi3/(sayi4*sayi5);
		System.out.println(sonuc);
		
	}

}
