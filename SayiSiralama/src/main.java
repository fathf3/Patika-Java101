import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("1.Sayi : ");
		int sayi1 = inp.nextInt();
		
		System.out.print("2.Sayi : ");
		int sayi2 = inp.nextInt();
		
		System.out.print("3.Sayi : ");
		int sayi3 = inp.nextInt();
		
		int bosSayi = 0;
		
		if((sayi1>sayi2) && (sayi1>sayi3)) {
			
			if(sayi2>sayi3) {
				System.out.println(sayi1+" > "+ sayi2 +" > " + sayi3);
			}
			else {
				System.out.println(sayi1+" > "+ sayi3 +" > " + sayi2);
			}
		}
		else if((sayi2>sayi1) && (sayi2>sayi3)) {
			if(sayi1>sayi3) {
				System.out.println(sayi2+" > "+ sayi1 +" > " + sayi3);
			}
			else {
				System.out.println(sayi2+" > "+ sayi3 +" > " + sayi1);
			}
		}
		else {
			if(sayi1>sayi2) {
				System.out.println(sayi3+" > "+ sayi1 +" > " + sayi2);
			}
			else {
				System.out.println(sayi3+" > "+ sayi2 +" > " + sayi1);
			}
		}
		
		

	}
}