package chap4;

import javax.xml.namespace.QName;
import java.util.*;

import static java.util.Collections.list;

public class EmployeeBonus {

    static void printMenu() {
        System.out.println("\n\n------MENU--------");
        System.out.println("0 : Exit");
        System.out.println("1 : Employee Information Entry");
        System.out.println("2 : Employee Summary");
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        double sumSalary = 0.0, bonusTotal = 0.0;

        ArrayList<Employee> list = new ArrayList<Employee>();
        do {
            printMenu();
            System.out.print("Please Enter menu [0-2] : ");
            menu = sc.nextInt();

            switch (menu) {
                case 1 -> {
                    Employee em = new Employee();
                    System.out.println("------Information Entry-------");
                    System.out.print("Enter ID : ");
                    String id = sc.next();
                    System.out.print("Enter Name : ");
                    String name = sc.next();
                    System.out.print("Enter Surname : ");
                    String surname = sc.next();
                    System.out.print("Enter Type : ");
                    int type = sc.nextInt();
                    System.out.print("Enter salary : ");
                    double salary = sc.nextDouble();
                    em.setId(id);
                    em.setName(name);
                    em.setSurname(surname);
                    em.setPosition(type);
                    em.setSalary(salary);
                    list.add(em);

                }
                case 2 -> {
                    Employee em = new Employee();
                    for (Employee i : list
                    ) {
                        System.out.println("\n");
                        System.out.print("ID: " + i.getId() + "\t");
                        System.out.print("Name: " + i.getName() + "\t");
                        System.out.print("Surname: " + i.getSurname() + "\t");
                        em.type(i.getPosition(), i.getSalary());
                        System.out.print("Salary: " + (int) i.getSalary() + "\t");
                        System.out.print("Bonus: " + (int) em.Bonus + " Bath" + "\t");
                        sumSalary = sumSalary + i.getSalary();
                        bonusTotal += em.Bonus;
                    }
                    System.out.println("\n--------SUMMARY--------------");
                    System.out.println("Employee Count : " + list.size());
                    System.out.println("Salary Total = " + (int) sumSalary + " Bath");
                    System.out.println("Bonus Total = " + (int) bonusTotal + " Bath");

                }
            }
        } while (menu != 0);
    }

}
