package chap4;

import java.util.Scanner;


public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = sc.nextLine();


        System.out.print("Please enter your age : ");
        int age = sc.nextInt();


        System.out.print("Please enter your salry : ");
        double salary = sc.nextDouble();


        System.out.print("Employee name : " + name);
        System.out.println(", age : " + age + ", salay : " + salary);

    }
}
