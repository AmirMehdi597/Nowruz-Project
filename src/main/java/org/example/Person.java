package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class Person extends USER{
    private Artist artist;

    public Person(String username, String password) {
        super(username, password);
    }

    @Override
    public void rewritelyrics(String a) {
        System.out.println("which music");
        Scanner sc = new Scanner(System.in);
        String music = sc.nextLine();
        System.out.println("write your lyric");
        Scanner s = new Scanner(System.in);
        String newlyrics = s.nextLine();
        newlyrics = newlyrics.replaceAll(a, newlyrics);
    }

    @Override
   public void like() {
        Scanner s = new Scanner(System.in);
        System.out.println("which music do you want to like?");
        String music = s.nextLine();
        System.out.println("write like ");
        char choice = s.nextLine().charAt(0);
        if (choice == 'l') {
            System.out.println("You like this Song");
        }
    }

    @Override
   public void comment() {
        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();
        System.out.println("You comment this song");
    }

        @Override
        public void showAvailableMusic() {
            ArrayList<String> musiclist = artist.getMusicList();
            System.out.println("Music list for User:");
            for (int i = 0; i < musiclist.size(); i++) {
                System.out.println((i + 1) + ". " + musiclist.get(i));
            }
        }
    @Override
    public void play() {
        System.out.println("Which music do you want to play?");
        Scanner e = new Scanner(System.in);
        String music = e.nextLine();
        System.out.println("write word play");
        Scanner s = new Scanner(System.in);
        String p = s.nextLine();
        if (p.equals("play"))
            System.out.println("You played this Song");
    }
     @Override
     public void Follow(String Artistname){
     System.out.println("You followed " + Artistname);
     }

}