public class Main {

    public static void main(String[] args) {
        Phone myPhone = new Phone();
        myPhone.brand = "iPhone 15";
        myPhone.batteryLevel = 40;
        myPhone.isFoldable = false;
        myPhone.charge();
        myPhone.checkStatus();
        Pen myBluePen = new Pen("Blue", 100);
        myBluePen.write();
    }
}