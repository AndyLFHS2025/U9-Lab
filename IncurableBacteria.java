package Unit9_Inheritance.Lab;

public class IncurableBacteria extends Bacterial{
    private int sicknessLen;

    public IncurableBacteria(double survivability, int numCases, int yearDiscovered, String origin, int numSurvived, int numDeaths, double resistant, String name, int sicknessLen) {
        super(survivability, numCases, yearDiscovered, origin, resistant, name, numSurvived, numDeaths);
        this.sicknessLen = sicknessLen;
    }

    public IncurableBacteria(int sicknessLen) {
        this.sicknessLen = sicknessLen;
    }

    public int getSicknessLen() {
        return sicknessLen;
    }

    public void setSicknessLen(int sicknessLen) {
        this.sicknessLen = sicknessLen;
    }

    @Override
    public String toString() {
        return "This bacteria is considered non-curable. The period of sickness is typically " + sicknessLen + " days long.\nIf" +
                " the bacteria lasts longer, death is likely.\n" + super.toString();
    }

    public void kill() {
        System.out.println("A person with a new case of " + getName() + " has died.");
        this.setNumCases(this.getNumCases() + 1);
        this.setNumDeaths(this.getNumDeaths() + 1);
    }
}
