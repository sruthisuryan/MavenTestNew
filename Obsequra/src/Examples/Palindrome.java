package Examples;

public class Palindrome {
	static int num;

	public static void main(String[] args)
	{
		Palindrome obj = new Palindrome(123);
		obj.pal();
		
		

	}
	public Palindrome(int num) {
		this.num=num;
		
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
		 if(checkPalindrome(num))
		 {
		 System.out.println("This number is palindrome");
		 }
		 else
		 {
			 System.out.println("This number is not palindrome");
		 }
	 }
	
}