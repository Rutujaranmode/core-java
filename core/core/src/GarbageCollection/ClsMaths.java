package GarbageCollection;

public class ClsMaths 
{
	
	static double pi;
	
	ClsMaths(){
		pi=3.14;
	}
	static void MakeMyCircle(int radius)
	{
		double db1=0;
		db1=pi*radius*radius;
		System.out.println("Circle radius is "+db1);
		ClsMaths obj2=new ClsMaths();
		obj2.MakeMyCircle(5);
	}
	
	 //
	public static void main(String[] args) {
		
		ClsMaths obj=new ClsMaths();
		obj.MakeMyCircle(12);
		
	}
}
