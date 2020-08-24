package main.com.singtel.atwo.b;

public class SolutionTestABDE {

    public static void main(String[] args) {
	// write your code here

        // To test for Question A2 ( a,b,c,d)

        Duck duck = new Duck();
        System.out.println("------Testing for Duck song-------");
        duck.sing();
        System.out.println("----------------------------------");

        Chicken chicken = new Chicken(); // Assumption By default ( Gender is Female)
        System.out.println("------Testing for Chicken song------");
        chicken.sing();
        System.out.println("----------------------------------");

        Chicken rooster = new Chicken(); // Assumption By default ( Gender is Female)
        rooster.gender= Animal.Gender.M;
        System.out.println("------Testing for Rooster song------");
        rooster.sing();
        System.out.println("----------------------------------");

        Cat cat= new Cat();
        Dog dog= new Dog();


        System.out.println("------Testing for Parrot living with Cat------");
        Parrot parrotlivewithcat = new Parrot(cat);
        parrotlivewithcat.sing();
        System.out.println("----------------------------------");

        System.out.println("------Testing for Parrot living with Dog------");
        Parrot parrotlivewithdog = new Parrot(dog);
        parrotlivewithdog.sing();
        System.out.println("----------------------------------");

        System.out.println("------Testing for Parrot living with Rooster------");
        Parrot parrotlivewithrooster = new Parrot(rooster);
        parrotlivewithrooster.sing();
        System.out.println("----------------------------------");


        System.out.println("------Testing for Fish can Swim / fish does not implement sing and walk method------");
        Fish fish =new Fish();
        fish.swim();
        System.out.println("----------------------------------");


        System.out.println("------Testing for ClownFish------");
        ClownFish clownFish = new ClownFish(Fish.Size.SMALL, Fish.Colour.ORANGE);
        System.out.println("clownFish");
        clownFish.makeJokes();
        System.out.println("----------------------------------");

        System.out.println("------Testing for Shark------");
        Shark shark = new Shark(Fish.Size.LARGE, Fish.Colour.GREY);
        shark.eat(clownFish);
        System.out.println("----------------------------------");

        System.out.println("------Testing for Dolphin------ Dolphin doesn't extend fish class");
        Dolphin dolphin = new Dolphin();
        dolphin.swim();
        System.out.println("----------------------------------");

        System.out.println("------Testing for Butterfly------");
        Butterfly b = new Butterfly();
        b.fly();
        System.out.println("----------------------------------");


        System.out.println("------Testing for Caterpillar-");
        Catterpillar c = new Catterpillar();
        c.walk();
        System.out.println("----------------------------------");


        System.out.println("------Testing for Metamorphosis :: Caterpillar transform to ButterFly");
        Butterfly butterFlyFromCaterpillar = new Metamorphosis().trnasform(c);
        butterFlyFromCaterpillar.fly();
        System.out.println("----------------------------------");




    }
}
