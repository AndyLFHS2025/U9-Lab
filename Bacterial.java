package Unit9_Inheritance.Lab;
import java.util.Scanner;

public class Bacterial extends Disease {
    private double resistance;

    public Bacterial(double survivability, int numCases, int yearDiscovered, String origin, double resistant, String name, int numSurvived, int numDeaths) {
        super(survivability, numCases, yearDiscovered, origin, name, numSurvived, numDeaths);
        this.resistance = resistant;
    }

    public Bacterial() {
        super();
        resistance = 0.0;
    }

    public String mutate(double mutFactor) {
        String str;
        this.resistance *= (mutFactor * Math.random());
        if (resistance == 0.0) {
            str = "This strain of bacteria died out.";
        }

        else {
            str = "This bacteria's resistance is now " + (resistance * 100) + "%.";
        }

        return str;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str += "This bacteria has " + (resistance * 100) + "% resistance to antibiotics";
        return str;
    }

//    public void reclassifyBacteria(Bacterial newClass){
//        if(resistance < 50.0) {
//            System.out.println("The bacteria is now considered curable please input the recommended treatment and treatment length\nTreatment Name: ");
//            Scanner input = new Scanner(System.in);
//            String treatment = input.nextLine();
//            System.out.println("Treatment Length: ");
//            int len = input.nextInt();
//            input.nextLine();
//            newClass = new CurableBacteria(getSurvivability(), getNumCases(), getYearDiscovered(), getOrigin(), resistance, getName(), treatment, len);
//
//        }
//        else if(resistance > 50){
//            System.out.println("The bacteria is now considered incurable please input the normal length of the bacterial infection");
//            Scanner input = new Scanner(System.in);
//            int sickTime = input.nextInt();
//            input.nextLine();
//            IncurableBacteria newIncurable = new IncurableBacteria(getSurvivability(), getNumCases(), getYearDiscovered(), getOrigin(), resistance, getName(), sickTime);
//        }
//    }

    public double isResistant() {
        return resistance;
    }

    public void setResistant(double resistant) {
        this.resistance = resistant;
    }

}
