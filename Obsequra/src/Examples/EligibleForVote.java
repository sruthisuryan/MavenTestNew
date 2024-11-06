package Examples;


public class EligibleForVote {
    static int minvote = 18;  
    int candidateage;  
    
    public EligibleForVote(int age) {
        this.candidateage = age;
    }

    public static void main(String[] args) {
        EligibleForVote obj = new EligibleForVote(20);

        
        obj.votingEligibility();
    }

    
    public void votingEligibility() {
   
        if (isEligibleForVoting(this.candidateage)) {
            System.out.println("Candidate is eligible for voting.");
        } else {
            System.out.println("Candidate is not eligible for voting.");
        }
    }

    
    public static boolean isEligibleForVoting(int age) {
        
        return age >= minvote;
    }
}
