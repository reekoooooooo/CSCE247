package practice;

public abstract class Appliance {

    protected String brand;
    protected int powerWatts;

    //contructor
    public Appliance(String brand, int powerWatts) {
        this.brand = brand;
        this.powerWatts = powerWatts;
    }
    //concrete method (alr implemented)
    public void turnOn() {
        System.out.println("The appliance is now ON.");
    }

    //abstract methods (must be implemented by children)
    public abstract void use();

    public abstract void displayInfo();

    
}
