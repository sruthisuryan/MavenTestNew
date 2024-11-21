package Examples;

public class VoteEligibility {
static int age;
	public static void main(String[] args) {
		VoteEligibility.vote(80);
	}

public static void vote(int age) {
	if(age>= 18)
	{
		System.out.println("Eligible for voting");
	}
	else {
		System.out.println("Not eligible for voting");
	}
}

}
