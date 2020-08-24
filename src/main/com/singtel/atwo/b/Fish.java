package main.com.singtel.atwo.b;

public class Fish extends AquaticAnimal {

    protected enum Size {LARGE, SMALL};
    protected enum Colour {GREY, ORANGE};
    protected Size size;
    protected Colour colour;

    public Fish(){

    }

    public Size getSine() {
        return size;
    }
    public void setSine(Size size) {
        this.size = size;
    }
    public Colour getColour() {
        return colour;
    }
    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Fish(Size size, Colour colour){
        this.size = size;
        this.colour = colour;
    }


}
