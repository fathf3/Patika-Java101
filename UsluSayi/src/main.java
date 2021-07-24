import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Sayi : ");
		int sayi = inp.nextInt();
		
		System.out.print("Ust : ");
		int sayi2 = inp.nextInt();
		
		int toplam = 1;
		
		for(int i=0; i<sayi2; i++) {
			toplam *=sayi;
		}
		System.out.println(toplam);
	}

}
