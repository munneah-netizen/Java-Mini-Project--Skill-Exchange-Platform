import java.util.Scanner;

class User {
    int userId;
    String name;
    String email;
    String password;
    String skillOffered;
    String skillWanted;

    // Constructor
    User(int userId, String name, String email, String password,
         String skillOffered, String skillWanted) {

        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.skillOffered = skillOffered;
        this.skillWanted = skillWanted;
    }

    // Display user profile
    void displayProfile() {
        System.out.println("\n----- USER PROFILE -----");
        System.out.println("User ID       : " + userId);
        System.out.println("Name          : " + name);
        System.out.println("Email         : " + email);
        System.out.println("Skill Offered : " + skillOffered);
        System.out.println("Skill Wanted  : " + skillWanted);
    }

    // Login method
    boolean login(String email, String password) {

        if (this.email.equals(email) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    // Update skills
    void updateSkills(String skillOffered, String skillWanted) {
        this.skillOffered = skillOffered;
        this.skillWanted = skillWanted;

        System.out.println("Skills updated successfully!");
    }
}


public class UserModule {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating users using objects
        User user1 = new User(
                1,
                "Anushka",
                "anushka@gmail.com",
                "12345",
                "Java",
                "Python"
        );

        User user2 = new User(
                2,
                "Rahul",
                "rahul@gmail.com",
                "67890",
                "Python",
                "Java"
        );

        System.out.println("================================");
        System.out.println("      SKILL EXCHANGE PLATFORM");
        System.out.println("================================");

        System.out.println("\n1. Display User Profile");
        System.out.println("2. Login");
        System.out.println("3. Update Skills");

        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            user1.displayProfile();

        } else if (choice == 2) {

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (user1.login(email, password)) {
                System.out.println("\nLogin Successful!");
                System.out.println("Welcome " + user1.name);
            } else if (user2.login(email, password)) {
                System.out.println("\nLogin Successful!");
                System.out.println("Welcome " + user2.name);
            } else {
                System.out.println("\nInvalid Email or Password!");
            }

        } else if (choice == 3) {

            System.out.print("Enter New Skill You Offer: ");
            String offeredSkill = sc.nextLine();

            System.out.print("Enter New Skill You Want to Learn: ");
            String wantedSkill = sc.nextLine();

            user1.updateSkills(offeredSkill, wantedSkill);

            user1.displayProfile();

        } else {

            System.out.println("Invalid Choice!");

        }

        sc.close();
    }
}