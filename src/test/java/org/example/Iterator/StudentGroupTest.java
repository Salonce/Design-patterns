package org.example.Iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StudentGroupTest {

    private StudentGroup studentGroup;
    private Student student1;
    private Student student2;

    @BeforeEach
    public void setup(){
        this.studentGroup = new StudentGroup();
        student1 = new Student("Martha", 15);
        student2 = new Student("Mark", 14);
    }

    @Test
    void getStudents_shouldReturnStudentsList() {
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        Assertions.assertEquals(2, studentGroup.getStudents().size());
    }

    @Test
    void addStudent_shouldIncreaseStudentsList() {
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);

        Assertions.assertEquals("Martha", studentGroup.getStudents().get(0).name());
        Assertions.assertEquals("Mark", studentGroup.getStudents().get(1).name());

    }

    @Test
    void removeStudent_shouldDecreaseStudentsList() {
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.removeStudent(student2);
        Assertions.assertEquals(1, studentGroup.getStudents().size());
    }

    @Test
    void createIterator_shouldReturnIteratorWithStudents() {
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        Iterator<Student> iterator = studentGroup.createIterator();
        Assertions.assertEquals(student1, iterator.next());
        Assertions.assertEquals(student2, iterator.next());
        Assertions.assertThrows(NoSuchElementException.class, () -> iterator.next());
    }
}