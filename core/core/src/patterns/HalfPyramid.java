package patterns;

public class HalfPyramid {
	
//	*
//	**
//	***
//	****

	public static void main(String[] args) {
		
		int n=4;
		int j;
		for(int i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
