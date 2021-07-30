import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner( System.in );

        System.out.println("Satýr sayýsýnýz giriniz ");
        int row = scan.nextInt();
        System.out.println("Sütun sayýsýný giriniz ");
        int column = scan.nextInt();

        MineSweeper mine = new MineSweeper(row,column);
        mine.run();
       

	}

}
