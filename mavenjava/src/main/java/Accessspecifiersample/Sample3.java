package Accessspecifiersample;

import Accessspecifier.Sample1;

public class Sample3 extends Sample1 {

	public static void main(String[] args) {
		Sample3 obj = new Sample3();
		obj.protectedMethod();
		obj.publicMethod();
		//obj.defaultMethod(); not accessible outside package
		//obj.privateMethod(); not accessible outside package
	}

}
