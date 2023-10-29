package coree;

import java.util.Scanner;

public class Swapping {
	
	public static void main() {
		Scanner sc=new Scanner(System.in);
		sc.nextInt();
		
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		
		System.out.println("Before swapping a"+a +"b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping a"+a +"b:" +b);
		// this code is efficient
		// best case of algorithm
		
		
	}

}
