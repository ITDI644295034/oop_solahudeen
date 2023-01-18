package skill;

import java.util.Scanner;
import java.lang.Math;

public class Test13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();
        float c = s.nextFloat();
        float d = s.nextFloat();
        float e = s.nextFloat();
        System.out.println("THAI = " + a);
        System.out.println("MATH = " + b);
        System.out.println("ENGLISH = " + c);
        System.out.println("SCIENCE = " + d);
        System.out.println("SPORT = " + e);
        System.out.println("---");
        System.out.println("GPA = " + (a + b + c + d + e) / 5);
    }
}
