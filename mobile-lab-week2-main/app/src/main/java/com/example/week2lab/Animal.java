package com.example.week2lab;

public class Animal {
    private String type;
    private int pictureId;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }


    public Animal(String type, int pictureId) {
        this.type = type;
        this.pictureId = pictureId;
    }


}
