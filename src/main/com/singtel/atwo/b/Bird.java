package main.com.singtel.atwo.b;

public class Bird extends Animal implements Singable, Walkable  {


    @Override
    public void sing() {

        System.out.println("I am Singing");

    }

    @Override
    public void walk() {

        System.out.println("I am walking");


    }
}