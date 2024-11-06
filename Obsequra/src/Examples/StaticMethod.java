package Examples;

public class StaticMethod {

	
	String name;
	int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMethod obj = new StaticMethod("ROHAN", 24);
		obj.display();

	}
	
public StaticMethod(String name, int age) {
	this.name = name;
	this.age = age;
		
	}
	
	public void display()
	{
		System.out.println("Name is :"+name);
		System.out.println("Age is :" +age);
		System.out.println("---------");
	}

}
