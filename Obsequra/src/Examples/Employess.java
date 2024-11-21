package Examples;

public class Employess { 
    String name;
    String designation;
   
    public Employess(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    public void printDetails() {
        
        
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Designation: " + designation);
    }
    public static void main(String[] args) {
       
        Employess obj = new Employess("SRUTHI", "Teacher"); 
        obj.printDetails();
        Employess obj1 = new Employess("RANI","DEVELOPER");
        obj1.printDetails();
    }
}
