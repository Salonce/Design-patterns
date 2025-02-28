package org.example.Flyweight;

import java.awt.*;

public class AvatarPicture implements Picture {
    private Image image;
    int faceType;

    public AvatarPicture(Image image, int faceType){
        this.image = image;
        this.faceType = faceType;
    }

    @Override
    public String draw(int x, int y) {
        return "Drawing avatar picture, type number " + faceType + " in coordinates: " + x + ", " + y + ".";
    }
}
