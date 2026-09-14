import java.util.Scanner;

// Parent Class
class LearningSession {
    protected String learnerName;
    protected String skillName;
    protected String date;
    protected String time;

    // Constructor
    LearningSession(String learnerName, String skillName,
                    String date, String time) {
        this.learnerName = learnerName;
        this.skillName = skillName;
        this.date = date;
        this.time = time;
    }

    // Method to display session details
    void displaySession() {
        System.out.println("\n----- Learning Session Details -----");
        System.out.println("Learner Name : " + learnerName);
        System.out.println("Skill        : " + skillName);
        System.out.println("Date         : " + date);
        System.out.println("Time         : " + time);
    }

    // Method to start session
    void startSession() {
        System.out.println("Learning session started.");
    }
}

// Child Class 1
class OnlineSession extends LearningSession {

    private String platform;
    private String meetingLink;

    // Constructor
    OnlineSession(String learnerName, String skillName,
                  String date, String time,
                  String platform, String meetingLink) {

        super(learnerName, skillName, date, time);

        this.platform = platform;
        this.meetingLink = meetingLink;
    }

    // Method for online session
    void displayOnlineSession() {
        displaySession();

        System.out.println("Session Type : Online");
        System.out.println("Platform     : " + platform);
        System.out.println("Meeting Link : " + meetingLink);
    }

    // Method to join session
    void joinSession() {
        System.out.println("Learner joined the online session.");
    }
}

// Child Class 2
class OfflineSession extends LearningSession {

    private String location;
    private String roomNumber;

    // Constructor
    OfflineSession(String learnerName, String skillName,
                   String date, String time,
                   String location, String roomNumber) {

        super(learnerName, skillName, date, time);

        this.location = location;
        this.roomNumber = roomNumber;
    }

    // Method for offline session
    void displayOfflineSession() {
        displaySession();

        System.out.println("Session Type : Offline");
        System.out.println("Location     : " + location);
        System.out.println("Room Number  : " + roomNumber);
    }

    // Method to attend session
    void attendSession() {
        System.out.println("Learner attended the offline session.");
    }
}

// Main Class
public class LearningSessionModule {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("     SKILL EXCHANGE PLATFORM");
        System.out.println("       LEARNING SESSION MODULE");
        System.out.println("=================================");

        System.out.print("Enter Learner Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Skill Name: ");
        String skill = sc.nextLine();

        System.out.print("Enter Session Date: ");
        String date = sc.nextLine();

        System.out.print("Enter Session Time: ");
        String time = sc.nextLine();

        System.out.print("Enter Online Platform: ");
        String platform = sc.nextLine();

        System.out.print("Enter Meeting Link: ");
        String link = sc.nextLine();

        // Creating OnlineSession object
        OnlineSession online =
            new OnlineSession(
                name,
                skill,
                date,
                time,
                platform,
                link
            );

        // Displaying session
        online.displayOnlineSession();

        // Starting session
        online.startSession();

        // Joining session
        online.joinSession();

        System.out.println("\nLearning session completed.");

        sc.close();
    }
}