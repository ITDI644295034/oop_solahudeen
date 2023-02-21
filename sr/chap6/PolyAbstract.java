package chap6;

public class PolyAbstract {
    static void printPlane(Plane planeObject) {
        planeObject.takeoff();
        planeObject.fly();
        planeObject.landing();
    }

    public static void main(String[] args) {
        printPlane(new Boeing());
    }
}
