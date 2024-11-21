package Encapsulation;

public class EnChild {

	public static void main(String[] args) {
		
		EnParent p = new EnParent(); //parent class object
	
	p.setName("Test");
	p.setAge(22);
	System.out.println(p.getName()); //to call in main method
	System.out.println(p.getAge());
	}

}
