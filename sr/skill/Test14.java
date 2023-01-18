package skill;

import java.util.Scanner;
import java.lang.Math;

public class Test14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        int A = 0, B = 0;
        int min = 999999, max = 0;
        A = sc.nextInt();
        B = sc.nextInt();
//            if (A > max) {
//                max = num;
//            }
//            if (num < min) {
//                min = num;
//            }
//            i++;

        if (A > max) {
            max = A;

        }
        if (B > max) {
            max = B;

        }

        if (A==B) {
            System.out.println("AB");
        }if (A>B) {
            System.out.println("A");
        }if (A<B) {
            System.out.println("B");
        }
    }


}
