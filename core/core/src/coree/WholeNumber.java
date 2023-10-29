package coree;

import java.util.Scanner;

public class WholeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		
		int a=sc.nextInt();
		if(a>=0)
		{
			System.out.println("The Given Number is Whole Number");
		}
		else
		{
			System.out.println("The Given Number is not Whole Number");
		}
	}
}
