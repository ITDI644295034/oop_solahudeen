package skill;

import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {
        int numA, numB;
        Scanner sc = new Scanner(System.in);
        numA = sc.nextInt();
        numB = sc.nextInt();
        System.out.println(numA + " + " + numB+" = " + (numA+numB));
        System.out.println(numA + " - " + numB+" = " + (numA-numB));
        System.out.println(numA + " * " + numB+" = " + (numA*numB));
        System.out.println(numA + " / " + numB+" = " + (numA/numB));

    }
}
