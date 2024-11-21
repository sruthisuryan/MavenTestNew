package SuperPackage;

public class SuperInstanceChild extends SuperInstance {
      
	String b ="Name of data";
	public static void main(String[] args) {
		SuperInstanceChild obj = new SuperInstanceChild();
		obj.display();
				
	}
	
	public void display() {
		
		System.out.println("Second parent class instance variable is :" +b);
		System.out.println("First parent class instance variable is :" +super.a);
	}

}
