package coree;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int f=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int n=sc.nextInt();
		
		while(n>=1)
		{
			f=f*n;
			n--;
		
		}
		System.out.println("Factorial no of given number");
	}
}
