import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Sayi Giriniz : ");
		int sayi = inp.nextInt();
		int toplamSayi=0;
		double ortalama =0;
		for(int i=0; i<sayi; i++) {
		
			if(i%4 ==0 && i%3 == 0) {
			toplamSayi +=1;
			ortalama +=i;
			}
			else {}
		}
		ortalama = ortalama/toplamSayi;
		System.out.print(ortalama);
	}

}
