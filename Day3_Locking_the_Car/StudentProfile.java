package Day3_Locking_the_Car;

public class StudentProfile {
    private String name; //initializing name//
    private int age; //initializing age to integers//
    private double gpa; //initializing gpa to decimal no//
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public void setAge(int newAge)
    {
        if (newAge >= age) {
            this.age = newAge;
        } else {
            System.out.println("age cannot be negative, setting age to be 0.");
            this.age = 0;
        }
    }
    public void setGpa(double newGpa)
    {
        if (newGpa >= 0.0 && newGpa <= 4.0) {
            this.gpa = newGpa;
        } else {
            System.out.println("Error: GPA " + newGpa + "is invalid. Must be between 0.0 to 4.0");
        }
    }
public void display() {
        System.out.println(name + " | Age: " + age + "|GPA: " + gpa);
}
}