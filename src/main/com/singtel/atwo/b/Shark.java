package main.com.singtel.atwo.b;

public class Shark  extends Fish{

    public Shark(){}

    public Shark(Size sz, Colour c) {
        super(sz, c);
        // TODO Auto-generated constructor stub
    }

    public void eat(Fish f){
        if(f instanceof ClownFish)
            System.out.println("Shark  can eat clown fish");
        else
            System.out.println("Shark  can eat other fish");
    }
}
