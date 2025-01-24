package org.example.Iterator;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup implements Aggregate<Student>{
    private ArrayList<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    @Override
    public Iterator<Student> createIterator(){
        return new StudentIterator(students);
    }
}
