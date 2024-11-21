package SuperMethod;

public class SuperMethodClass extends SuperMethodParent {

	public static void main(String[] args) {
		SuperMethodClass obj = new SuperMethodClass();
		obj.display();

	}
public void display()
{
	System.out.println("Method of a child class");
	super.show();
}
}
