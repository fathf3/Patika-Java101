import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		
		System.out.println(" Sayi miktari : ");

	    int adet = inp.nextInt();
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;

	    for( int i = 0 ; i < adet ; i++ ){
	        System.out.print((i+1)+". Say�y� giriniz : ");
	        
	        int sonrakiSayi = inp.nextInt();
	        max = Math.max(sonrakiSayi,max);
	        min = Math.min(sonrakiSayi,min);

	    }

	    System.out.println("En b�y�k say� : " + max );
	    System.out.println("En k���k say� : " + min );
		
	}

}
