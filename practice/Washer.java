package practice;

public class Washer extends Appliance {

    private int drumSize;

    public Washer(String brand, int powerWatts, int drumSize) {
        super(brand, powerWatts); //parent constructor
        this.drumSize = drumSize;
    }
    public int getDrumSize() {
        return drumSize;
    }
    
    @Override 
    public void use() {
        System.out.println("Washing clothes in a " + drumSize + "gallon drum.");
    }

    @Override
    public void displayInfo () { 
        System.out.println("Washer Brand: " + brand);
        System.out.println("Power" + powerWatts + "watts");
    }
}
