package AssignmentInheritance;

public class CalculateHRA extends Basic {

	double hra;
   double pf;
 
 
	
	
	public CalculateHRA(String name, double basicpay, double deduction, double bonus)
	{
		super(name, basicpay, deduction, bonus);
		this.hra = 0.05 * basicpay; 
        this.pf = 0.20 * basicpay;
		
		
		
	}
	public double getHRA() {
        return hra;
    }

    public double getPF() {
        return pf;
    }
public void displayPfHra()
{
	System.out.println("Basic pay of emp  : " +basicpay);
	System.out.println("Deduction    :" + deduction);
	System.out.println("Bounus of emp:" +bonus);
    System.out.println("HRA cal : " + hra);
    System.out.println("PF Cal: " + pf);
}
} 

