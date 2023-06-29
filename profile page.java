import java.util.Scanner;

public class ProfilePage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Your Profile Page!");

        // Simulated user profile
        String username = "JohnDoe";
        String fullName = "John Doe";
        int age = 25;
        String address = "123 Main Street";

        displayProfileInformation(username, fullName, age, address);

        // Additional profile options
        System.out.println("\nProfile Options:");
        System.out.println("1. Edit Profile");
        System.out.println("2. View Posts");
        System.out.println("3. Logout");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                editProfile(username, fullName, age, address);
                break;
            case 2:
                viewPosts(username);
                break;
            case 3:
                logout();
                break;
            default:
                System.out.println("Invalid choice.");
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

    public static void editProfile(String username, String fullName, int age, String address) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nEditing Profile:");

        System.out.print("Full Name (current: " + fullName + "): ");
        fullName = input.nextLine();

        System.out.print("Age (current: " + age + "): ");
        age = input.nextInt();
        input.nextLine(); // Clear the buffer

        System.out.print("Address (current: " + address + "): ");
        address = input.nextLine();

        // Update the profile information
        displayProfileInformation(username, fullName, age, address);

        input.close();
    }

    public static void viewPosts(String username) {
        System.out.println("\nViewing Posts:");
        // Add your code here to display the user's posts or retrieve them from a database
        System.out.println("No posts found.");
    }

    public static void logout() {
        System.out.println("\nLogging out...");
        // Add your code here to handle the logout process, such as clearing session data or redirecting to the login page
    }
}
