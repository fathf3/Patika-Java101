import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Yil : ");
		int yil = inp.nextInt();
		
		 if (yil % 4 != 0) {
	            System.out.println(yil + "art�k bir y�l de�ildir");
	        } else if (yil % 400 == 0) {
	            System.out.println(yil + "art�k bir y�ld�r");
	        } else if (yil % 100 == 0) {
	            System.out.println(yil + "art�k bir y�l de�ildir!");
	        } else {
	            System.out.println(yil + "art�k bir y�ld�r");
	        }
	}

}
