package java_fundamentals;

import java.util.Scanner;

public class Question4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int rem1 = a%10;
		int rem2 = b%10;
		if(rem1 == rem2){
			System.out.println("True");
			
			
			
		}else {
			System.out.println("False");
		}

	}

}
