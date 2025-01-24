package org.example.Iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StudentIteratorTest {

    private StudentIterator studentIterator;

    @BeforeEach
    public void setup(){
        List<Student> students = new ArrayList<>();
        students.add(Mockito.mock(Student.class));
        students.add(Mockito.mock(Student.class));
        studentIterator = new StudentIterator(students);
    }

    @Test
    void hasNext() {
        Assertions.assertTrue(studentIterator.hasNext());
        studentIterator.next();
        Assertions.assertTrue(studentIterator.hasNext());
        studentIterator.next();
        Assertions.assertFalse(studentIterator.hasNext());
    }

    @Test
    void next() {
        studentIterator.next();
        studentIterator.next();
        Assertions.assertThrows(NoSuchElementException.class, () -> studentIterator.next());
    }
}