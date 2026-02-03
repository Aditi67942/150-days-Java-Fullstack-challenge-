package Day2_Normal_Car;

public class Main {
    public static void main(String[] args) {
        Car[] garage = new Car[3];

        garage[0] = new Car("BMW M3");
        garage[1] = new Car("Audi R8");

        // CUSTOMIZATION: We use the ElectricCar constructor here!
        garage[2] = new ElectricCar("Tesla Model S", 100);

        for (int i = 0; i < garage.length; i++) {
            System.out.print("Spot " + i + ": ");
            garage[i].accelerate();
            // When i is 2, Java will automatically use the EV logic!
        }
    }
}