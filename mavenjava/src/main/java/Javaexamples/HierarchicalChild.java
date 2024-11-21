package Javaexamples;

public class HierarchicalChild extends HierarchicalParent {

	public static void main(String[] args) {
		HierarchicalChild obj = new HierarchicalChild();
		obj.display();
		obj.display1();

	}
	public void display1()
	{
		System.out.println("First child");
	}

}
