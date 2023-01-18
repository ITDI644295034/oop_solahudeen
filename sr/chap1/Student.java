package chap1;

public class Student {
    protected String studentID;
    protected String studentName;
    protected String faculty;
    protected String major;

    void print() {
        System.out.println("id : " + studentID);
        System.out.println("name : " + studentName);
        System.out.println("fact : " + faculty);
        System.out.println("major : " + major);

    }

    public Student() {
        System.out.println("Default Con");
    }


    public Student(String studentID, String studentName, String faculty, String major) {
        System.out.println("-------------------");
        System.out.println("Overlioding Con");
        this.studentID = studentID;
        this.studentName = studentName;
        this.faculty = faculty;
        this.major = major;
    }


    public void enrollment(String studentID) {
        System.out.println("enrollment");
    }

    public void payment(String studentID) {
        System.out.println("Mom-payment-package");

    }

    public void addCourse(String studentID) {
        System.out.println("addCourse");

    }

    public void dropCourse(String studentID) {
        System.out.println("dropCourse");

    }


}
