import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Sayi : ");
		int sayi1 = inp.nextInt();
		
		int sonuc = asalSayi(sayi1, sayi1/2);
		if (sonuc == 0)
			System.out.println(" asal sayi degildir : " + sayi1);
	    else
	    	System.out.println("asal sayidir : " + sayi1);
	    
	}
	public static int asalSayi(int sayi1, int sayi2) {
		
		if (sayi1 < 2)
	        return 0;
	    if (sayi2 == 1)
	        return 1;
	    if (sayi1 % sayi2 == 0)
	        return 0;
		
	    return asalSayi(sayi1, sayi2 - 1);
	}
}
