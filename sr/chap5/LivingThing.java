package chap5;

public class LivingThing {
    protected String name = "LiveThing";

    public void grow() {
        System.out.println("LivingThing:grow");
    }

    public void reproduce() {
        System.out.println("LivingThing:reproduce");
    }

}

class Animal extends LivingThing {
    private String color;
    protected int leg;

    public void move() {
        System.out.println("Animal:move");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color + "Animal";
    }


}

class Dog extends Animal {
    protected int leg = 4;
    public void bark() {
        System.out.println("bark");
    }
    @Override
    public void move() {
        super.move();
    }
}

class Worm extends Animal {
    public void eat() {

    }
}

class Bee extends Animal {
    public void breathe() {

    }
}

class Plant extends LivingThing {
    private String type;
}
