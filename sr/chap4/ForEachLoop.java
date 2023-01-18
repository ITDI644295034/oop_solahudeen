package chap4;

import chap3.Employee;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numArr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.print("Data in numArr : ");
        Arrays.sort(numArr);
        for (int num : numArr
        ) {
            System.out.print(num + "\t");
        }
        System.out.print("\nData in strArr = ");
        String[] strArr = {"Jenny", "Jhon", "Nadia", "Lisa", "David"};
        Arrays.sort(strArr);
        for (String name : strArr
        ) {
            System.out.print(name + "\t");
        }
        System.out.print("\nMin " + numArr[0]);
        System.out.print("\nSize " + numArr.length);
        System.out.print("\nMax " + numArr[numArr.length - 1]);
//--------------------------------------------------------------------
//--------------------------------------------------------------------
//--------------------------------------------------------------------
//--------------------------------------------------------------------
//--------------------------------------------------------------------
//--------------------------------------------------------------------
        Employee em = new Employee("034", "solahudeen", "IT", 300);
        Employee emArr[] = {
                new Employee("034", "Sola", "IT", 500),
                new Employee("035", "slzk", "com", 400)
        };
        
        for (Employee myEmp : emArr
        ) {
            System.out.println("ID : " + myEmp.getEmpId());
            System.out.println("Name : " + myEmp.getEmpName());
            System.out.println("depart : " + myEmp.getDepartment());
            System.out.println("Salry : " + myEmp.getSalary());
            System.out.println("-----------------------------------");

        }

    }
}
