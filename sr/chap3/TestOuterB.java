package chap3;

public class TestOuterB {
    public static void main(String[] args) {
        OuterB.MemberInner mem = new OuterB().new MemberInner();
        mem.inMethod1();
    }
}
