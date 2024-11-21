package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGeneric {

	public static void main(String[] args) {
	List var = new ArrayList();
	
	var.add("Red");
	var.add("blue");
	var.add("Green");
	var.add("Yellow");
	
	System.out.println("Colours of non generic:" +var);
	var.set(1, "Black");
	System.out.println(var);
	System.out.println("get val :" +var.get(3));
	}

}
