package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Artist extends USER{
    private String musicname;
    private static ArrayList<String> musiclist;

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
        char choice = s.nextLine().charAt(0);
        if (choice == 'c') {
            String comment = s.nextLine();
            System.out.println("You comment this Song");
        }
    }

    @Override
    public void play() {
    System.out.println("You played this Song");
    }

    void music(){
        System.out.println("music name:" + musicname);
    }

    void musiclyric(){
        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();
        System.out.println("your lyrics upload successfully");
    }

    void makeAlbum(String musicname){
        Scanner s = new Scanner(System.in);
        String Allbumname = s.nextLine();
        System.out.println("your album name:" + Allbumname);
        System.out.println("your album music name:" + musicname);
    }

    void addmusic(String musicname) {
        Scanner s = new Scanner(System.in);
        s.nextInt();
        musiclist.add(musicname);
        System.out.println("music:" +  musicname + "added");
    }

    @Override
    public void showAvailableMusic() {
        System.out.println("Available Music Names:");
        for(int i = 0; i < musiclist.size(); i++){
        System.out.println((i + 1) + ". " + musiclist.get(i));
        }
    }

    @Override
    public void Follow(String Artistname) {
        System.out.println("You followed " + Artistname);
    }

    public static ArrayList<String> getMusicList() {
        return musiclist;
    }
}