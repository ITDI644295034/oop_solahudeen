package chap1;

public class AirPlan {
    int register;
    String brand;
    String name;
    Float carry;
    String oil;


    static void move(int hour) {
    }

    static boolean up() {
        return true;
    }

    static boolean down() {
        return true;
    }

    static boolean turnLeft() {
        return true;
    }

    boolean turnRight() {
        return true;
    }

    void airBreak() {
    }

    public static void main(String[] args) {
        turnLeft();
    }
}

