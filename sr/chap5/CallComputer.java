package chap5;

public class CallComputer {
    public static void main(String[] args) {
        Computer pc = new Computer();
        pc.setCasee(new Case("ITX"));
        pc.setMonitor(new Monitor("Dell 24inch"));
        System.out.println("Case: " + pc.getCasee());

        System.out.println("Moniter: "+pc.getMonitor() );
    }
}
