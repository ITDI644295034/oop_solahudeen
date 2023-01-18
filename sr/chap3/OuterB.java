package chap3;

public class OuterB {
    int outAtt1 = 5;
    static int outAtt2 = 0;

    void outMethod1() {
        System.out.println("OuterA : outMethod1");
    }

    static void outMethod2() {
        System.out.println("OuterB : outMethod2");
    }

     class MemberInner {
        int inAtt1 = 5;
        static int outAtt2 = 0;

        void inMethod1() {
            System.out.println("StaticInner : inMethod1");
        }
    }
}
