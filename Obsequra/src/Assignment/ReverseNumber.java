package Assignment;

public class ReverseNumber {

    int rev = 0;  
    int num;      
    
    public ReverseNumber(int num) 
    {
        this.num = num;  
    
        int temp = num;
        while (temp != 0) {
            rev = rev * 10 + temp % 10; 
            temp = temp / 10;            
        }
    }

    public ReverseNumber()
    {
    	
    	
    }
    public void display() {
    	System.out.println("Reverse of the number is: " + rev);
    }

    public static void main(String[] args) {
        
        ReverseNumber obj = new ReverseNumber(239);
        obj.display();
    }
}
