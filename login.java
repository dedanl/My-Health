import java.util.Scanner;

public class LoginScreen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Login Screen!");

        System.out.print("Enter your username: ");
        String username = input.nextLine();

        System.out.print("Enter your password: ");
        String password = input.nextLine();

        if (login(username, password)) {
            System.out.println("Login successful! Welcome, " + username + "!");
            // Proceed with the rest of your application logic
        } else {
            System.out.println("Invalid username or password. Please try again.");
            // Handle unsuccessful login, such as displaying an error message or redirecting to a signup page
        }

        input.close();
    }

    public static boolean login(String username, String password) {
        // Replace this with your actual login logic
        // Example: check if the username and password match records in a database
        // You can customize this method to fit your specific authentication requirements
        String validUsername = "admin";
        String validPassword = "password";

        return username.equals(validUsername) && password.equals(validPassword);
    }
}
