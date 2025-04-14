package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Person extends USER{
    String lyrics;
    private Artist artist;

    @Override
    public void rewritelyrics() {
        this.lyrics = lyrics;
        Scanner s = new Scanner(System.in);
        String newlyrics = s.nextLine();
        newlyrics = newlyrics.replaceAll(lyrics, newlyrics);
        System.out.println("You rewrite this lyrics");
    }

    @Override
   public void like() {
        Scanner s = new Scanner(System.in);
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