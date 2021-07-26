import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Sayi : ");
		int sayi = inp.nextInt();
		int[] arr = {22,23,56,12,75,4,-18,4};
		int min = Arrays.stream(arr).min().orElse(sayi);
	    int max = Arrays.stream(arr).max().orElse(sayi);
	    
	    
		for(int i =0; i<arr.length;i++) {
			if(sayi<arr[i]) {
				if( arr[i] < max ) {
					max = arr[i];
				}
			}
			
			if(sayi>arr[i]) {
				if( arr[i] > min ) {
					min = arr[i];
				}
			}
			
		}
		System.out.println("En yakýn buyuk : "+ max);
		System.out.println("En yakýn kucuk : "+ min);
		
		
	}	

}
