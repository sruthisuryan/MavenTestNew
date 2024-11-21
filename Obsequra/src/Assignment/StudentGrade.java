package Assignment;

public class StudentGrade {

    int marks1, marks2, marks3;
   
    String name;
    int toatalMarks;
	
    public static void main(String[] args) {
        StudentGrade s1 = new StudentGrade("Rani", 130, 30, 30); 
        StudentGrade s2 = new StudentGrade("Sruthi", 10, 15, 30);
        
        s1.displayMarksAndGrade();
        s2.displayMarksAndGrade();
    }

    public StudentGrade(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.toatalMarks = marks1 + marks2 + marks3;
           
    }
    public String calculateGrade()
    {
    	    
        
        if (toatalMarks >= 90) {
            return "A";
        } else if (toatalMarks >= 80) {
            return "B";
        } else if (toatalMarks >= 70) {
            return "C";
        } else {
            return "Failed";
        }
    }


    public void displayMarksAndGrade() {
        System.out.println("Name: " + name);
        
		System.out.println("Total Marks: " + toatalMarks);
    
        System.out.println("Grade: " + calculateGrade());
    }
}

 
