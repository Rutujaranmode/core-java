package Numbers;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	int rev=0;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the number :");
	int n=sc.nextInt();
	int rem=0;
	while(n!=0)
	{
	rem=n%10;
	n=n*10+rem;
	n=n/10;
	}
	System.out.println("rev"+n);
}
}
