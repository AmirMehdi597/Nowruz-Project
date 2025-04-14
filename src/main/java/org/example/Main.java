package org.example;

import java.util.Scanner;

public class Main {
    public static USER user;
    public static Admin admin = new Admin();
    private static String Adminpassword = "AmirMehdiImani1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Music System");

        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Login/Sign Up");
            System.out.println("2. Admin Login");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Authenticating...");
                manage.authenticate();
                manage.checkpolicy();
                int q = scanner.nextInt();
                if (q == 1) {
                    System.out.println("\nYou are logged in as a User.");
                    userMenu(scanner);
                } else if (q == 2) {
                    System.out.println("\nYou are logged in as an Artist.");
                    artistMenu(scanner);
                }

            } else if (choice == 3) {
                System.out.println("Exiting the system. Goodbye!");
                break;
            } else if (choice == 2) {
                System.out.println("please enter admin's password:");
                String answer = scanner.nextLine();
                if (answer.equals(Adminpassword)) {
                    System.out.println("Welcome, Admin!");

                    while (true) {
                        System.out.println("\nAdmin Menu:");
                        System.out.println("1. Check Request Notification");
                        System.out.println("2. Check Artist Activity");
                        System.out.println("3. Go Back to Main Menu");

                        int adminChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch (adminChoice) {
                            case 1:
                                System.out.print("Enter request notification: ");
                                String notif = scanner.nextLine();
                                admin.checkrequest(notif);
                                break;
                            case 2:
                                System.out.print("Enter artist name: ");
                                String artistName = scanner.nextLine();
                                admin.checkactivity(artistName);
                                break;
                            case 3:
                                System.out.println("Returning to main menu...");
                                return;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                    }
                }

            }
        }
    }





    private static void userMenu(Scanner scanner) {
       Person person = (Person) user;
        while (true) {
            System.out.println("\nUser Menu:");
            System.out.println("1. Like a Song");
            System.out.println("2. Comment on a Song");
            System.out.println("3. Play a Song");
            System.out.println("4. Show Available Music");
            System.out.println("5. Follow an Artist");
            System.out.println("6. Logout");

            int userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {
                case 1:
                    user.like();
                    break;
                case 2:
                    user.comment();
                    break;
                case 3:
                    user.play();
                    break;
                case 4:
                    user.showAvailableMusic();
                    break;
                case 5:
                    System.out.print("Enter the Artist's name you want to follow: ");
                    String artistName = scanner.nextLine();
                     user.Follow(artistName);
                    break;
                case 6:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void artistMenu(Scanner scanner) {
     Artist artist = (Artist) user;

        while (true) {
            System.out.println("\nArtist Menu:");
            System.out.println("1. Add Music");
            System.out.println("2. Make an Album");
            System.out.println("3. Show Available Music");
            System.out.println("4. Logout");

            int artistChoice = scanner.nextInt();
            scanner.nextLine();

            switch (artistChoice) {
                case 1:
                    System.out.print("Enter music name: ");
                    String musicName = scanner.nextLine();
                    artist.addmusic(musicName);
                    break;
                case 2:
                    System.out.print("Enter album name: ");
                    String albumName = scanner.nextLine();
                    System.out.println("Select your music to add:");
                    String musicToAdd = scanner.nextLine();
                    artist.makeAlbum(musicToAdd);
                    break;
                case 3:
                    artist.showAvailableMusic();
                    break;
                case 4:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

