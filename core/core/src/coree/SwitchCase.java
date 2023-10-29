package coree;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
	
	char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
			System.out.println("a  is a character");
		break;
		case 'e':
			System.out.println("e is character");
		}
	}

}
