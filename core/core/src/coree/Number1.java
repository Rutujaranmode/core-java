package coree;

public class Number1 {

	public static void main(String[] args) {
//		A 
//		B C 
//		D E F 
//		G H I J 
		char al='A';
		for(int i=1;i<=4;i++)
		{
		for(int j=1;j<=i;j++)
		{
			
			System.out.print(al+" ");
			al++;
		
		}
		System.out.println();
		}
			
		
		
		
//		1 
//	    2  3 
//	    4 5 6 
//		7 8 9 10
		System.out.println();
		int num=1;
		for(int a=1;a<=4;a++)
		{
			for(int sp=0;sp<(4-a);sp++)
			{
				System.out.print(" ");
			}
			
	
			for(int b=1;b<=a;b++)
			{
			System.out.print(num+"  ");
			num++;
		    }
			System.out.println();
		}
		
		
//		    1  
//		  2  3  
//		 4  5  6  
//		7  8  9  10  
		
		System.out.println();
		int num1=1;
		for(int a=1;a<=4;a++)
		{
	
			for(int b=1;b<=a;b++)
			{
			System.out.print(num1+"  ");
			num1++;
		    }
			System.out.println();
		
		
		}
		
		
		
		System.out.println();
		
		for(int p=1;p<=5;p++)
		{
			for(int q=8;q>q-2;q--)
			{
				System.out.print(p);
				
				
			}
			System.out.println();
		
		}
	
	
}}
