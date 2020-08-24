package main.com.singtel.aone.a;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BirdTest {

    @BeforeEach
    void setUp() {

        System.out.println("BirdSubClass: @Before method invoked.");
    }

    @AfterEach
    void tearDown() {
        System.out.println("BirdSubClass: @After method invoked.");
    }

    @Test
    void walk() {
        System.out.println("BirdSubClass: @walk method invoked.");
    }

    @Test
    void fly() {
        System.out.println("BirdSubClass: @fly method invoked.");
    }

    @Test
    void sing() {
        System.out.println("BirdSubClass: @sing method invoked.");
    }
}