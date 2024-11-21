package Examples;

class StatementElse {
    public static void main(String args[]) {
        // Parse the input argument to an integer
        int a = Integer.parseInt(args[0]);

        // Check if the number is positive
        if (a > 0) {
            System.out.println("The given number is positive " + a);
        }
        // Check if the number is negative
        else if (a < 0) {
            System.out.println("The given number is not positive " + a);
        }
        // Case for zero
        else {
            System.out.println("The given number is zero");
        }
    }
}

