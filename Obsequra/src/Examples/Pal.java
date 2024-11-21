package Examples;

public class Pal {
static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pal obj = new Pal(789);
		obj.displya();
	}
	public Pal(int n)
	{
		this.n= n;
	}
	public boolean palindrome(int n)
	{
		int org = n;
		int rev =0;
		int rem;
		while(n!=0)
		{
			rem = n/10;
			rev = rev*10+rem;
			n=n/10;
		}
		return false ;
	}
public void displya()
{
	if(palindrome(n))
	{
		System.out.println("number is pal");
	}
	else
	{
		System.out.println("not palin");
	}
}
}
