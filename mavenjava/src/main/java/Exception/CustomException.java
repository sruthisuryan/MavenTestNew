package Exception;

public class CustomException {

	public static void main(String[] args) throws VotingExecption {
		
		int age = 11;
		if(age >= 18)
		{
			System.out.println("Eligible for Voting");
		}
		else
		{
			throw new VotingExecption("Age under 18 is not eligible for voting");
		}

	}

}
