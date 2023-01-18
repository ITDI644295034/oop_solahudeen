package skill;

import java.util.Scanner;

public class Test12 {

    public static void main(String[] args) {
        int numA;
        Scanner sc = new Scanner(System.in);
        numA = sc.nextInt();
        for (int i = 0; i < numA; i++) {
            for (int j = 1; j <= numA - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
