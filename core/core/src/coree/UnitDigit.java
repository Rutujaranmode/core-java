package coree;

import java.util.Scanner;

public class UnitDigit {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int b=a%10;
		
		System.out.println(" unit digit of number:"+b);
	}

}
