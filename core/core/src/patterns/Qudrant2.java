package patterns;

public class Qudrant2 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int sp=0;sp<(4-i);sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	



//    *
//   * *
//  * * *
// * * * *
//  * * *
//	 * *
//    *


for(int a=3;a>=1;a--)
{
	
//	
	for(int sp1=1;sp1<=(4-a);sp1++)
	{
		System.out.print(" ");
	}

	for(int b=1;b<=a;b++)
	{
		System.out.print(" *");
	}
	System.out.println();

}
}
}