package chap6;

public class callPoly {
    static void printBoatOwner(Boat boatObject) {
        boatObject.showOwner();
    }

    public static void main(String[] args) {
        Boat bt = new Boat();
        printBoatOwner(bt);
        Boat rt = new Rowboat();
        printBoatOwner(rt);
    }
}
