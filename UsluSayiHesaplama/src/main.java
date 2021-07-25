import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("Sayi : ");
		int sayi1 = inp.nextInt();
		System.out.print("Us : ");
		int sayi2 = inp.nextInt();
		
		System.out.println(usal(sayi1,sayi2));
	}
	public static int  usal(int sayi1, int sayi2) {
		if(sayi2 == 0) {
			return 1;
		}
		
		return sayi1*usal(sayi1,sayi2-1);
	}
}
