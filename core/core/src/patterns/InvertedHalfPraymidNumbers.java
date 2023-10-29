package patterns;

public class InvertedHalfPraymidNumbers {
	
public static void main(String[] args) {
	
//	    1 
//	   1 2 
//	  1 2 3 
//	 1 2 3 4 
//	1 2 3 4 5 

	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n-i+1;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(j+ " ");
		}
		System.out.println();
	}
	
	System.out.println();
	
	
//	1 2 3 4 5 
//	1 2 3 4 
//	1 2 3 
//	1 2 
//	1 

	int a=6;
	for(int i=1;i<=a;i++)
	{
		for(int j=1;j<=n-i+1;j++)
		{
			System.out.print(j+ " ");
		}
	System.out.println();
	
	
	}
}
}
