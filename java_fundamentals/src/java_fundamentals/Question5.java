package java_fundamentals;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number % 2 == 0) {
			System.out.println("Even");
		}else if(number % 2!= 0) {
			System.out.println("Odd");
		}

	}

}
