import java.util.Scanner;

public class ProfileEditor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Profile Editor!");

        // Simulated user profile
        String username = "JohnDoe";
        String fullName = "John Doe";
        int age = 25;
        String address = "123 Main Street";

        displayProfileInformation(username, fullName, age, address);

        System.out.print("Do you want to edit your profile? (Y/N): ");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("\nPlease enter the new profile information:");

            System.out.print("Full Name: ");
            fullName = input.nextLine();

            System.out.print("Age: ");
            age = input.nextInt();
            input.nextLine(); // Clear the buffer

            System.out.print("Address: ");
            address = input.nextLine();

            updateProfileInformation(username, fullName, age, address);

            System.out.println("\nProfile updated successfully!");
            displayProfileInformation(username, fullName, age, address);
        } else {
            System.out.println("Profile editing cancelled.");
        }

        input.close();
    }

    public static void displayProfileInformation(String username, String fullName, int age, String address) {
        System.out.println("\nProfile Information:");
        System.out.println("Username: " + username);
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void updateProfileInformation(String username, String fullName, int age, String address) {
        // Simulated update of the user profile in a database or storage system
        // Replace this with your actual code to update the profile information

        // Simulating the update process by assigning the new values
        fullName = sanitizeInput(fullName);
        address = sanitizeInput(address);

        // Displaying a confirmation message
        System.out.println("\nUpdating profile information for user: " + username);
        System.out.println("New Full Name: " + fullName);
        System.out.println("New Age: " + age);
        System.out.println("New Address: " + address);
    }

    public static String sanitizeInput(String input) {
        // Simulating sanitizing input by removing leading/trailing white spaces
        return input.trim();
    }
}
