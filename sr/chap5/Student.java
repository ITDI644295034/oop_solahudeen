package chap5;

public class Student {
    String StudentId, StudentName;
    private Counsellor counsellor;
    private Parent parent;

    public Student(String studentId, String studentName, Counsellor counsellor, Parent parent) {
        StudentId = studentId;
        StudentName = studentName;
        this.counsellor = counsellor;
        this.parent = parent;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public Counsellor getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(Counsellor counsellor) {
        this.counsellor = counsellor;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }



    public void printDetails() {

        // ------------แบบมี to string ---------------------------
        System.out.println("StudentId: " + getStudentId());
        System.out.println("StudentName: " + getStudentName());
        System.out.println(getCounsellor());
        System.out.println(getParent());

        // ------------แบบไม่มี to string ---------------------------
//        System.out.println("Counsellor ID: " + counsellor.getCounsellorId());
//        System.out.println("Counsellor name: " + counsellor.getCounsellorName());
//        System.out.println("Telephone: " + counsellor.getTelephoneNo());
//        System.out.println("Parent name: " + parent.getParentName());
//        System.out.println("Address: " + parent.getAddress());
//        System.out.println("Telephone: " + parent.getTelephoneNo());
//        toString();


    }

    ;
}
