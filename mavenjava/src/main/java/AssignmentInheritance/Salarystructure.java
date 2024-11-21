package AssignmentInheritance;

public class Salarystructure extends SalarySlip{

	

	public Salarystructure(String name, double basicpay, double deduction, double bonus) {
		super(name, basicpay, deduction, bonus);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Salarystructure slip = new Salarystructure("SRUTHI",20000, 200, 300);
		slip.generateSlip();
	}

}
