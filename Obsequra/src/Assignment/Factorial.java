package Assignment;

public class Factorial {

    int num; 

    public Factorial(int num) {
        this.num = num;
    }

    
    public static int cal(int num) { 
        int fact = 1;  
        for (int i = 1; i <= num; i++) {
            fact *= i; 
        }
        return fact;
    }

   
    public void show() {
        int result = cal(num);  
        System.out.println("Factorial of " + num + " is: " + result);
    }

    public static void main(String[] args) {  
       
        Factorial obj = new Factorial(5);
        obj.show(); 
    }
}
