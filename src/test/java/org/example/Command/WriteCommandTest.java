package org.example.Command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WriteCommandTest {

    private StringBuilder document;
    private Command command;

    @BeforeEach
    void setup(){
        document = new StringBuilder();
        command = new WriteCommand(document, "testText");
    }

    @Test
    void execute() {
        assertEquals("", document.toString());
        command.execute();
        assertEquals("testText", document.toString());
        command.execute();
        assertEquals("testTexttestText", document.toString());
    }

    @Test
    void undo() {
        assertEquals("", document.toString());
        command.execute();
        assertEquals("testText", document.toString());
        command.execute();
        assertEquals("testTexttestText", document.toString());
        command.undo();
        assertEquals("testText", document.toString());
        command.undo();
        assertEquals("", document.toString());
        assertThrows(IndexOutOfBoundsException.class, () -> command.undo());
    }
}