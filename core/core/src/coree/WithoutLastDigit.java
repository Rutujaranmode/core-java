package coree;

import java.util.Scanner;

public class WithoutLastDigit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the a:");
		int a=sc.nextInt();
		
		int b=a/10;
		System.out.println(" value of b:"+b);
		
	}

}
