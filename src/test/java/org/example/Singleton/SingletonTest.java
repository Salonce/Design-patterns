package org.example.Singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SingletonTest {

    @Test
    void getSingleton() {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        Assertions.assertSame(singleton1, singleton2, "getSingleton() should return the same instance each time");
    }

    @Test
    void getSetValue() {
        Singleton singleton1 = Singleton.getSingleton();
        Assertions.assertEquals(0, singleton1.getValue(), "Initial value should be 0");

        int val = 5;
        singleton1.setValue(val);
        Assertions.assertEquals(val, singleton1.getValue());

        val = -12;
        singleton1.setValue(val);
        Assertions.assertEquals(val, singleton1.getValue());

        Singleton singleton2 = Singleton.getSingleton();
        Assertions.assertEquals(val, singleton2.getValue(), "Value should be consistent across singleton instances");
    }


}