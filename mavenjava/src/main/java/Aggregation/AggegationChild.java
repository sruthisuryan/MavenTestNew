package Aggregation;

public class AggegationChild {

	String name;
	String model;
	int year;
	AggregationParent refvar;
	
	public AggegationChild(String name,String model,int year,AggregationParent refvar) {
		this.name = name;
		this.model = model;
		this.year = year;
		this.refvar = refvar;
		
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(model);
		System.out.println(year);
		System.out.println("---Parent class--");
		System.out.println(refvar.name);
		System.out.println(refvar.city);
		System.out.println(refvar.state);
		System.out.println(refvar.pin);
	}
	
	public static void main(String[] args) {
		
		AggregationParent object = new  AggregationParent("Rani", "Palakkad", "kerala", 2020);
		AggegationChild obj = new AggegationChild("Maruthi", "Swift", 2020,object);
		obj.display();
		
	}
	

}
