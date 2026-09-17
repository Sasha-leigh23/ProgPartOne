package progpartone;

import java.util.Scanner;

public class ProgPartOneAssignment {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. First Name & Last Name
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine().trim();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine().trim();

        System.out.println("Welcome " + firstName + " " + lastName + "its good to see you again!");

        // 2. Username Input (Up to 2 attempts)
        String username = "";
        for (int attempt = 1; attempt <= 2; attempt++) {
            if (attempt == 1) {
                System.out.print("Enter your username: ");
            } else {
                System.out.print("Enter your username again: ");
            }
            username = input.nextLine().trim();

            if (username.contains("_") && username.length() <= 5) {
                System.out.println("Username successfully captured.");
                break;
            } else {
                System.out.println("Username is not correctly formatted; please ensure that your"
                        + " username contains an underscore and is no more than 5 characters in length.");
            }
        }

        // 3. Password Input (Up to 2 attempts)
        String password = "";
        for (int attempt = 1; attempt <= 2; attempt++) {
            if (attempt == 1) {
                System.out.print("Enter your password: ");
            } else {
                System.out.print("Enter your password again: ");
            }
            password = input.nextLine().trim();

            boolean hasCap = false;
            boolean hasNum = false;
            boolean hasSpec = false;

            if (password.length() >= 8) {
                for (int i = 0; i < password.length(); i++) {
                    char c = password.charAt(i);
                    if (c >= 'A' && c <= 'Z') {
                        hasCap = true;
                    } else if (c >= '0' && c <= '9') {
                        hasNum = true;
                    } else if (c >= 'a' && c <= 'z') {
                        // skip lowercase
                    } else {
                        hasSpec = true;
                    }
                }
            }

            if (hasCap && hasNum && hasSpec) {
                System.out.println("Password successfully captured.");
                break;
            } else {
                System.out.println("Password is not correctly formatted; please ensure that the "
                        + "password contains at least 8 characters, a capital letter, a number, and a special character.");
            }
        }

        // 4. Cell Number Input (Up to 2 attempts)
        String cellnumber = "";
        for (int attempt = 1; attempt <= 2; attempt++) {
            if (attempt == 1) {
                System.out.print("Enter your cell number: ");
            } else {
                System.out.print("Enter your cell number again: ");
            }
            cellnumber = input.nextLine().trim();

            if (cellnumber.startsWith("+27") && cellnumber.length() == 12) {
                System.out.println("Cell number successfully captured.");
                break;
            } else {
                System.out.println("Cell number is incorrectly formatted or does "
                        + "not contain an international code; please correct the number and try again.");
            }
        }

        // Instantiate LogIn object using the captured values
        LogIn user = new LogIn(firstName, lastName, username, password, cellnumber);

        // 5. Login Prompt
        System.out.println("LOGIN ");
        System.out.print("Enter username to login: ");
        String loginUser = input.nextLine().trim();

        System.out.print("Enter password to login: ");
        String loginPass = input.nextLine().trim();

        boolean success = user.loginUser(loginUser, loginPass);
        System.out.println(user.returnLoginStatus(success));

        input.close();
    }
}