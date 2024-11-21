package Assignment;

public class AreaOfFigures {

	public static void main(String[] args) {
		
		AreaOfFigures.area(3.0f);
		AreaOfFigures.area(3.0f, 5.0f);
		AreaOfFigures.area(8);
	}
	
	public static   double area(double r)
	{
		double area = Math.PI * r * r;
		 System.out.println("Area of the circle: " + area);
		return area ;
		
	}
	public static   double area(float l,float w)
	{
		double area = (l * w);
		 System.out.println("Area of the rectagle is: " + area);
		return area ;
		
	}
	public static double area(int a) {
	    double area = a * a; 
	    System.out.println("Area of the square is: " + area);
	    return area;
	}
}
