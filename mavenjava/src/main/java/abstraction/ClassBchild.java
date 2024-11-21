package abstraction;

public class ClassBchild extends ClassA {

	public static void main(String[] args) {
		
		
		ClassA obj = new ClassBchild(); //Class A reference of abstarct class(Parent class)
		obj.display();
		obj.show();
		//obj.print() cannot be invoke childclass property using abstract parent class
	}

	@Override
	public void display() {
		System.out.println("Hello child");
		
	}
	
	public void print()
	{
		System.out.println("Print child class details");
	}

}
