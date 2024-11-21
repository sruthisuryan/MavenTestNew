package Aggregation;

public class AggregationAddress {

	String address;
	AggregationStudent refvar;
	public static void main(String[] args) {
		
		AggregationStudent obj = new AggregationStudent("SRUTHI", 20);
		
		AggregationAddress obj1 = new AggregationAddress("No:18,West Fort,Thrissur",obj);
		
		obj1.display();
		
	}

	
	public  AggregationAddress(String address,AggregationStudent refvar)
	{
		
		this.address = address;
		this.refvar = refvar;
		
	}
	
	public void display()
	{
		System.out.println("----------Student details : -----------------");
		System.out.println("Name of the student :"+refvar.name);
		System.out.println("Roll number for the student : " +refvar.rollnum);
		System.out.println("Address of the student : " +address);
		System.out.println("----------------------------------------------------");
	}
}
