package multipleinterface;

public class ClassA implements Parent1,Parent2 {

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.print1();
		obj.print2();

	}

	@Override
	public void print1() {
		System.out.println("Parent1");
		
	}

	@Override
	public void print2() {
		System.out.println("Parent2");
		
	}

}
