package Examples;

public class SingleChild extends Parent {

    public static void main(String[] args) {
        SingleChild obj = new SingleChild();
        obj.display(); 
        obj.display2(); 
    }

    public void display2() {
        System.out.println("Single child");
    }
}
