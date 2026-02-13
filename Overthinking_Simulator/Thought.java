package Overthinking_Simulator;

public class Thought
{
        private String rawThought;
        private String feelingInWords; // "numb", "heavy chest", "cant explain";
        private String context;
        private String pattern; // "i spiral for 2 days then it passes"

        // Constructor
        public Thought(String rawThought, String mood, String context, String pattern) {
            this.rawThought = rawThought;
            this.feelingInWords = mood;
            this.context = context;
            this.pattern = pattern;
        }

        // Getters
        public String getRawThought() { return rawThought; }
        public String getFeelingInWords()       { return feelingInWords; }
        public String getContext()    { return context; }
        public String getPattern()    {return pattern;}

        // Just to print it nicely
        @Override
        public String toString() {
            return "Thought: \"" + rawThought + "\" | feelingInWords: " + feelingInWords + " | Context: " + context + " | pattern: " + pattern;
        }
}
