package chap4;

public class Employee {
    public double Bonus;
    String id, Name, surname;
    int position;
    double salary;

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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void type(int x, double y) {
//        Employee em = new Employee();
        if (x == 1) {

            System.out.print("Position: " + "Manager" + "\t");
            if (y < 10000) {
                Bonus = y * 0.05;

            }
            if (y >= 10000) {
                Bonus = y * 0.10;

            }
        }
        if (x == 2) {
            System.out.print("Position: " + "Assistant Manager" + "\t");
            if (y < 10000) {
                Bonus = y * 0.15;

            }
            if (y >= 10000) {
                Bonus = y * 0.20;

            }

        }
        if (x == 3) {
            System.out.print("Position: " + "General" + "\t");
            if (y < 10000) {
                Bonus = y * 0.25;
                ;
            }
            if (y >= 10000) {
                Bonus = y * 0.30;
            }
        }
    }

}
