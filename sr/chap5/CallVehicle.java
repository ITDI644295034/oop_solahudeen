package chap5;

public class CallVehicle {
    public static void main(String[] args) {
        Car c = new Car();
        c.color = "red";
        c.brand = "Ford";
        c.size = "mediam";
        System.out.println("------Attribute-------");
        System.out.println("Color : " + c.color);
        System.out.println("Brand : " + c.brand);
        System.out.println("Size : " + c.size);
        System.out.println("------method-------");
        c.start();
        c.stop();
        c.pause();
        c.move();
    }
}
