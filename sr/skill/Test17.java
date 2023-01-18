package skill;

import java.util.Scanner;
import java.lang.Math;

public class Test17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        int A = 0, B = 0;
        int min = 999999, max = 0;
        while (i < 2) {
            A = sc.nextInt();
            if (A > max) {
                max = A;
            }
            if (A < min) {
                min = A;
            }
            i++;

        }
        System.out.println("MAX : " + max);
        System.out.println("MIN : " + min);
    }


}
