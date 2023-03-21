package Unit9_Inheritance.Lab;

public class Driver {
    public static void main(String[] args) {
        Disease vTest = new Viral(.5, 100, 100, "mars", 50, 25, true, "DNA", "your mom");
        Disease bTest = new Bacterial(.5, 100, 100, "june", .5, "your dad", 10, 20);
        Disease ncbTest = new IncurableBacteria(.5, 100, 2022, "Wuhan", 10, 20, 1.00, "Covid", 10);
        Disease cbTest = new CurableBacteria()
    }
}
