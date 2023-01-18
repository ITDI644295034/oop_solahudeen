package chap1;

public class GraduateStudent extends Student {
    public String studyLevel;
    public String Adviser;

    public void oralExamination(String studentID) {
        System.out.println("oralExamination");
    }

    public void thesisExamination(String studentID) {
        System.out.println("thesisExamination");

    }

    public void payment(String studentID) {
        System.out.println("Son-payment-credit");

    }

    public static void main(String[] args) {
        Student sola = new Student();
        GraduateStudent sl = new GraduateStudent();
        sola.payment("644295034");
    }
}