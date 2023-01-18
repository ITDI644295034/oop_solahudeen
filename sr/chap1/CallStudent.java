package chap1;

public class CallStudent {


    public static void main(String[] args) {
        Student sola = new Student();
        sola.studentID = "644295034";
        sola.studentName = "solahudeen";
        sola.faculty = "science";
        sola.major = "itdi";
        sola.enrollment("644295034");
        sola.payment("64429503");
        sola.print();

//        System.out.println("sola object = " + sola);

        Student solaOver = new Student("101", "solahudeen", "Sci", "IT");
        solaOver.print();

        Student kimOver = new Student("102", "solahudeen", "Sci", "IT");
        kimOver.print();

//        GraduateStudent nan = new GraduateStudent();
//        nan.studyLevel = "Master";
//        nan.studentName = "Solahudeen";
//        nan.studentID = "644295034";
//        nan.oralExamination("65454564");
//        nan.addCourse("5465465456");
//
//        System.out.println("nan object = " + nan);
//        nan.payment("644295034");

    }
}
