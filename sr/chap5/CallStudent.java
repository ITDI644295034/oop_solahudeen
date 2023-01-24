package chap5;

public class CallStudent {
    public static void main(String[] args) {
        Student std = new Student("034","Sola",new Counsellor("185","Nalinee","0889551234"),new Parent("Somphong","Hatyai Songkhla","51818181"));
//        std.setCounsellor(new Counsellor("001","Nalinee","0889551234"));
//        std.setParent(new Parent("Somphong","Hatyai","0836789760"));
//        std.setStudentId("034");
//        std.setStudentName("sola");
        std.printDetails();

    }
}
