public class Pen
{

 String color;
 int inkLevel;
    public Pen(String chosenColor, int startingInk)
    {
        color = chosenColor;
        inkLevel = startingInk;
    }
        void write () {
            if (inkLevel >= 5) {
                System.out.println("writing in" + color + ": " + "This is so much faster!");
                inkLevel -= 5;
            } else {
                System.out.println("Out of ink! Can't write.");
            }
               }
}
