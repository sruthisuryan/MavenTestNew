package SuperPackage;

public class SuperConstructorChild extends SuperConstructorParent {

	public static void main(String[] args) {
		SuperConstructorChild obj = new SuperConstructorChild(2,3); //obj created to invoke child class,no parameter calling

	}
	
	public SuperConstructorChild(int d, int e) //constructor creation accessspecifier classname
	{ 
		super(10,20);  //Parameterised constructor so value should pass and super should be written first to invoke constructor (specifically for constructor only)
		int f = d*e;
		System.out.println("sum of F is = " +f);
	    
	}

}
