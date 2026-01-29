package practice;

public class ApplianceDriver {

    public static void main(String[] args) {

        Washer washer = new Washer("LG", 1500, 5);
        Microwave microwave = new Microwave("Samsung", 1200, true);

        washer.displayInfo();
        washer.turnOn();
        washer.use();

        System.out.println();

        microwave.displayInfo();
        microwave.turnOn();
        microwave.use();

    }
    
}
