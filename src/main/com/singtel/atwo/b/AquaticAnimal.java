package main.com.singtel.atwo.b;

public class AquaticAnimal extends Animal implements Swimmable{
    @Override
    public void swim(){
        System.out.println("I can swim");
    }
}
