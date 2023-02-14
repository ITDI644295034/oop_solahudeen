package chap6;

public class CallPolyScope {
    public static void main(String[] args) {
        Boat st = new Submarine();
        ((Submarine) st).move(); ;
        // 1

        Submarine ss =  (Submarine) st ;
        ss.move();
        // 2
    }
}
