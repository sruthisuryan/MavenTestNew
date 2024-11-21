package Collectionclass;

import java.util.ArrayList;

public class ArrayListClassExam {

	public static void main(String[] args) {
		
		
		ArrayList obj = new ArrayList<String>(); //it is a class so object is created
		
		obj.add("Car");
		obj.add("Bus");
		obj.add("Bike");
		
		System.out.println("Firstv :" +obj);
		ArrayList obj1 = new ArrayList<String>();
		obj1.add("Red");
		
		obj1.add("Blue");
		
		System.out.println("print 2 list" +obj.addAll(obj1));
		System.out.println(obj);
		
		obj.set(0, "Hello");
		System.out.println(obj);
		System.out.println(obj.get(2));
		System.out.println(obj.contains("pink"));
	}

}
