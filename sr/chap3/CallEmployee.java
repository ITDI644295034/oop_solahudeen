package chap3;

public class CallEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("034", "solahudeen", "IT", 500);
        emp.setEmpId("644295034");
        emp.setEmpName("sola");
        emp.setDepartment("djfdf");
        emp.setSalary(155.00);
        System.out.println("id : " + emp.getEmpId());
        System.out.println("Name : " + emp.getEmpName());
        System.out.println("Depart : " + emp.getDepartment());
        System.out.println("Salary : " + emp.getSalary());
    }
}
