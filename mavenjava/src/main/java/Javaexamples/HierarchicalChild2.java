package Javaexamples;

public class HierarchicalChild2 extends HierarchicalParent {

	public static void main(String[] args) {
		
		HierarchicalChild2 obj = new HierarchicalChild2();
				obj.display2();
				obj.display();
		

	}
	public void display2()
	{
		System.out.println("2nd child");
	}
}
