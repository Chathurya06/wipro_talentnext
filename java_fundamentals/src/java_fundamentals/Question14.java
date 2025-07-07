package java_fundamentals;
import java.util.Scanner;
public class Question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start-1;i<end;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}


	}

}
