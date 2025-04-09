package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Admin {

    void checkrequest(String requestnotif) {
        System.out.println("Your request is " + requestnotif);
        System.out.println("Admin accepted this request");
    }

    boolean checkactivity(String artistname) {
        return true;
    }

    void checkMusicAge(String Artistname, String addedDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime addedDate = LocalDateTime.parse(addedDateTime, formatter);
        LocalDateTime currentDate = LocalDateTime.now();
        long daysBetween = ChronoUnit.DAYS.between(addedDate, currentDate);
        if (daysBetween <= 30) {
            System.out.println("Every thing is ok");
        }
        else {
            System.out.println("Artist " + Artistname + " has no activity this month");
        }
    }
}
