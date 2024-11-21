package interfacePackage;

public class ChildInterface implements Parent {

	public static void main(String[] args) {
		ChildInterface obj = new ChildInterface();
		obj.display();
		System.out.println(obj.a);

	}

	@Override
	public void display() {
		System.out.println("Parent class interface details");
		
	}

}
