package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		
		
		//set is an interface so we can create reference only
		
		Set <String> var = new HashSet<String>();
		var.add("Blue");
		var.add("RED");
		var.add("Green");
		var.add("Yellow");
		System.out.println("Colors to print : " +var);
		System.out.println(var.contains("Green"));
		System.out.println(var.remove("Yellow"));
		System.out.println(var.size());
		System.out.println(var.isEmpty());
		//var.clear();
		//System.out.println(var);
		
		Iterator itr = var.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(var); //remove last element

	}

}
