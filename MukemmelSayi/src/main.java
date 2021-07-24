import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int sayi1 = inp.nextInt();
		int sayi2 = 0;
		for(int i=1; i<sayi1; i++) {
			if(sayi1%i == 0) {
				sayi2 +=i;
			}
			
		}
		if(sayi1 == sayi2) {
			System.out.println(sayi1+" mükemmel sayidir");
		}
		else {System.out.println(sayi1+" mükemmel sayi degildir");}
	}

}
