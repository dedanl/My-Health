import java.util.Scanner;

public class ProfileCompletion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Profile Completion!");

        System.out.print("Enter your username: ");
        String username = input.nextLine();

        System.out.print("Enter your email address: ");
        String email = input.nextLine();

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        input.nextLine(); // Clear the buffer

        System.out.print("Enter your address: ");
        String address = input.nextLine();

        System.out.println("Profile completion successful!");
        displayProfileInformation(username, email, fullName, age, address);

        input.close();
    }

    public static void displayProfileInformation(String username, String email, String fullName, int age, String address) {
        System.out.println("Profile Information:");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
