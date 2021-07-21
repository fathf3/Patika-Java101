import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner inp = new Scanner(System.in);
		
		int matematik = inp.nextInt();
		int fizik = inp.nextInt();
		int kimya = inp.nextInt();
		int turkce = inp.nextInt();
		int tarih = inp.nextInt();
		int muzik = inp.nextInt();
		
		double ortalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6;
		System.out.println( "ortalama: "+ ortalama);
		System.out.println( ortalama > 60 ? "Sýnýfý Geçti" : "Sýnýfta Kaldý");
		
	}

}


