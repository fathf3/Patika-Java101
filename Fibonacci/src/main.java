import java.util.Scanner;
public class main {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int sayi = inp.nextInt();
		int temp;
		int temp0= 0;
		int temp1 = 1;
		for(int i=0; i<sayi; i++) {
			temp = temp0+temp1;
			temp0=temp1;
			temp1=temp;
			
			System.out.println(temp);
			
		}
		
	}

}
