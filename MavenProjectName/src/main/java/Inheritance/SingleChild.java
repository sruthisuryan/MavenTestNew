package Inheritance;


	public class SingleChild extends Parent {

	    public static void main(String[] args) {
	        SingleChild obj = new SingleChild();
	        obj.display();  // Calling inherited method
	        obj.display2(); // Calling method of SingleChild
	    }

	    public void display2() {
	        System.out.println("Single child");
	    }
	}
