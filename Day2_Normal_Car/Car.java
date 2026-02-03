package Day2_Normal_Car;

public class Car
{
    String model;
    int speed;
    int fuelLevel = 100;
    public Car(String modelName)
    {
        model = modelName;
    }
    void accelerate() {
        if (fuelLevel >= 10) {
            speed += 20;
            fuelLevel -= 10;
            System.out.println(model + " speed: " + speed + " | Fuel: " + fuelLevel + "%");
        } else {
            System.out.println("Out of gas! Refuel " + model);
        }
    }
}
