package Examples;

public class Factorial {

	public static void main(String[] args) {
	int num = 5;
	System.out.println("Factorial of " +num+ " is " +fact(num));

	}
	
	public static int fact(int n)
	{
		int res = 1;
		for(int i = 1; i<=n; i++)
		{
			res *= i;
		}
		return res;
		
	}

}
