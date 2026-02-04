package Day3_Locking_the_Car;

public class Lock {
    private int safePin = 1234;
    private String secretDocument = "day 3 of 150: I am becoming a Java Pro";
    public String openSafe (int enteredPin) {
        if (enteredPin == safePin) {
            return "ACCESS GRANTED: " + secretDocument;
        } else {
            return "ACCESS DENIED: Wrong Pin";
        }
    }


}
