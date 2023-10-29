// swapping the two numbers user accepted
package coree;

import java.util.Scanner;

public class UserInput {
	public static  void main(String agrs[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First no:");
		int a=sc.nextInt();
		
		System.out.println("Enter the second no:");
		int b=sc.nextInt();
		
		System.out.println("before swapping a:" +a +" b : "+b );
		int t=a;
		a=b;
		b=t;
		
		System.out.println("After swapping a:" +a +"b:" +b);
		
	}

}
