import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		double AZ_KDV = 1.18;
		double COK_KDV = 1.08;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Fiyat : ");
		double fiyat = inp.nextDouble();
		double kdvFiyat=0;
		
		
		
		if(fiyat >0 && fiyat <1000) {
			 kdvFiyat = fiyat*AZ_KDV;
			 System.out.println("Kdv li Fiyat : " + kdvFiyat);
			 kdvFiyat = kdvFiyat-fiyat;
			 System.out.println("Kdv Ucreti : " + kdvFiyat);
		}
		else {
			kdvFiyat = fiyat*COK_KDV;
			 System.out.println("Kdv li Fiyat : " + kdvFiyat);
			 kdvFiyat = kdvFiyat-fiyat;
			 System.out.println("Kdv Ucreti : " + kdvFiyat);
			
		}
	}

}
