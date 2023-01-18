package chap3;

public class TestOuterA {
    public static void main(String[] args) {
        OuterA.StaticInner inObj = new OuterA.StaticInner();
        inObj.inMethod1();
        OuterA.StaticInner.inMethod2();
    }
}
