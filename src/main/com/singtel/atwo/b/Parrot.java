package main.com.singtel.atwo.b;

public class Parrot extends Bird implements Flyable  {

    public Parrot() {

    }


    Object neighbour;

    public Parrot(Object neighbour) {
        this.neighbour = neighbour;
    }

    @Override
    public void sing() {
        // TODO Auto-generated method stub

        String sound = ((neighbour instanceof Dog)? "Woof , woof" : neighbour instanceof Cat ? "Meow" : neighbour instanceof Chicken ? "Cock-a-doodle-doo" : "Buck Buck");
        System.out.println("Parrot says " + sound);

    }

    @Override
    public void fly() {
        System.out.println("I can fly");

    }
}
