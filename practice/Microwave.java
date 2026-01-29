package practice;

public class Microwave extends Appliance {

    private boolean hasTurntable;

    public Microwave(String brand, int powerWatts, boolean hasTurntable) {
        super(brand, powerWatts);
        this.hasTurntable = hasTurntable;
    }

    public boolean hasTurntable() {
        return hasTurntable;

    }

    @Override
    public void use() {
        System.out.println("Heating food quickly.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Microwave Brand: " + brand);
        System.out.println("Power " + powerWatts + " watts");
    }



    
}
