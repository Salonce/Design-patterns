package org.example.Flyweight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.*;

class EmojiPictureTest {

    private Image image;
    private EmojiPicture emojiPicture;
    private int emojiType = 6;
    private int x = 11;
    private int y = 15;

    @BeforeEach
    void setUp(){
        this.image = Mockito.mock(Image.class);
        this.emojiPicture = new EmojiPicture(image, emojiType);

    }

    @Test
    void draw() {
        Assertions.assertEquals("Drawing emoji, type number " + emojiType + " in coordinates: " + x + ", " + y + ".", emojiPicture.draw(x, y));
    }
}