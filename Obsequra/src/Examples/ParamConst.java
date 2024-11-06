package Examples;

class ParamConst
{
String name;
int roll;
public static void main (String args[])
{

ParamConst obj = new ParamConst("RAM",36);
obj.display();
ParamConst obj1 = new ParamConst("Raju",44);
obj1.display();
}

public  ParamConst(String stud,int id)
{

name = stud;
roll = id;

}

public void display()
{
System.out.println("Name of student is :" +name);

System.out.println("ID of student is :" +roll);

}

}