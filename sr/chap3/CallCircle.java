package chap3;

public class CallCircle {
    public static void main(String[] args) {
        Circle cr = new Circle(10);

        System.out.println("Radius : " + cr.getRadius());
        System.out.println("Area : " + Math.ceil(cr.computeArea()));
        System.out.println("Circumference : " + Math.floor(cr.computeCircumference()));
        System.out.println("Diameter : " + cr.computeDiameter());
    }
}

