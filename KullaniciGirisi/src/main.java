import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("User Name : ");
		String userName= inp.nextLine(); 
		
		System.out.print("Password : ");
		String password= inp.nextLine(); 
		
		String user = "fatih";
		String pass = "123";
		
		if(userName != user && password != pass) {
			System.out.println("Sifre Hatali - Sifreni Sifirlamak �stermisin");
			System.out.println("Evet -> 1 / Hayir -> 2");
			int secim= inp.nextInt(); 
			
				if(secim == 1) {
					System.out.print("Password : ");
					String password2= inp.nextLine(); 
					if(password2 == pass) {
						System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
					}
					else {
						System.out.println("�ifre olu�turuldu");
					}
				}
			
			}
		
		else {
			System.out.println("Hosgeldin "+ userName);
		}
		

	}

}
