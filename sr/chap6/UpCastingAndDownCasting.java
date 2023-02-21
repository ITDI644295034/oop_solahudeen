package chap6;

public class UpCastingAndDownCasting {
    static void display(Personnel[] person) {
        for (int i = 0; i < person.length; i++) {
            person[i].printName();
            person[i].getAddress();
//            person[i].getDepartment() ;
            if (person[i] instanceof Manager) {
                ((Manager) person[i]).getDepartment();
            }
        }
    }

    public static void main(String[] args) {
        Personnel psArr[] = new Personnel[2];
        psArr[0] = new Manager();
        psArr[1] = new Personnel();
        display(psArr);
    }
}
