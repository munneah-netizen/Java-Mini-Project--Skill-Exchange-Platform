import java.util.Scanner;

// Parent Class
class Person {

    String name;
    int age;
    String city;

    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    void displayPersonDetails() {
        System.out.println("\n========================================");
        System.out.println("          PERSONAL INFORMATION");
        System.out.println("========================================");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("City       : " + city);
    }
}


// Child Class 1
class SkillProvider extends Person {

    String skill;
    String experience;

    SkillProvider(String name, int age, String city,
                  String skill, String experience) {

        super(name, age, city);

        this.skill = skill;
        this.experience = experience;
    }

    void displayProviderDetails() {

        displayPersonDetails();

        System.out.println("\n----------------------------------------");
        System.out.println("          SKILL PROVIDER DETAILS");
        System.out.println("----------------------------------------");
        System.out.println("Skill Offered : " + skill);
        System.out.println("Experience    : " + experience);

        System.out.println("\nMessage:");
        System.out.println(name + " is ready to share knowledge of "
                           + skill + " with other learners.");
    }
}


// Child Class 2
class SkillLearner extends Person {

    String wantedSkill;
    String learningLevel;

    SkillLearner(String name, int age, String city,
                 String wantedSkill, String learningLevel) {

        super(name, age, city);

        this.wantedSkill = wantedSkill;
        this.learningLevel = learningLevel;
    }

    void displayLearnerDetails() {

        displayPersonDetails();

        System.out.println("\n----------------------------------------");
        System.out.println("          SKILL LEARNER DETAILS");
        System.out.println("----------------------------------------");
        System.out.println("Skill Wanted  : " + wantedSkill);
        System.out.println("Learning Level: " + learningLevel);

        System.out.println("\nMessage:");
        System.out.println(name + " is interested in learning "
                           + wantedSkill + ".");
    }
}


// Main Class
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n==============================================");
        System.out.println("          WELCOME TO SKILL EXCHANGE");
        System.out.println("==============================================");

        System.out.println("\nThis platform allows people to");
        System.out.println("share their skills and learn new skills.");
        System.out.println("----------------------------------------------");


        // First Object - Skill Provider
        System.out.println("\nEnter Skill Provider Details");
        System.out.println("----------------------------------------------");

        System.out.print("Enter name: ");
        String providerName = sc.nextLine();

        System.out.print("Enter age: ");
        int providerAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter city: ");
        String providerCity = sc.nextLine();

        System.out.print("Enter skill you can teach: ");
        String providerSkill = sc.nextLine();

        System.out.print("Enter your experience: ");
        String experience = sc.nextLine();


        // Object Creation in Main Class
        SkillProvider provider = new SkillProvider(
            providerName,
            providerAge,
            providerCity,
            providerSkill,
            experience
        );


        // Second Object - Skill Learner
        System.out.println("\n\nEnter Skill Learner Details");
        System.out.println("----------------------------------------------");

        System.out.print("Enter name: ");
        String learnerName = sc.nextLine();

        System.out.print("Enter age: ");
        int learnerAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter city: ");
        String learnerCity = sc.nextLine();

        System.out.print("Enter skill you want to learn: ");
        String wantedSkill = sc.nextLine();

        System.out.print("Enter your learning level: ");
        String learningLevel = sc.nextLine();


        // Object Creation in Main Class
        SkillLearner learner = new SkillLearner(
            learnerName,
            learnerAge,
            learnerCity,
            wantedSkill,
            learningLevel
        );


        // Display Provider Information
        System.out.println("\n\n==============================================");
        System.out.println("          SKILL PROVIDER PROFILE");
        System.out.println("==============================================");

        provider.displayProviderDetails();


        // Display Learner Information
        System.out.println("\n\n==============================================");
        System.out.println("          SKILL LEARNER PROFILE");
        System.out.println("==============================================");

        learner.displayLearnerDetails();


        // Final Message
        System.out.println("\n\n==============================================");
        System.out.println("             SKILL EXCHANGE");
        System.out.println("==============================================");

        System.out.println("\nSkill Provider : " + provider.name);
        System.out.println("Skill Offered  : " + provider.skill);

        System.out.println("\nSkill Learner  : " + learner.name);
        System.out.println("Skill Required : " + learner.wantedSkill);

        System.out.println("\n----------------------------------------------");
        System.out.println("Thank you for using Skill Exchange System!");
        System.out.println("Share your knowledge, learn new skills,");
        System.out.println("and grow together.");
        System.out.println("----------------------------------------------");

        sc.close();
    }
}