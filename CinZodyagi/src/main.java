import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("Dogum Yiliniz : ");
		int dogumYil = inp.nextInt();
		
		if(dogumYil%12 == 0) {System.out.println("�in Zodya�� Burcunuz : Maymun"); }
		else if(dogumYil%12 == 1) {System.out.println("�in Zodya�� Burcunuz : Horoz"); }
		else if(dogumYil%12 == 2) {System.out.println("�in Zodya�� Burcunuz : K�pek"); }
		else if(dogumYil%12 == 3) {System.out.println("�in Zodya�� Burcunuz : Domuz"); }
		else if(dogumYil%12 == 4) {System.out.println("�in Zodya�� Burcunuz : Fare"); }
		else if(dogumYil%12 == 5) {System.out.println("�in Zodya�� Burcunuz : �k�z"); }
		else if(dogumYil%12 == 6) {System.out.println("�in Zodya�� Burcunuz : Kaplan"); }
		else if(dogumYil%12 == 7) {System.out.println("�in Zodya�� Burcunuz : Tav�an"); }
		else if(dogumYil%12 == 8) {System.out.println("�in Zodya�� Burcunuz : Ejderha"); }
		else if(dogumYil%12 == 9) {System.out.println("�in Zodya�� Burcunuz : Y�lan"); }
		else if(dogumYil%12 == 10) {System.out.println("�in Zodya�� Burcunuz : At"); }
		else {System.out.println("�in Zodya�� Burcunuz : Koyun"); }
	
	}

}
