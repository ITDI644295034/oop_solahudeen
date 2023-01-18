package chap3;

public class PassByReferenceExample {
    static  void chanegeGirlReference(Girl girl) {
        girl.phoneNo = "548155545";
        System.out.println("Girl ob = "+girl);

    }
    public static void main(String[] args) {
        System.out.println("Before");
        Girl gl = new Girl("Supa", "085526454");
        gl.print();
        System.out.println("BF gl ob = "+gl);
        System.out.println("After");
        chanegeGirlReference(gl);
        gl.print();
    }
}

