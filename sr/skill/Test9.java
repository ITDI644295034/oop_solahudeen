package skill;

import java.util.Scanner;

public class Test9 {

    public static void main(String[] args) {
        int numA, numB, min, max;
        Scanner sc = new Scanner(System.in);
        numA = sc.nextInt();
        numB = sc.nextInt();

        if (numA < numB) {
            min = numA;
        }
        if (numA > numB) {
            max = numA;
        }
    }

}
