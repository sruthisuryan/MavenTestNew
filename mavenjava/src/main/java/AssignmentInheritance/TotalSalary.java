package AssignmentInheritance;

public class TotalSalary extends CalculateHRA
{
	double totalSalary;
	public TotalSalary(String name, double basicpay, double deduction, double bonus) {
		super(name, basicpay, deduction, bonus);
		// total salary(Basicpay+hra-pf-deduction+bonus)
		
		this.totalSalary =calculateTotalSalary();
	}

	public double calculateTotalSalary() {
		
		totalSalary = (basicpay+hra-pf-deduction+bonus);
		
		return totalSalary;
		
		
		
	}

	public void displayTotalSalary() {
		System.out.println("Name of the emp is : " +name);
		System.out.println("Total Salary of emp is :" +totalSalary);
       
    }
	

	
	
  
	

}
