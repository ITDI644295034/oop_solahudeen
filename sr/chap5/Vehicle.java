package chap5;

public class Vehicle {
    String color, brand, size;

    void start() {
        System.out.println("Start()");

    }

    void stop() {
        System.out.println("stop()");

    }

    final void pause() {
        System.out.println("pause()");


    }

    void move() {
        System.out.println("move()");
    }
}

class Car extends Vehicle {
    String series, size;

    void changeGear() {
    }

    void move() {

    }
}

class Boat extends Vehicle {

}

class Plane extends Vehicle {
}