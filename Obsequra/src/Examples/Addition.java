package Examples;

public class Addition {

	static int a = 10;
	static int b = 20;
	public static void main(String args[])
	{
System.out.println(a);
System.out.println(b);
int t=0;
t=b;
b=a;
a=t;

	System.out.println("After swapping value of a is :"+a);
	System.out.println("After swapping value of b is :"+b);
	}

}
