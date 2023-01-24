package chap5;

public class Student {
    String StudentId,StudentName;
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

    @Override
    public String toString() {
        return "Student{" +
                "StudentId='" + StudentId + '\'' +
                ", StudentName='" + StudentName + '\'' +
                ", counsellor=" + counsellor +
                ", parent=" + parent +
                '}';
    }

    public void printDetails(){
            System.out.println("StudentId: "+getStudentId());
        System.out.println("StudentName: "+getStudentName());
        System.out.println(getCounsellor());
        System.out.println(getParent());
//        System.out.println("Counsellor name:"+getCounsellor());
//        System.out.println("Telephone:"+getCounsellor());
//        System.out.println("Address:"+getCounsellor());
//        System.out.println("Telephone:"+getCounsellor());
//        toString();


        };
}
