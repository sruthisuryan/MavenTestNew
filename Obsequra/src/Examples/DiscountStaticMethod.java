package Examples;

public class DiscountStaticMethod {
 static int amount;

	public static void main(String[] args) {
		
		DiscountStaticMethod obj = new DiscountStaticMethod(3000);
		obj.discount();
	}

	public DiscountStaticMethod(int amount)
	{
		this.amount = amount;
	}
	public static void calTotalAmount(int total)
	{
		if(total >= 5000)
		{
			System.out.println(("Get 20 % discount"));
		}
		else
		{
			System.out.println("Not eligible for discount");
		}
	}
	public static void discount()
	{
	calTotalAmount(amount);
	}
}
