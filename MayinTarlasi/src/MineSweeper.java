import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	char alan[][];
    char bombAlani[][];
    int guvenliAlan;
    boolean oyunBitti;
    public MineSweeper(int row,int column) {
        Random ran = new Random();
        oyunBitti= false;
        alan = new char[row][column];
       bombAlani = new char[row][column];
       int bombSize = row * column / 4;
       guvenliAlan = row *column - bombSize;
        for (char [] rowArr : alan)
            Arrays.fill(rowArr,'-');

        while( bombSize > 0){
            int a = ran.nextInt(row);
            int b = ran.nextInt(column);
            if( bombAlani[a][b] != '*') {
            	bombAlani[a][b] = '*';
                bombSize--;
            }

        }


    }

    public void run(){
        System.out.println("Mayýn Tarlasý Oyuna Hoþgeldiniz !");
        while (!oyunBitti){
            writeArr();
            getInput();
        }
        if(guvenliAlan == 0){
            System.out.println("Oyunu kazandýn!");
        }else{
            System.out.println("Game Over!!");
        }
    }

    public void writeArr(){
        for( int i = 0; i < alan.length; i++ ){
            for( int k = 0; k < alan[i].length ; k++ ){
                System.out.print(alan[i][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }
    public void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Satýr Giriniz ");
        int row = scan.nextInt();
        System.out.print("Sütun Giriniz ");
        int column = scan.nextInt();
        openSelection(row,column);
    }
    public void openSelection(int row ,int column) {

        int cnt = 0;
        if(bombAlani[row][column] == '*' ) {
        	oyunBitti = true;
            return;
        }
        for (int i = -1; i < 2; i++) {
            for (int k = -1; k < 2; k++) {
                try {
                    if (bombAlani[row + i][column + k] == '*')
                        cnt++;
                } catch (Exception e) {

                }
            }
        }

        alan[row][column] = (char)(cnt+'0');
        guvenliAlan--;
        if( guvenliAlan == 0 )
        	oyunBitti = true;
    }
}