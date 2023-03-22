package U9Lab;

public class CurableBacteria extends Bacterial {
    private String treatmentName;
    private int treatmentLength;

    public CurableBacteria(double survivability, int numCases, int yearDiscovered, String origin, int numSurvived, int numDeaths, double resistant, String name, String treatmentName, int length) {
        super(survivability, numCases, yearDiscovered, origin, resistant, name, numSurvived, numDeaths);
        this.treatmentName = treatmentName;
        this.treatmentLength = length;
    }

    public CurableBacteria(String treatmentName, int treatmentLength) {
        super();
        this.treatmentName = treatmentName;
        this.treatmentLength = treatmentLength;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "\nAntibacterial: " + treatmentName + ", Treatment period length: " + treatmentLength;
        return str;
    }

    public void cure() {
        int time = (int) (Math.random() * (treatmentLength) + 1);
        System.out.println("Someone with a new case of " + getName() + " was cured with " + treatmentName + ". It took " + time + " days to cure.");
        this.setNumCases(this.getNumCases() + 1);
        this.setNumSurvived(this.getNumSurvived() +1);
    }



    public String getTreatmentName() {
        return treatmentName;
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    public int getTreatmentLength() {
        return treatmentLength;
    }

    public void setTreatmentLength(int treatmentLength) {
        this.treatmentLength = treatmentLength;
    }
}
