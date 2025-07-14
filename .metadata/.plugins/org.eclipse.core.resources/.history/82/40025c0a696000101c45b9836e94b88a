package java_fundamentals;
import java.util.*;

public class ArraysQ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();

	        
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        
	        int[] result = new int[n];
	        int index = 0;

	        
	        for (int num : arr) {
	            if (num % 2 == 0) {
	                result[index++] = num;
	            }
	        }

	       
	        for (int num : arr) {
	            if (num % 2 != 0) {
	                result[index++] = num;
	            }
	        }

	       
	        System.out.println("Rearranged array (even before odd): " + Arrays.toString(result));

	}

}
