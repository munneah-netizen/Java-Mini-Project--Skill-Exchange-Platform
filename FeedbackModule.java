import java.util.Scanner;

// Parent Class
class Feedback {
    protected String learnerName;
    protected String skillName;
    protected String comment;

    // Constructor
    Feedback(String learnerName, String skillName, String comment) {
        this.learnerName = learnerName;
        this.skillName = skillName;
        this.comment = comment;
    }

    // Display basic feedback
    void displayFeedback() {
        System.out.println("\n----- Feedback Details -----");
        System.out.println("Learner Name : " + learnerName);
        System.out.println("Skill Name   : " + skillName);
        System.out.println("Comment      : " + comment);
    }

    // Method to submit feedback
    void submitFeedback() {
        System.out.println("Feedback submitted successfully.");
    }
}

// Child Class
class SkillFeedback extends Feedback {

    private int rating;
    private String trainerName;

    // Constructor
    SkillFeedback(String learnerName, String skillName,
                  String comment, int rating, String trainerName) {

        super(learnerName, skillName, comment);

        this.rating = rating;
        this.trainerName = trainerName;
    }

    // Display complete feedback
    void displaySkillFeedback() {
        displayFeedback();

        System.out.println("Trainer Name : " + trainerName);
        System.out.println("Rating       : " + rating + "/5");
    }

    // Method to check rating
    void showRating() {

        if (rating >= 4) {
            System.out.println("Rating Status: Excellent");
        } 
        else if (rating >= 3) {
            System.out.println("Rating Status: Good");
        } 
        else {
            System.out.println("Rating Status: Needs Improvement");
        }
    }
}

// Main Class
public class FeedbackModule {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      SKILL EXCHANGE PLATFORM");
        System.out.println("          FEEDBACK MODULE");
        System.out.println("=================================");

        System.out.print("Enter Learner Name: ");
        String learnerName = sc.nextLine();

        System.out.print("Enter Skill Name: ");
        String skillName = sc.nextLine();

        System.out.print("Enter Trainer Name: ");
        String trainerName = sc.nextLine();

        System.out.print("Enter Rating (1-5): ");
        int rating = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Your Comment: ");
        String comment = sc.nextLine();

        // Creating object of child class
        SkillFeedback feedback =
            new SkillFeedback(
                learnerName,
                skillName,
                comment,
                rating,
                trainerName
            );

        // Display feedback
        feedback.displaySkillFeedback();

        // Submit feedback
        feedback.submitFeedback();

        // Show rating status
        feedback.showRating();

        System.out.println("\nThank you for your valuable feedback!");

        sc.close();
    }
}