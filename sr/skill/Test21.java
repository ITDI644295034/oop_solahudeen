package skill;

import java.util.Scanner;

public class Test21 {

    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num >= 0 && num <= 100) {
            System.out.println("B");
        } else if (num < 0) {
            System.out.println("Error : Value must be greater than or equal to 0.");

        } else {
            System.out.println("Error : Value must be less than or equal to 100.");
        }
    }
}
