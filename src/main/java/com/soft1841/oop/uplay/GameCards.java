package com.soft1841.oop.uplay;

public class GameCards {
    private String picture;
    private String name;

    public GameCards(String picture, String name) {
        this.picture = picture;
        this.name = name;
    }

    public GameCards() {
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GameCards{" +
                "picture='" + picture + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
