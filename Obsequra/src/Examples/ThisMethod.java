package Examples;

public class ThisMethod {

	String name;
	public static void main(String[] args) {
 
		ThisMethod obj = new ThisMethod("SRUTHI");
		obj.greet();
	}
	
	public ThisMethod(String name)
	{
		this.name = name;
	}
public void greet()
{
	this.welcome();
}
public void welcome()
{
	System.out.println(" Hello   " +name+ " Welcome back to eclipse");
}
}
