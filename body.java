import java.util.Scanner;

public class HealthApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Health App!");

        // Main app loop
        boolean appRunning = true;
        while (appRunning) {
            System.out.println("\nTabs:");
            System.out.println("1. Fitness Tracking");
            System.out.println("2. Symptom Analysis");
            System.out.println("3. Personalized Diet Recommendations");
            System.out.println("4. Specialist Connection");
            System.out.println("5. Exit");
            System.out.print("Enter the tab number: ");
            int tab = input.nextInt();
            input.nextLine(); // Clear the buffer

            switch (tab) {
                case 1:
                    fitnessTracking();
                    break;
                case 2:
                    symptomAnalysis();
                    break;
                case 3:
                    personalizedDietRecommendations();
                    break;
                case 4:
                    specialistConnection();
                    break;
                case 5:
                    appRunning = false;
                    System.out.println("Exiting Health App...");
                    break;
                default:
                    System.out.println("Invalid tab number.");
            }
        }

        input.close();
    }

    public static void fitnessTracking() {
        System.out.println("\n--- Fitness Tracking ---");
        // Add your code here to implement fitness tracking functionality
    }

    public static void symptomAnalysis() {
        System.out.println("\n--- Symptom Analysis ---");
        // Add your code here to implement symptom analysis functionality
    }

    public static void personalizedDietRecommendations() {
        System.out.println("\n--- Personalized Diet Recommendations ---");
        // Add your code here to implement personalized diet recommendations functionality
    }

    public static void specialistConnection() {
        System.out.println("\n--- Specialist Connection ---");
        // Add your code here to implement specialist connection functionality
    }
}
