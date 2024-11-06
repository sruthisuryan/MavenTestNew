package Examples;

public class ParameterisedConstructor {

	String car;
	int model;
	public static void main(String[] args) {
		
		ParameterisedConstructor obj = new ParameterisedConstructor("Baleno",2004);
		obj.car();
	}
	
	public ParameterisedConstructor(String car,int model)
	{
		this.car = car;
		this.model = model;
	}
	
	public void car()
	{
		System.out.println("Model is " +car);
		System.out.println("year " +model);
	}

}
