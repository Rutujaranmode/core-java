package coree;

import java.util.Scanner;

public class NaturalNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		
		int b=sc.nextInt();
		if(b>=1)
		{
			System.out.println(" The Given number is natural number:"+b);
		}
		else
		{
			System.out.println("The Given number is not natural number:"+b);
		}
		
	}

}
