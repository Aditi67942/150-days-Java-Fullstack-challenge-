package Overthinking_Simulator;

public class Main
    //13/02/26 code
{
        public static void main(String[] args) {
            Thought t = new Thought("What if I fail in this life?", "anxious", "exam", "i overthink for 2 days then somehow accept it");
            System.out.println(t);

           //14/02/26 code
           Expansion e = new Expansion(
                   "I can't forget her",
                   "went outside, walked around, felt better",
                   "happens every 2 days, always passes"
           );
        System.out.println(e);
}
}
