import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		/*
		 * Vucut kitle Indeksi
		 * Formul -> Kilo(kg)/Boy(m)*Boy(m)
		 * */
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Boy : ");
		double boy = inp.nextDouble(); 
		System.out.print("Kilo : ");
		double kilo = inp.nextDouble();
		
		double vki = kilo/(boy*boy);
		System.out.println("VKI : "+ vki);
	}

}
