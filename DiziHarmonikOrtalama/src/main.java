import java.util.Arrays;
public class main {

	public static void main(String[] args) {
		
		
		int[] arr = {1,2,5,7,11,44,55};
		
		double result = 0;
        for(double i=arr.length; i>0; i--) {
            result += (1 / i);
            
        }
		
		System.out.println((arr.length)/result);
		
	}

}
