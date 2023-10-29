package Numbers;

import java.util.Scanner;

public class PerfectNumber1 {

	public static void main(String[] args) {
		
		int c,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		c=-sc.nextInt();
		
		for(int i=1;i<c;i++)
		{
			if(c%i==0)
			{
				sum=sum+i;
			}
		}
		if(c==sum)
		{
			System.out.println("Perfect no.");
		}
		else
		{
			System.out.println(" Not Perfect number");
		}
	}
}
