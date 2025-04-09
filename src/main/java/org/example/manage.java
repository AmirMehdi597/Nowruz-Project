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
    private static ArrayList<String> artistList = new ArrayList<>();


    public static boolean signUp(String username, String password) {
        for (User user : users) {
            if (user.username.equals(username)) {
                System.out.println("This username is already in use.");
                return false;
            }
        }
        users.add(new User(username, password));
        System.out.println("Registration was successful.");
        return true;
    }

    public static boolean login(String username, String password) {
        for (User user : users) {
            System.out.println();
            if (user.username.equals(username) && user.password.equals(password)) {
                System.out.println("Everything is ok.");
                return true;
            }
        }
        System.out.println("Username or password is incorrect.");
        return false;
    }

    public static void addArtist(String artistName) {
        System.out.println("Please enter the name of the artist you would like to add.");
        artistList.add(artistName);
    }

    public static void searchArtist(String artistName) {
        if (artistList.contains(artistName)) {
            System.out.println("Artist found: " + artistName);
        } else {
            System.out.println("Artist not found.");
        }
    }

    public static void authenticate() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Please pick who you are");
        scanner.nextLine();
        System.out.println("1-User\n2-Artist");
        int choice = scanner.nextInt();
        System.out.println("Do you want to login or sign up?");
        System.out.println("1- Login");
        System.out.println("2- Sign up");
        int choice2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        if (choice == 1) {
        if (choice2 == 1) {
            if (login(username, password)) {
                Main.user = new Person();
                System.out.println("Login successful");
            } else {
                System.out.println("Login failed");
            }
        } else if (choice2 == 2) {
            if (signUp(username, password)) {
                System.out.println("Sign up successful");
            } else {
                System.out.println("Sign up failed");
            }
        }else {
            System.out.println("Please enter the correct choice");
        }
    }
        else if(choice == 2) {
            if (choice2 == 1) {
                if (login(username, password)) {
                    System.out.println("Login successful");
                    Main.user = new Artist();
                } else {
                    System.out.println("Login failed");
                }
            } else if (choice2 == 2) {
                if (signUp(username, password)) {
                    System.out.println("Sign up successful");
                    addArtist(username);
                } else {
                    System.out.println("Sign up failed");
                }
            }else {
                System.out.println("Please enter the correct choice");
            }
        }
    }

}


