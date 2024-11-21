package Examples;

public class Palindrome {
	static int n;

	public static void main(String[] args)
	{
		Palindrome obj = new Palindrome(11);
		obj.pal();
		
		

	}
	public Palindrome(int n) {
		this.n=n;
		
	}
	public static boolean checkPalindrome(int n)
	{
		int originalnumber = n;
		int reversenumber = 0;
		int rem;
		while(n!=0)
		{
			rem = n %10;
			reversenumber = reversenumber *10 + rem;
			n = n/10;
		}
		return originalnumber == reversenumber;
	}
	 public static void pal()
	 {
		 if(checkPalindrome(n))
		 {
		 System.out.println("This number is palindrome");
		 }
		 else
		 {
			 System.out.println("This number is not palindrome");
		 }
	 }
	
}