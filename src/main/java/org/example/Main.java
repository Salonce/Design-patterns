package org.example;

import org.example.Command.Command;
import org.example.Command.WriteCommand;
import org.example.Flyweight.Picture;
import org.example.Flyweight.PictureFactory;
import org.example.Iterator.Iterator;
import org.example.Iterator.Student;
import org.example.Iterator.StudentGroup;
import org.example.Iterator.StudentIterator;
import org.example.Mediator.BlackSeaDock;
import org.example.Mediator.CoralShip;
import org.example.Mediator.Dock;
import org.example.Mediator.Ship;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PictureFactory pictureFactory = new PictureFactory();
        Picture smilingEmoji = pictureFactory.getPicture("smilingEmoji");
        smilingEmoji.draw(15, 50);

    }
}
