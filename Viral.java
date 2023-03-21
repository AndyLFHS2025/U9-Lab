package Unit9_Inheritance.Lab;

public class Viral extends Disease {
    private boolean vaccine;
    private String type;


    public Viral(double survivability, int numCases, int yearDiscovered, String origin, int numSurvived, int numDeaths, boolean vaccine, String type, String name) {
        super(survivability, numCases, yearDiscovered, origin, name, numSurvived, numDeaths);
        this.vaccine = vaccine;
        this.type = type;
    }

    public Viral(boolean vaccine, String type) {
        this.vaccine = vaccine;
        this.type = type;
    }

    public void developVaccine(String vaccineName) {//add random values for shots needed and years effective
        vaccine = true;
        System.out.println("This virus now has a effective vaccine in place called " + vaccineName + ".");
        int effectiveLen = (int) (Math.random() * (100 - 1) + 1);
        System.out.println("The vaccine is effective for about " + effectiveLen + " years.");
    }

    @Override
    public String toString() {
        String str = "Virus Type: " + type;
        if (vaccine) {
            str += "\nCurrently, an effective vaccine exists.\n";
        }

        else {
            str += "\nNo current effective vaccine exists.\n";
        }

        str += super.toString();

        return str;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isVaccine() {
        return vaccine;
    }

    public void setVaccine(boolean vaccine) {
        this.vaccine = vaccine;
    }
}


