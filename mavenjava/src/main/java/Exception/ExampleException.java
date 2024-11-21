package Exception;

public class ExampleException {

	public static void main(String[] args) {

		int a =10;
		int b = 0;
		try // error in code a number never divided by zero
		{
			int c = a/b;
		}
		
catch(ArithmeticException ae)  //to handle exception in try block
{
	//System.out.println("Exception handled");
	b =2;
	int d = a/b;
	System.out.println(d);
	System.out.println(ae); // we can view the exception
}
		finally
		{
			System.out.println("Rest of code");
		}
	}

}
