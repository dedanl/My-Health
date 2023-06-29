import java.util.Scanner;

public class HealthApp {
    private static boolean fitnessTrackingPermission = false;
    private static boolean symptomAnalysisPermission = false;
    private static boolean dietRecommendationsPermission = false;
    private static boolean specialistConnectionPermission = false;

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
            System.out.println("5. App Permissions");
            System.out.println("6. Exit");
            System.out.print("Enter the tab number: ");
            int tab = input.nextInt();
            input.nextLine(); // Clear the buffer

            switch (tab) {
                case 1:
                    if (fitnessTrackingPermission) {
                        fitnessTracking();
                    } else {
                        System.out.println("You don't have permission to access Fitness Tracking.");
                    }
                    break;
                case 2:
                    if (symptomAnalysisPermission) {
                        symptomAnalysis();
                    } else {
                        System.out.println("You don't have permission to access Symptom Analysis.");
                    }
                    break;
                case 3:
                    if (dietRecommendationsPermission) {
                        personalizedDietRecommendations();
                    } else {
                        System.out.println("You don't have permission to access Personalized Diet Recommendations.");
                    }
                    break;
                case 4:
                    if (specialistConnectionPermission) {
                        specialistConnection();
                    } else {
                        System.out.println("You don't have permission to access Specialist Connection.");
                    }
                    break;
                case 5:
                    appPermissions();
                    break;
                case 6:
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

    public static void appPermissions() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n--- App Permissions ---");
        System.out.println("1. Fitness Tracking Permission: " + (fitnessTrackingPermission ? "Enabled" : "Disabled"));
        System.out.println("2. Symptom Analysis Permission: " + (symptomAnalysisPermission ? "Enabled" : "Disabled"));
        System.out.println("3. Personalized Diet Recommendations Permission: " + (dietRecommendationsPermission ? "Enabled" : "Disabled"));
        System.out.println("4. Specialist Connection Permission: " + (specialistConnectionPermission ? "Enabled" : "Disabled"));
        System.out.println("5. Go back to the main menu");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        input.nextLine(); // Clear the buffer

        switch (choice) {
            case 1:
                fitnessTrackingPermission = togglePermission(fitnessTrackingPermission);
                break;
            case 2:
                symptomAnalysisPermission = togglePermission(symptomAnalysisPermission);
                break;
            case 3:
                dietRecommendationsPermission = togglePermission(dietRecommendationsPermission);
                break;
            case 4:
                specialistConnectionPermission = togglePermission(specialistConnectionPermission);
                break;
            case 5:
                System.out.println("Returning to the main menu...");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static boolean togglePermission(boolean permission) {
        permission = !permission;
        System.out.println("Permission: " + (permission ? "Enabled" : "Disabled"));
        return permission;
    }
}
