package org.example;

import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static USER user;

    public static void main(String[] args) {
        System.out.println("Welcome to the Genius Website");
        while (true) {
            System.out.println("What can this website do for you");
            System.out.println("1-Regestration\n2-WebSearching\n3-Your Account\n4-Exit");
            Scanner c = new Scanner(System.in);
            int choice = c.nextInt();
            if (choice == 1) {
                manage.authenticate();
            }
             else if (choice == 2) {
                System.out.println("Please pick who you are");
                System.out.println("1-user\n2-Artist");
                Scanner s = new Scanner(System.in);
                int choose = s.nextInt();
                if (choose == 1) {
                    System.out.println("please search for your artist");
                    Scanner s1 = new Scanner(System.in);
                    String Artistname = s1.nextLine();
                    manage.searchArtist(Artistname);
                        user.showAvailableMusic();
                        int choose2 = s.nextInt();
                        System.out.println("1-Like\n2-Comment\n3-EditLyrics");
                        int choose3 = s.nextInt();
                        if (choose3 == 1) {
                            user.like();
                        } else if (choose3 == 2) {
                            user.comment();
                        } else if (choose3 == 3) {
                            user.rewritelyrics();
                        }

                     else if (choose == 2) {
                        System.out.println("please search for your artist");
                        Scanner s2 = new Scanner(System.in);
                        String Artistname2 = s1.nextLine();
                        manage.searchArtist(Artistname2);
                            Person name2 = new Person();
                           user.showAvailableMusic();
                            int choose6 = s.nextInt();
                            System.out.println("1-Like\n2-Comment");
                            int choose7 = s.nextInt();
                            if (choose7 == 1) {
                                user.like();
                            } else if (choose7 == 2) {
                                user.comment();
                            }
                        }
                    else if (choose == 3) {
                        System.out.println("thanks for choosing us");
                        return;
                    }
                }
            }
        }
    }
}