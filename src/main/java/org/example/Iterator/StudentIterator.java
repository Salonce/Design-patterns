package org.example.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class StudentIterator implements Iterator<Student>{

    private int cur;
    private final List<Student> students;

    public StudentIterator(List<Student> students){
        this.students = students;
    }

    @Override
    public boolean hasNext(){
        return cur < students.size();
    }

    @Override
    public Student next(){
        if (hasNext())
            return students.get(cur++);
        throw new NoSuchElementException();
    }
}
