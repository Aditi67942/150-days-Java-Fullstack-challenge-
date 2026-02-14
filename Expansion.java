package Overthinking_Simulator;

public class Expansion
{
    private String trigger;
    private String whatHappened;
    private String pattern;
    public Expansion(String trigger, String whatHappened, String pattern)
    {
        this.trigger = trigger;
        this.whatHappened = whatHappened;
        this.pattern = pattern;
    }
    public String getTrigger() { return trigger; }
    public String getWhatHappened() { return whatHappened; }
    public String getPattern() { return pattern; }
    @Override
    public String toString()
    {
        return "Trigger: \"" + trigger + "| whatHappened: " + whatHappened + " | pattern: " + pattern;
    }

}
