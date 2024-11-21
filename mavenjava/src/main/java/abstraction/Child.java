package abstraction;

public class Child extends Parent{

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.display();
		obj.sum(10, 20);
	}

	@Override
	public void display() {
		
		System.out.println("Parrent class");
		
	}

}
