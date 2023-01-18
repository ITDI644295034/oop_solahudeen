package chap3;

public class OuterA {
    int outAtt1 = 5;
    static int outAtt2 = 0;

    void outMethod1() {
        System.out.println("OuterA : outMethod1");
    }

    static void outMethod2() {
        System.out.println("OuterB : outMethod2");
    }

    static class StaticInner {
        int inAtt1 = 5;
        static int outAtt2 = 0;

        void inMethod1() {
            System.out.println("StaticInner : inMethod1");
        }

        static void inMethod2() {
            System.out.println("StaticInner : inMethod2");
        }

    }


}//end outer
