// DEEPESH SRIVASTAVA
// 23070126028
// AIML A2

import java.util.*;
import exceptions.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by PRN");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Search Student by Branch");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scan.nextLine());

            try {
                switch (choice) {
                    case 1:
                        // Take input and call addStudent()
                        break;
                    // Add all other cases as in your original code
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 8);
    }
}
