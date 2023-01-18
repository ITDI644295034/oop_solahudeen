package skill;

import java.util.Scanner;

public class Test10 {

    public static void main(String[] args) {
        int age;
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        age = sc.nextInt();
        int sumAge = 2023 - age;
        if (sumAge >= 18) {
            System.out.println("Welcome " + name + " to NongGipsy Pub \n"+ age);
        }
        else {
            System.out.println("You shall not pass!");
        }


    }

}
