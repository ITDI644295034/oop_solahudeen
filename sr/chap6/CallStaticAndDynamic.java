package chap6;

public class CallStaticAndDynamic {
    public static void main(String[] args) {
        Boat bt  = new Boat();
        System.out.println("Name : "+bt.owner);
        bt.showOwner();
        Boat rt = new Rowboat();
        System.out.println("Name : "+rt.owner);
        rt.showOwner();
    }
}