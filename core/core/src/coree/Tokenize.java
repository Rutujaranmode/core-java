package coree;

import java.util.Scanner;

public class Tokenize {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		if(a>=1_00_000 && a<=9_99_999)
		{
			int tok3=a%1000;
			int tok2=(a%1000)%10;
			
			int tok1=a/10000;
			
			System.out.println("TOK-1:"+tok1);
			System.out.println("TOK-2:"+tok2);
			System.out.println("TOK-3:"+tok3);
		}
		else
		{
			System.out.println("Invalid input!!\n");
		}

	}

}
