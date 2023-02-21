package chap6;

public interface Building {
    public void draftBlueprint();

    public void interior();

    public void constuct();
}

class House implements Building {
    @Override
    public void draftBlueprint() {
        System.out.println("draftBlueprint");
    }

    @Override
    public void interior() {
        System.out.println("interior");
    }

    @Override
    public void constuct() {
        System.out.println("constuct");
    }
}