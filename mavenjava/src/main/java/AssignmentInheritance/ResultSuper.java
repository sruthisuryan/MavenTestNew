package AssignmentInheritance;

public class ResultSuper extends Addition {

	public ResultSuper(int a, int b) {
		super(a, b);
		
	}
	
	public void checkDivision()
	{
		int sum = super.ret();
		System.out.println("Addition result is :" +sum);
		
		if(sum %10 ==0)
		{
			System.out.println("Result is divisible by 10");
		}
		else
		{
			System.out.println("Not divisible by 10");
		}
	}

	public static void main(String[] args) {
		
		ResultSuper obj = new ResultSuper(5, 15);
		obj.checkDivision();
		
	}

	
}
