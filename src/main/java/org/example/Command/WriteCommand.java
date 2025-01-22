package org.example.Command;

public class WriteCommand implements Command{
    private StringBuilder document;
    private String text;

    public WriteCommand(StringBuilder document, String text){
        this.document = document;
        this.text = text;
    }

    @Override
    public void execute() {
        document.append(text);
    }

    @Override
    public void undo() {
        document.delete(document.length() - text.length(), document.length());
    }
}
