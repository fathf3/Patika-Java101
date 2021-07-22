import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		double ARMUT = 2.14;
		double ELMA = 3.67;
		double DOMATES = 1.11;
		double MUZ = 0.95;
		double PATLICAN =5;

		Scanner inp = new Scanner(System.in);
		
		double fiyat=0;
		
		System.out.print("Armut : ");
		double alinanArmut = inp.nextDouble(); 
		System.out.print("Elma : ");
		double alinanElma = inp.nextDouble(); 
		System.out.print("Domates : ");
		double alinanDomates = inp.nextDouble(); 
		System.out.print("Muz : ");
		double alinanMuz = inp.nextDouble(); 
		System.out.print("Patlican : ");
		double alinanPatlican = inp.nextDouble(); 
		
		fiyat = (ARMUT*alinanArmut)+(ELMA*alinanElma)+(DOMATES*alinanDomates)+(MUZ*alinanMuz)+(PATLICAN*alinanPatlican);
	
		System.out.println("Ucret : "+fiyat+"TL");
	}

}
