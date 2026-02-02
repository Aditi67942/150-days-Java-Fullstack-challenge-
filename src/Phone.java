public class Phone {
    String brand;
    int batteryLevel;
    boolean isFoldable;
    void checkStatus() {
        System.out.println("Phone Brand: " + brand);
        System.out.println("Battery: " + batteryLevel + "%");
        System.out.println("Is Foldable: " + isFoldable);
    }
void charge() {
        batteryLevel = 40;
        System.out.println(brand + " has been charged to 40!");
}


}
