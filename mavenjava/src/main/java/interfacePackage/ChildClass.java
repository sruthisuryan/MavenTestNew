package interfacePackage;

public class ChildClass implements ParentInterface {

	public static void main(String[] args) {
		ParentInterface obj = new ChildClass();
		obj.show();
	//	obj.childClass //refencevariable created for parent 
		

	}

	@Override
	public void show() {
		System.out.println("Parent classpublic ");
		
	}
public void childClass()
{
	System.out.println("Child class invoke");
}
}
