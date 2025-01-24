package org.example;

import org.example.Command.Command;
import org.example.Command.WriteCommand;
import org.example.Iterator.Iterator;
import org.example.Iterator.Student;
import org.example.Iterator.StudentGroup;
import org.example.Iterator.StudentIterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup();
        studentGroup.addStudent(new Student("Mark", 15));
        studentGroup.addStudent(new Student("Derek", 15));
        studentGroup.addStudent(new Student("Martha", 16));

        Iterator<Student> studentIterator = studentGroup.createIterator();

        System.out.println("Students list: ");
        while (studentIterator.hasNext()){
            Student student = studentIterator.next();
            System.out.println("Name: " + student.name() + ", age: " + student.age());
        }
    }
}
