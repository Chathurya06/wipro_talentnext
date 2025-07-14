package java_fundamentals;
import java.util.*;


public class ArraysQ7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println(n);
		for(int i =0;i <n;i++) {
			arr[i] = sc.nextInt();
			
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[i]>arr[j+1] ){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		int[] unique = new int[n];
		int j=0;
		unique[j++] = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i] != arr[i-1]) {
				unique[j++] = arr[i];
			}
		}
		System.out.println();
		for(int i=0;i<j;i++) {
			System.out.println(unique[i] + " ");
		}
	}

}
