package chap6;

public class Personnel {
    String name = "Personnel";

    void printName() {
        System.out.println("printName : Personnel");
    }
    void getAddress() {
        System.out.println("getAddress : Personnel");
    }
}

class Manager extends Personnel {
    String name = "manager";

    @Override
    void printName() {
        System.out.println("printName : Manager");
    }
    void getDepartment() {
        System.out.println("getDepartment : Manager");
    }

}

class Staff extends Personnel {
    String name = "Staff";

    @Override
    void printName() {
        System.out.println("printName : Staff");
    }
}