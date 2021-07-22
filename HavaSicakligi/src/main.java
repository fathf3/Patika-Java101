import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		  Scanner inp = new Scanner(System.in);

	        int sicaklik;
	        System.out.println("Hava sýcaklýðýný giriniz");
	        sicaklik = inp.nextInt();
	        if( sicaklik <= 5){
	            System.out.println("Kayak");
	        }
	        else if( sicaklik <= 25) {
	            if( sicaklik <= 15 )
	            System.out.println("Sinema");
	            if( sicaklik >= 10)
	            System.out.println("Piknik");
	        }
	        else {
	            System.out.println("Yüzme");
	        }

	}

}
