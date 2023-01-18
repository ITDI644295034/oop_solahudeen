package skill;

import java.util.Scanner;
import java.lang.Math;

public class Test19 {
    public static void main(String[] args) {
        kim();

    }

    public static void kim() {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        String sname = s.nextLine();
        String add = s.nextLine();
        String sex = s.nextLine();
        int tell = s.nextInt();
        System.out.println("--- Customer Detail ---");
        System.out.println("Name : "+name +sname);
        System.out.println("Address : "+add);
        System.out.println("Gender : "+sex);
        System.out.println("Tel : "+"0"+tell);
    }


}
