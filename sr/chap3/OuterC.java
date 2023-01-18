package chap3;

public class OuterC {
    int outAtt1 = 5;
    static int outAtt2 = 0;

    void outMethod1() {
        System.out.println("OuterA : outMethod1");
    }

    static void outMethod2() {
        System.out.println("OuterB : outMethod2");
    }

     void outMethod3() {
        class MYLocalInner {
            void showDetails() {
                System.out.println("showDetails()");
            }
        } //end class
        new MYLocalInner().showDetails();
    }

     void outMethod4() {
        class LocalInner {
            void showDetails() {
                System.out.println("showDetails()");
            }
        } //end class
        new LocalInner().showDetails();
    }
} //end
