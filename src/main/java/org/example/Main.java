package org.example;

import org.example.Command.Command;
import org.example.Command.WriteCommand;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringBuilder document = new StringBuilder();
        Command writeAbcCommand = new WriteCommand(document, "ABC ");
        Command write123Command = new WriteCommand(document, "123 ");

        List<Command> commands = new ArrayList<>();

        writeAbcCommand.execute();
        commands.add(writeAbcCommand);

        writeAbcCommand.execute();
        commands.add(writeAbcCommand);

        write123Command.execute();
        commands.add(write123Command);

        write123Command.execute();
        commands.add(write123Command);

        write123Command.execute();
        commands.add(write123Command);

        undoLastCommand(commands);
        undoLastCommand(commands);

        System.out.println(document.toString());

    }

    private static void undoLastCommand(List<Command> commands){
        commands.get(commands.size() - 1).undo();
        commands.remove(commands.size() - 1);
    }
}
