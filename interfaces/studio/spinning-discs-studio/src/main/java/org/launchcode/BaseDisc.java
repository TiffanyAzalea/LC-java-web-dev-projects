package org.launchcode;

public abstract class BaseDisc {

    private static int nextID = 1;

    private final int id;

    private String name;
    private String discType;
    private int spinRate;

    public BaseDisc(int id, String name, String discType, int spinRate) {
        this.id = nextID;
        this.name = name;
        this.discType = discType;
        this.spinRate = spinRate;
        nextID++;
    }

    public static int getNextID() {
        return nextID;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getSpinRate() {
        return spinRate;
    }

    public void setSpinRate(int spinRate) {
        this.spinRate = spinRate;
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        String asterisks = "*****";
        return newLine + asterisks + " " + name + " " + asterisks + newLine +
                "ID: " + id + newLine +
                "Disc Type: " + discType + newLine +
                "Spin Rate: " + spinRate + "RPM" + newLine;
    }

    void spinDisc() {
        String newLine = System.lineSeparator();
        System.out.println(newLine + "The " + discType + " " + name +
                " is spinning at " + spinRate + "RPM");
    }
}
