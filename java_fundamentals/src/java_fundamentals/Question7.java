
package java_fundamentals;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s1 =sc.next();
		String s2 = sc.next();
		if( s1.compareTo(s2) > 0) {
			System.out.println(s2 + "," +s1);
		}else {
			System.out.println(s1 +","+ s2);
		}
	}

}
