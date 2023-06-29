import java.util.Scanner;

public class AppSettings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to App Settings!");

        // Simulated settings
        boolean notificationsEnabled = true;
        int fontSize = 12;
        String theme = "Light";

        displaySettings(notificationsEnabled, fontSize, theme);

        // Additional settings options
        System.out.println("\nSettings Options:");
        System.out.println("1. Toggle Notifications");
        System.out.println("2. Change Font Size");
        System.out.println("3. Change Theme");
        System.out.println("4. Save and Exit");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                notificationsEnabled = toggleNotifications(notificationsEnabled);
                break;
            case 2:
                fontSize = changeFontSize(fontSize);
                break;
            case 3:
                theme = changeTheme(theme);
                break;
            case 4:
                saveAndExit(notificationsEnabled, fontSize, theme);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        input.close();
    }

    public static void displaySettings(boolean notificationsEnabled, int fontSize, String theme) {
        System.out.println("\nApp Settings:");
        System.out.println("Notifications: " + (notificationsEnabled ? "Enabled" : "Disabled"));
        System.out.println("Font Size: " + fontSize);
        System.out.println("Theme: " + theme);
    }

    public static boolean toggleNotifications(boolean notificationsEnabled) {
        notificationsEnabled = !notificationsEnabled;
        System.out.println("\nNotifications: " + (notificationsEnabled ? "Enabled" : "Disabled"));
        return notificationsEnabled;
    }

    public static int changeFontSize(int fontSize) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the new font size: ");
        fontSize = input.nextInt();

        System.out.println("Font Size changed to: " + fontSize);
        return fontSize;
    }

    public static String changeTheme(String theme) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the new theme: ");
        theme = input.nextLine();

        System.out.println("Theme changed to: " + theme);
        return theme;
    }

    public static void saveAndExit(boolean notificationsEnabled, int fontSize, String theme) {
        System.out.println("\nSaving settings...");
        // Add your code here to save the settings, such as updating a configuration file or storing in a database
        System.out.println("Settings saved successfully!");
        System.out.println("Exiting...");
        // Add your code here to handle the application exit process
    }
}
