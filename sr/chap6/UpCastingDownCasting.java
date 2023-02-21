package chap6;

public class UpCastingDownCasting {
    static void print(Boat[] boat) {
        for (int i = 0; i < boat.length; i++) {
            System.out.println("obj = " + boat[i]);
            boat[i].showOwner();
            if (boat[i] instanceof Submarine) {
                ((Submarine) boat[i]).move();
            }
        }
    }

    public static void main(String[] args) {
        Boat bt[] = new Boat[2];
        bt[1] = new Boat();
        bt[0] = new Submarine();
        print(bt);
    }
}
