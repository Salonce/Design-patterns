package org.example.Flyweight;

import org.example.FactoryMethod.Motorcycle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class AvatarPictureTest {


    private Image image;
    private AvatarPicture avatarPicture;
    int faceType = 0;
    int x = 5;
    int y = 15;

    @BeforeEach
    void setUp(){
        this.image = Mockito.mock(Image.class);
        this.avatarPicture = new AvatarPicture(image, faceType);
    }

    @Test
    void draw() {
        Assertions.assertEquals(avatarPicture.draw(x, y), "Drawing avatar picture, type number " + faceType + " in coordinates: " + x + ", " + y + ".");
    }
}