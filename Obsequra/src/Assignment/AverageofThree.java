package Assignment;

public class AverageofThree {
	
	

	public static void main(String[] args) {
		AverageofThree.average(10, 30, 40);
		AverageofThree.average(1.0f, 1.0f, 1.0f);
	}

	
	public static int average(int a,int b,int c)
	{
		int res = (a+b+c)/3;
		System.out.println("Average of int is "+res);		
		return res;
	}
	public static float average(float a,float b,float c)
	{
		float res = (a+b+c)/3;
		System.out.println("Average of float is "+res);
		return res;
		
	}
	

}
