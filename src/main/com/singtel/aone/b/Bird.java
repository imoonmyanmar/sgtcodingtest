package main.com.singtel.aone.b;

public class Bird extends Animal implements  Flyable,Singable,Walkable {

    @Override
    public void fly() {
        System.out.println("I am flying");

    }

    @Override
    public void sing() {

        System.out.println("I am Singing");

    }

    @Override
    public void walk() {

        System.out.println("I am walking");


    }


}