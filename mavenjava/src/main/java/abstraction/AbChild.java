package abstraction;

public class AbChild extends AbstParent {

	public static void main(String[] args) {
		AbChild obj = new AbChild();
		obj.show();
		obj.sum(2, 33);
		

	}

	@Override
	public void show() {
		System.out.println("Abstarct class");
		
	}

	@Override
	public void sum(int a, int b) {
		int sum = a+b;
		System.out.println("Addition 2 number is :"+sum);
		
	}

	
}
