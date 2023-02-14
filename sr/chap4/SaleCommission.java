package chap4;

import java.util.*;

public class SaleCommission {
    static void printMenu() {
        System.out.println("\n\n------MENU--------");
        System.out.println("0 : Exit");
        System.out.println("1 : Sale Information Entry");
        System.out.println("2 : Commission Summary");
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        double sumSalary = 0.0, bonusTotal = 0.0;
        ArrayList<Sale> list = new ArrayList<Sale>();
        do {
            printMenu();
            System.out.print("Please Enter menu [0-2] : ");
            menu = sc.nextInt();
//            if (menu > 2) {
//                menu = 0;
//                System.out.println("No in Menu");
//            }
            switch (menu) {
                case 1 -> {
                    Sale sl = new Sale();
                    System.out.println("------Information Entry-------");
                    System.out.print("Enter ID : ");
                    String id = sc.next();
                    System.out.print("Enter Name : ");
                    String name = sc.next();
                    System.out.print("Enter Surname : ");
                    String surname = sc.next();
                    System.out.print("Enter Sale Class : ");
                    int classs = sc.nextInt();
                    System.out.print("Enter Sale Total : ");
                    double total = sc.nextDouble();
                    sl.setId(id);
                    sl.setName(name);
                    sl.setSurname(surname);
                    sl.setClasss(classs);
                    sl.setTotal(total);
                    list.add(sl);
                    break;
                }
                case 2 -> {
                    Sale sl = new Sale();
                    for (Sale i : list
                    ) {
                        System.out.println("\n");
                        System.out.print("ID: " + i.getId() + "\t");
                        System.out.print("Name: " + i.getName() + "\t");
                        System.out.print("Surname: " + i.getSurname() + "\t");
                        sl.type(i.getClasss(), i.getTotal());
//                        System.out.print("Salary: " + (int) i.getSalary() + "\t");
                        System.out.print("Commission: " + (int) sl.Comm + " Bath" + "\t");
//                        sumSalary = sumSalary + i.getSalary();
                        bonusTotal += sl.Comm;
                    }
                    System.out.println("\n--------SUMMARY--------------");
                    System.out.println("Sale Count : " + list.size());
                    System.out.println("Sale Total = " + (int) sl.Sum + " Bath");
                    System.out.println("Commission Total = " + (int) bonusTotal + " Bath");
                    break;
                }
            }
        } while (menu != 0);
    }
}
