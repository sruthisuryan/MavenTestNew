package Examples;

public class Fib {

	
public static void main(String[] args) {
		
int r = 6;
int a = 0;
int b=1;
for (int i =0;i<r;i++)
{
	System.out.println(a);
	int tem = a + b;
	a=b;
	b = tem;
}
	}

}
