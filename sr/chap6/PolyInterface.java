package chap6;

public class PolyInterface {
    static void printBuilding(Building buildingObject) {
        buildingObject.draftBlueprint();
        buildingObject.constuct();
        buildingObject.constuct();
    }

    public static void main(String[] args) {
        printBuilding(new House());
    }
}
