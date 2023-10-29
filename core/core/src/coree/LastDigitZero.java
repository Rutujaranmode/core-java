package coree;

import java.util.Scanner;

public class LastDigitZero {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		
		System.out.println("enter the number:");
		int a=sc.nextInt();
		
		a=a/10*10;
		System.out.println("The value og a:"+a);
		
	}

}
