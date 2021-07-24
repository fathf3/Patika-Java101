import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Sayi Giriniz : ");
		int sayi = inp.nextInt();
		
		for( int i = 1 ; i < sayi ; i++){
            if (Math.pow(4,i) > sayi)
                break;
            else{
            	System.out.println("4 ün katlarý "+Math.pow(4,i));
            	}
        }
        for( int i = 1 ; i < sayi ; i++){
            if (Math.pow(5,i) > sayi)
                break;
            else{
            	System.out.println("5 in katlarý "+Math.pow(5,i));
            }
        }
		
		
		
	}

}
