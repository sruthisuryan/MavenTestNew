package Examples;

public class Student {

	static int id;
	static String name ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj = new Student(23,"RAM");
		obj.stud();

	}
	public Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void stud()
	{
		System.out.println(id);
		System.out.println(name);
	}

}
