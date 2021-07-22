import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		double ortalama = 0;
		System.out.print("Matematik Not : ");
		int matematik = gecerliNot(inp.nextInt());
		System.out.print("Fizik Not : ");
		int fizik = gecerliNot(inp.nextInt());
		System.out.print("Kimya Not : ");
		int kimya = gecerliNot(inp.nextInt());
		System.out.print("Muzik Not : ");
		int muzik = gecerliNot(inp.nextInt());
		
		ortalama = (matematik+fizik+kimya+muzik)/4;
		
		if(ortalama>55) {
		System.out.println("Sinifi gectiniz : "+ortalama);
		}
		else{
			System.out.println("Kaldiniz : "+ortalama);
		}
		

	}
	public static int gecerliNot(int dersNot)
	{
        if( dersNot < 0 || dersNot > 100) 
        {
            return 0;
        }

        return dersNot;
    }
}

