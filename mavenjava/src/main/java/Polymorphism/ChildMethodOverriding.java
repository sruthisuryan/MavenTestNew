package Polymorphism;

public class ChildMethodOverriding extends Parent{

	public static void main(String[] args) {
		
		ChildMethodOverriding obj =new ChildMethodOverriding();
		obj.display(20, 10);

	}
	public void display(int a,int b)
	{
		
		int d = a - b;
		System.out.println("Difference = " +d);
		super.display(20, 30); //invoke parent class method
	}

}
