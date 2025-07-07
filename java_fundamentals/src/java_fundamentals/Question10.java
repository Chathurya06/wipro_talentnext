package java_fundamentals;
import java.util.Scanner;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch == Character.toLowerCase(ch)) {
			System.out.println(Character.toUpperCase(ch));
		}else {
			System.out.println(Character.toLowerCase(ch));
		}

	}

}
