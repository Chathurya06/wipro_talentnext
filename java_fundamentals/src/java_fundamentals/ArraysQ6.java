package java_fundamentals;
import java.util.*;

public class ArraysQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter number");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println(n);
for(int i=0;i<n;i++) {
	arr[i] = sc.nextInt();
	
}
Arrays.sort(arr);
System.out.println("sorted array:");
for(int num : arr) {
	System.out.println(num + " ");
}
	}

}
