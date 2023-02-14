package chap6;

public class Boat {
    String owner = "Someone";

    void showOwner() {
        System.out.println("Boat : owner = " + owner);
    }
}

class Rowboat extends Boat {
    String owner = "Joey";

    @Override
    void showOwner() {
        System.out.println("Boat : owner = " + owner);
    }
}