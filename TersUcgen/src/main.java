import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int sayi1 = inp.nextInt();
		
		for(int i=sayi1; i>0; i--) {
			for(int j=0; j<sayi1-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2-1; k++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		

	}

}
