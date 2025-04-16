package org.example;

public abstract class USER {
String username;
String password;

    public USER(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public abstract void like();

    public abstract void comment();

    public abstract void play();

    public abstract void showAvailableMusic();

    public void rewritelyrics(String a) {};

    public abstract void Follow(String Artistname);
}

