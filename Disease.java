package Unit9_Inheritance.Lab;

public class Disease {
    private double survivability;
    private int numCases;
    private int yearDiscovered;
    private String origin;
    private String name;
    private int numSurvived;
    private int numDeaths;

    public Disease(double survivability, int numCases, int yearDiscovered, String origin, String name, int numSurvived, int numDeaths) {
        this.survivability = survivability;
        this.numCases = numCases;
        this.yearDiscovered = yearDiscovered;
        this.origin = origin;
        this.name = name;
        this.numSurvived = numSurvived;
        this.numDeaths = numDeaths;
    }
    public Disease() {
        survivability = 0.0;
        numCases = 0;
        yearDiscovered = 0;
        origin = "Unknown";
        numSurvived = 0;
        numDeaths = 0;
    }

    public String toString() {
        String str = "Name: " + name + ", Survivability Rate: " + survivability + ", Cases (worldwide): ";
        str += numCases + ", Discovered in " + yearDiscovered + ", Origin: " + origin;
        return str;
    }

    public void infect(int people) {
        numCases += people;
        System.out.println(people + " people were infected with " + name + ", there are now "
                           + numCases + " of " + name + " in the world.");
    }



    public double getSurvivability() {
        return survivability;
    }

    public void setSurvivability(double survivability) {
        this.survivability = survivability;
    }

    public int getNumCases() {
        return numCases;
    }

    public int getNumSurvived() {
        return numSurvived;
    }

    public void setNumSurvived(int numSurvived) {
        this.numSurvived = numSurvived;
    }

    public int getNumDeaths() {
        return numDeaths;
    }

    public void setNumDeaths(int numDeaths) {
        this.numDeaths = numDeaths;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumCases(int numCases) {
        this.numCases = numCases;
    }

    public int getYearDiscovered() {
        return yearDiscovered;
    }

    public void setYearDiscovered(int yearDiscovered) {
        this.yearDiscovered = yearDiscovered;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
