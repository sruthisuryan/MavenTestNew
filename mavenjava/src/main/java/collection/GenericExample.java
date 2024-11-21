package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		
		List <String> var = new ArrayList <String>(); //list  is an interface so object creation is not possible,using refernce to invoke the created refernce of list using interface class
		var.add("Blue"); //adding element to list using inbuilt add method
		var.add("Green");
		var.add("Red");
		var.add("indigo");
		var.add("violet");
		var.add("Green");
		System.out.println("Differenct color" + var);
		
		var.set(0, "Yellow");
		System.out.println(var);
		System.out.println("to know the index " +var.indexOf("red")); //gets the index value
		System.out.println("last index"+var.lastIndexOf("Blue")); //gets the last occurance index(last repeated
		System.out.println("Remove : " +var.remove(1)); //remove the value at index provide
		
		System.out.println("get the value at the index" +var.get(5)); //get the value at the index
	System.out.println("no value in the list get true or fals: " +var.contains("Pink"));
	System.out.println("---check  list emp:-");
	
	if(var.isEmpty())
	{
		System.out.println("list is empty");
	}
	else
	{
		System.out.println("list not empty");
	}
System.out.println("print size :" +var.size());
	//}
//}
	//for(int i =0;i<=var.siz();i++)
	//{
	//	System.out.println(var.get(i));
//	}//
	//
for(String v:var)
{
	System.out.println(v);
}
}
}
