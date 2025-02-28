package org.example.Flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PictureFactory {
    private Map<String, Picture> pictureMap = new HashMap<>();

    public Picture getPicture(String key){
        if (pictureMap.containsKey(key)){
            return pictureMap.get(key);
        }
        else if (key.equals("smilingEmoji")){
            Picture picture = new EmojiPicture(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/" + "Flyweight/smilingEmoji.png")), 1);
            pictureMap.put("smilingEmoji", picture);
            return picture;
        }
        else if (key.equals("firstAvatar")){
            Picture picture = new AvatarPicture(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/" + "Flyweight/firstAvatar.png")), 1);
            pictureMap.put("firstAvatar", picture);
            return picture;
        }
        else{
            throw new IllegalArgumentException("Requested invalid picture key.");
        }
    }
}
