package Exception;

public class ArithmeticExceptionSample {

	public static void main(String[] args) {
	int a=5/0;
	System.out.println(a);
	
	//null pointer
	
	String s = null;
	System.out.println(s.length());
	
	//array length
	
	int arr[] = {1,2,3};
	for(int i=0;i<=3;i++)
	{
		System.out.println(arr[i]);
	}
	
	}

}
