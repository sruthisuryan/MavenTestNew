package Examples;

public class MethodSum {

	public static void main(String[] args) {
		MethodSum.sum(20,30);
		MethodSum.sum(2,3,4);
		MethodSum.sum(20,0.5f);
	}
	public static void sum(int a, int b)
	{
		
		int c = a+b;
		System.out.println("sum is :" +c);
	}
	public static void sum(int a,int b,int c)
	{
		int d = a*b*c;
		System.out.println(d);
	}
public static void sum(int a, float b)
{
	float f = a/b;
	System.out.println(f);
}
}
