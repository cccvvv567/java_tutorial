import java.util.Scanner;  // Import the Scanner class

// library 函式庫
public class java_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter userage: ");
        String userAge = scanner.nextLine();  // Read user input
        System.out.println("userage is: " +  (userAge + 20));  // Output user input
    }
}
