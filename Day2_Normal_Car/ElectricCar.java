package Day2_Normal_Car;
public class ElectricCar extends Car {
    int batteryLevel;

    public ElectricCar(String modelName, int battery) {
        super(modelName);
        this.batteryLevel = battery;
    }
    @Override
    void accelerate() {
        if (batteryLevel >= 10) {
            speed += 30;
            batteryLevel -= 10;
            System.out.println(model + " (EV) Speed: " + speed + " | Battery: " + batteryLevel + "%");
        } else {
            System.out.println("Battery too low!");
        }
    }
    void charge() {
        batteryLevel = 100;
        System.out.println(model + " fully charged to 100%!");
    }
}