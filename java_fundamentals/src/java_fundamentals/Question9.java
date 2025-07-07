package java_fundamentals;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name= sc.next();
		int age = sc.nextInt();
		if(name.equalsIgnoreCase("female") ) {
			if(age >=1 && age <=58 ){
				System.out.println("interst rate is 8.2% ");
			}
			else {
				System.out.println("intrest rate is 9.2%");
			}
		}else {
			if(age >=1 && age <=58) {
				System.out.println("intrest rate is 8.4%");
				
			}else {
				System.out.println("intrest rate is 10.5%");
			}
				
			
			
		}
		

	}

}
