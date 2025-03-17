package org.example.Flyweight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PictureFactoryTest {

    private PictureFactory pictureFactory;
    private Picture picture1;
    private Picture picture2;

    @BeforeEach
    void setUp(){
        this.pictureFactory = new PictureFactory();
    }

    @Test
    void FlyWeightSamePicture() {
        picture1 = pictureFactory.getPicture("smilingEmoji");
        picture2 = pictureFactory.getPicture("smilingEmoji");
        Assertions.assertSame(picture1, picture2);
    }

    @Test
    void otherTest(){

    }
}