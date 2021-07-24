import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 	Scanner input = new Scanner(System.in);
	        System.out.println("N sayısını giriniz :");
	        double n = input.nextInt();
	        double result = 0;
	        for(double i=n; i>0; i--) {
	            result += (1 / i);
	            
	        }

	        System.out.println(result);

	}

}
