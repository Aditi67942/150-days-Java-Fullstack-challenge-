package Day3_Locking_the_Car;

public class Student_Main {
    public static void main(String[] args) {
        System.out.println("\n----Testing system security----");
        StudentProfile s1 = new StudentProfile();
        s1.setName("Aditi");
        s1.setAge(-5);
        s1.setGpa(5.5);
        s1.display();
        s1.setGpa(3.9);
        s1.display();
    }
}
