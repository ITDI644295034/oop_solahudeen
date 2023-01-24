package chap5;

public class Case {
    String name;

    public Case(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Case{" +
                "name='" + name + '\'' +
                '}';
    }
}
