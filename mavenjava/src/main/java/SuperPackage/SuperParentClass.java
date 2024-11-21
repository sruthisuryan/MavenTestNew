package SuperPackage;

public class SuperParentClass {
	
	int a;
	int b;
	String name;
	float f;
	double d;
	
	public SuperParentClass()
	{
		this.a =2;
		this.b = 4;
		this.f = a*b;
		this.d = (double)a/b;
		this.name = "Parent name ";
		
	}

public void parentDetails()
{
	System.out.println("Print value of f" +f);
	System.out.println("Print value of d" +d);
	System.out.println("Print value of name" +name);
}

	
}
