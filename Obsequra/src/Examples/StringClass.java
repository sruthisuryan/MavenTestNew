package Examples;

public class StringClass {

	public static void main(String[] args) {
		String s = "Hello SRUTHI";
		System.out.println("Literal string value is :"+s);
		String a = new String("Welcome ");
		System.out.println("Print keyword of string is : "+a);
		char b[] = {'a','b','c'};
		String var = new String(b); //to convert array to string
		System.out.println("character of array is : "+var);
		int len = s.length();   //to find the length of the string
		System.out.println("length of a string s is : "+len);

	}

}
