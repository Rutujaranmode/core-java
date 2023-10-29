package coree;

import java.io.BufferedReader;
import java.io.IOException;

import java.util.Scanner;
public class FahrenheitToCelsius {
	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Tempreature:");
		double f=sc.nextDouble();
		double c=5.0/9.0*(f-32);
		System.out.println(" c:"+c);
	}

}
