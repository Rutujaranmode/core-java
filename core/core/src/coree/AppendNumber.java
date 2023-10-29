package coree;

import java.util.Scanner;

public class AppendNumber {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter a number:");
	
	int c=sc.nextInt();
	System.out.println("Enter a Digit:");
	int digit=sc.nextInt();
	
	c=(c*10)+digit;
	System.out.println(" The value of c:"+c);
	
}
}
