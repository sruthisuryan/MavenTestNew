package AssignmentInheritance;

public class SalarySlip extends TotalSalary {

	public SalarySlip(String name, double basicpay, double deduction, double bonus) {
		super(name, basicpay, deduction, bonus);
	
	}
	 public void generateSlip() {
	        System.out.println("\n----- Salary Slip -----");
	        displayTotalSalary();
	        displayPfHra();
	        
	        
	        
	    }
	
public static void main(String args[])
{
	SalarySlip slip = new SalarySlip("SRUTHI",20000, 20, 30);
	slip.generateSlip();
	
}
	
}
