package chap6;

public class ExceptionHanding1 {
    public static void main(String[] args) {
        int zero = 100, result = 0;


        try {
            result = 123 / zero;
        } catch (NullPointerException e) {
            System.out.println("Slz");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        }


        try {
            Boat bb = null;
            bb = new Boat();
            bb.showOwner();
        } catch (NullPointerException x) {
            System.out.println("Error " + x.getMessage());

        }

        try {
            int x[] = {1, 2};
            System.out.println("X[0]" + x[0]);
            System.out.println("X[1]" + x[1]);
            System.out.println("X[2]" + x[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error " + e.getMessage());

        }
    }
}
