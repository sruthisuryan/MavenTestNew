package Examples;

public class Discount {

	static int dis;
	public static void main(String[] args) {
		
		Discount obj = new Discount(7000);
		obj.display();
	}
	public Discount(int dis)
	{
		this.dis= dis;
	}
	public void eigibleVoting()
	{
		if(dis>=5000)
		{
			System.out.println("Eligible for discount");
		}
		else
		{
			System.out.println("Not eligible for discount");
		}
	}
	public void display()
	{
		this.eigibleVoting();
	}

}
