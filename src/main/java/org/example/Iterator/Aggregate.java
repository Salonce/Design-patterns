package org.example.Iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
