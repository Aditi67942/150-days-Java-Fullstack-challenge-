package Day3_Locking_the_Car;

public class Main {
    public static void main(String[] args) {
        Lock mySafe = new Lock();
        System.out.println("---Attempting to open the safe---");
        System.out.println("First try (pin 000): " + mySafe.openSafe(0000));
        System.out.println("Second try (pin 1234): " + mySafe.openSafe(1234));
    }
}