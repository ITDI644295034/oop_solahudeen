package chap5;

public class Monitor {
    String name;

    public Monitor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "name='" + name + '\'' +
                '}';
    }
}
