package chap5;

public class CallStudent {
    public static void main(String[] args) {
        Student std = new Student("034", "Sola", new Counsellor("185", "Nalinee", "0889551234"), new Parent("Somphong", "Hatyai Songkhla", "51818181"));
//
//
//
        // ------------แบบไม่มี to string ---------------------------
//        std.setCounsellor(new Counsellor("001","Nalinee","0889551234"));
//        std.setParent(new Parent("Somphong","Hatyai","0836789760"));
//        std.setStudentId("034");
//        std.setStudentName("sola");
//        Counsellor con = new Counsellor("185", "Nalinee", "0889551234");
//        Parent pr = new Parent("Somphong", "Hatyai Songkhla", "51818181");
//        con.setCounsellorId("034");
//        con.setCounsellorName("Nalinee");
//        con.setTelephoneNo("0889551234");
//        pr.setParentName("Somphong");
//        pr.setAddress("Hatyai Songkhla");
//        pr.setTelephoneNo("51818181");
        std.printDetails();

    }
}
