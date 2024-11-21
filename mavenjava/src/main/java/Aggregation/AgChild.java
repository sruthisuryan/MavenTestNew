package Aggregation;

public class AgChild {

	 String empname;
	 String empcity;
	 int empid;
	 AgParent refvar;
	
	
	
	public AgChild(String empname,String empcity,int empid,AgParent refvar )
	{
		this.empname = empname;
		this.empcity = empcity;
		this.empid = empid;
		this.refvar = refvar;
		
	}
	
	public void display() {
		
		System.out.println("Emp details are :" +empname  +empcity  +empid);
		System.out.println("List stud details:");
		System.out.println(refvar.studname);
		System.out.println(refvar.collegename);
		System.out.println(refvar.id);
		System.out.println(refvar.marks);
		
	
	}
	
	
public static void main(String[] args) {
	
	
	AgParent object = new AgParent("ASHA", "NASC", 12, 70);
	AgChild obj = new AgChild("Manu", "Kochi", 34, object);
	obj.display();
	
	}

}
