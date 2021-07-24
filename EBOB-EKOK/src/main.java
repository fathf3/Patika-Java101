import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		int sayi1 = inp.nextInt();
		int sayi2 = inp.nextInt();
		int i =1;
		int obeb=0;
		
		
		while(i<sayi2) {
			if(sayi1%i==0 && sayi2%i==0) {
				obeb = i;
				
			}
			i++;
		}
		int okek =(sayi1*sayi2)/obeb;
		
		System.out.println("Obeb : "+obeb +"\n Okek : "+okek);
		
		

	}

}
