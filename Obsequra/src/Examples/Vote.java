package Examples;

public class Vote {

	static int age;
	

	public static void main(String[] args) {
		
		Vote obj = new Vote(20);
		obj.disply();

	}
	public Vote(int age) {
		this.age = age;
	}
	
	public void votingEligibility()
	{
		if(age>=18) {
			System.out.println("eligible for voting");
		}
		else
		{
			System.out.println("Not eligible for voting");
		}
	}
	public void disply()
	{
		this.votingEligibility();
	}

}
