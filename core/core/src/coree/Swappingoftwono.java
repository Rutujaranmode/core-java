// accept thr two integer number from user and interchange their values.
package coree;

import java.util.Scanner;

public class Swappingoftwono {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		
		System.out.println("Enter the numbers before swapping:a"+a+"b:"+b);
		
		int t=a;
	
		a=b;
		b=t;
		System.out.println("After swap :"+a+"b:"+b);
		
	
		
		
		
	}


}
