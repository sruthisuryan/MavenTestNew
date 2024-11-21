package Accessspecifier;

public class Sample1 {

	public static void main(String[] args) {
		
		Sample1 obj = new Sample1();
		obj.privateMethod();
		obj.defaultMethod();
		obj.protectedMethod();
		obj.publicMethod();
	}
	private void privateMethod()
	{
		System.out.println("Hello Private Method");
	}
	
	public void publicMethod()
	{
		System.out.println("Public Method print here");
	}
	protected void protectedMethod()
	{
		System.out.println("protected method print here");
	}
	
	void defaultMethod()
	{
		System.out.println("Default method");
	}

}
