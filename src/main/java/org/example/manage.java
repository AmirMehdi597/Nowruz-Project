package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

public class manage {
    private static ArrayList<User> users = new ArrayList<>();

    public static boolean signUp(String username, String password) {
        if (username == null || username.trim().isEmpty()) {
            System.out.println("Please input username");
            return false;
        }

        if (password == null || password.length() < 8) {
            System.out.println("Password must be at least 8 characters");
            return false;
        }

        for (User user : users) {
            if (user.username.equals(username)) {
                System.out.println("This username is already in use");
                return false;
            }
        }

        users.add(new User(username, password));
        System.out.println("Registration successful");
        return true;
    }

    public static boolean login(String username, String password) {
        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                System.out.println("Login successful");
                return true;
            }
        }
        System.out.println("Username or password is incorrect");
        return false;
    }

    public static User authenticate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please pick who you are:");
        System.out.println("1 - User\n2 - Artist");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Do you want to login or sign up?");
        System.out.println("1 - Login");
        System.out.println("2 - Sign up");
        int actionChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (choice == 1 || choice == 2) {
            if (actionChoice == 1) {
                if (login(username, password)) {
                    System.out.println("Login successful as " + (choice == 1 ? "User" : "Artist"));
                } else {
                    System.out.println("Login failed");
                }
            } else if (actionChoice == 2) {
                if (signUp(username, password)) {
                    System.out.println("Sign up successful as " + (choice == 1 ? "User" : "Artist"));
                    return new User(username, password);
                } else {
                    System.out.println("Sign up failed");
                }
            }
        } else {
            System.out.println("Invalid choice. Please select a valid option.");
        }

        return null;
    }
    public static void checkpolicy(){
        System.out.println("confirm that you are human ...");
        System.out.println("write what is this code :");
        System.out.println("AQE123R");
        Scanner scanner = new Scanner(System.in);
        String policy = scanner.nextLine();
        if (policy.equals("AQE123R")) {
            System.out.println("thats write");
        }
        else {
            System.out.println("thats wrong");
            checkpolicy();
        }
        System.out.println("pick who you are again ");
        System.out.println("1.User\n2.Artist");
    }
}




