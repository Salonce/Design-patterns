package org.example.Flyweight;

import java.awt.*;

public class EmojiPicture implements Picture {
    private Image image;
    int emojiType;

    public EmojiPicture(Image image, int emojiType){
        this.image = image;
        this.emojiType = emojiType;
    }

    @Override
    public String draw(int x, int y) {
        return "Drawing emoji, type number " + emojiType + " in coordinates: " + x + ", " + y + ".";
    }
}
