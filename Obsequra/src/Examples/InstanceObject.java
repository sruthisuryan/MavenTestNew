package Examples;

class InstanceObject
{
public static void main(String args[])
{
InstanceObject obj = new InstanceObject(); //object creation
obj.add(); //invoke method
}
public void add()
{

int a =9;
int b =8;
int sum = a+b;
System.out.println("Sum of two number is:" +sum);
}

}