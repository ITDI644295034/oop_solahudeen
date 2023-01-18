package chap3;

public class Circle {
    private double radius;

    public Circle(double rad) {
        this.radius = rad;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }

    public double computeDiameter() {
        return 2 * radius;
    }
}
