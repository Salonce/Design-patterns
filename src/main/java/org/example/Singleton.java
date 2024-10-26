package org.example;

public class Singleton {
    private static Singleton singleton;

    private Singleton(){
        this.value = 0;
    }

    public static Singleton getSingleton(){
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

    private int value;

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
