package Examples;
 class ThisThree {

	public static void main(String[] args) 
	{
	ThisThree obj = new ThisThree(123);
	}
		
			

	public ThisThree()
	{
		
		System.out.println("A default constructor");
	}
	
	public ThisThree(int a)
	{
		this("Java class");
		System.out.println("A integer constructor:" +a);
	}
	public ThisThree(String s)
	{
		this();
		System.out.println("A string const:" +s);
	}

}
