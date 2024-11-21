package SuperPackage;

public class SuperChildClass extends SuperParentClass {


int age;	int mark;
String name2;
	
	
	public static void main(String[] args) {
	
		SuperChildClass obj = new SuperChildClass(22, 12, "xyz");	
		obj.display();

	}

	
	public SuperChildClass(int age,int mark,String name2)
	{
		 // Call the parent class's default constructor
		super();
		this.age = age;
		this.mark = mark;
		this.name2 = name2;
	}
	
	
	public void display()
	{
		super.parentDetails();  // Call parent class's display method
		System.out.println("age :" +age);
		System.out.println("Mark is :" +mark);
		System.out.println("Name 2 :" +name2);
	}
}
