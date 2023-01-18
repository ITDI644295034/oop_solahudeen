package skill;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Grad : ");
        num = sc.nextInt();
        if (num >= 80) {
            System.out.println("A");
        } else if (num >= 70) {
            System.out.println("B");
        } else if (num >= 60) {
            System.out.println("C");
        } else if (num >= 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
