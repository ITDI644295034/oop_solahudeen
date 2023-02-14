package chap4;

public class Sale {

    public double Comm, Sum;
    String id, Name, surname;
    int classs;
    public double total;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getClasss() {
        return classs;
    }

    public void setClasss(int classs) {
        this.classs = classs;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void type(int x, double y) {
//        Employee em = new Employee();
        if (x == 1) {
            System.out.print("Sale Class: " + x + "\t");
            if (y < 10000) {
                Comm = y * 0.05;
                System.out.print("Sale Total: " + y + "\t");

            }
            if (y >= 10000) {
                Comm = y * 0.10;
                System.out.print("Sale Total: " + y + "\t");

            }
            Sum += y;
        }
        if (x == 2) {
            System.out.print("Sale Class: " + x + "\t");
            if (y < 10000) {
                Comm = y * 0.15;
                System.out.print("Sale Total: " + y + "\t");

            }
            if (y >= 10000) {
                Comm = y * 0.20;
                System.out.print("Sale Total: " + y + "\t");

            }
            Sum += y;

        }
        if (x == 3) {
            System.out.print("Sale Class: " + x + "\t");
            if (y < 10000) {
                Comm = y * 0.25;
                System.out.print("Sale Total: " + y + "\t");

            }
            if (y >= 10000) {
                Comm = y * 0.30;
                System.out.print("Sale Total: " + y + "\t");

            }
            Sum += y;

        }
        if (x > 3) {
            System.out.print("Sale Class: " + x + "\t");
            if (y < 10000) {
                y = 0;
                Comm = 0;
                System.out.print("Sale Total: " + y + "\t");

            }
            if (y >= 10000) {
                Comm = 0;
                y = 0;
                System.out.print("Sale Total: " + y + "\t");

            }
            Sum += y;

        }

    }

}

