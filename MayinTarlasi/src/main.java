import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner( System.in );

        System.out.println("Sat�r say�s�n�z giriniz ");
        int row = scan.nextInt();
        System.out.println("S�tun say�s�n� giriniz ");
        int column = scan.nextInt();

        MineSweeper mine = new MineSweeper(row,column);
        mine.run();
       

	}

}
