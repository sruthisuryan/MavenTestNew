package Accessspecifier;

public class Sample2 extends Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample2 obj = new Sample2();
		//obj.privateMethod(); //not accessble from other class
		obj.defaultMethod();
		obj.publicMethod();
		obj.protectedMethod();

	}

}
