package org.example.Flyweight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Map;

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
        picture2 = pictureFactory.getPicture("firstAvatar");
        Assertions.assertNotSame(picture1, picture2);
    }

    @Test
    void accurateData(){
        picture1 = pictureFactory.getPicture("smilingEmoji");
        picture2 = pictureFactory.getPicture("firstAvatar");
        Assertions.assertNotNull(picture1, "Picture1 shouldn't be null.");
        Assertions.assertNotNull(picture2, "Picture2 shouldn't be null.");
        Assertions.assertTrue(picture1 instanceof EmojiPicture, "Picture1 is an instance of emoji picture.");
        Assertions.assertTrue(picture2 instanceof AvatarPicture, "Picture2 is an instance of avatar picture.");
    }

    @Test
    void invalidCallThrowsException(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> pictureFactory.getPicture("invalidKey"));
        Assertions.assertEquals("Requested invalid picture key.", exception.getMessage());
    }

    @Test
    @SuppressWarnings("unchecked")
    void cachesCorrectly() throws Exception {
        Field pictureMap = PictureFactory.class.getDeclaredField("pictureMap");
        pictureMap.setAccessible(true);
        Map<String, Picture> cache = (Map<String, Picture>) pictureMap.get(pictureFactory);

        Assertions.assertTrue(cache.isEmpty());

        pictureFactory.getPicture("smilingEmoji");
        Assertions.assertEquals(1, cache.size());

        pictureFactory.getPicture("smilingEmoji");
        Assertions.assertEquals(1, cache.size());

        pictureFactory.getPicture("firstAvatar");
        Assertions.assertEquals(2, cache.size());

        pictureFactory.getPicture("firstAvatar");
        Assertions.assertEquals(2, cache.size());

        Assertions.assertThrows(IllegalArgumentException.class, () -> pictureFactory.getPicture("invalidPicture"));
        Assertions.assertEquals(2, cache.size());
    }
}