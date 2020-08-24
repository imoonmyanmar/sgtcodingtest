package main.com.singtel.aone.a;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalTest {

    @BeforeEach
    void setUp() {

        System.out.println("AnimalBaseClass: @Before walk method invoked.");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AnimalBaseClass: @After walk method invoked.");
    }

    @Test
    void walk() {
        System.out.println("AnimalBaseClass: in walk Method1()");
    }
}