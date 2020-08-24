package main.com.singtel.atwo.b;

import java.util.ArrayList;

public class SolutionTestE {

    static ArrayList<Animal> animals;
    public static void main(String[] args) {
        animals = new ArrayList<Animal>();
        animals.add(AnimalFactory.getAnimal("BIRD"));
        animals.add(AnimalFactory.getAnimal("DUCK"));
        animals.add(AnimalFactory.getAnimal("CHICKEN"));
        animals.add(AnimalFactory.getAnimal("PARROT"));
        animals.add(AnimalFactory.getAnimal("FISH"));
        animals.add(AnimalFactory.getAnimal("SHARK"));
        animals.add(AnimalFactory.getAnimal("CLOWNFISH"));
        animals.add(AnimalFactory.getAnimal("DOLPHIN"));
        animals.add(AnimalFactory.getAnimal("BUTTERFLY"));
        animals.add(AnimalFactory.getAnimal("CATERPILLAR"));
        animals.add(AnimalFactory.getAnimal("CAT"));
        animals.add(AnimalFactory.getAnimal("DOG"));
        animals.add(AnimalFactory.getAnimal("FROG"));

        int flycount = 0,singcount = 0,swimcount = 0,walkcount = 0;

        for(Animal animal : animals ){
            if (animal instanceof Flyable)
                flycount++;
            if(animal instanceof Swimmable)
                swimcount++;
            if(animal instanceof Singable)
                singcount++;
            if(animal instanceof Walkable)
                walkcount++;
        }

        System.out.println("No of animals that can  fly is " + flycount);
        System.out.println("No of animals that can  sing is " + singcount);
        System.out.println("No of animals that can  swim is " + swimcount);
        System.out.println("No of animals that can  walk is " + walkcount);
    }
}
