package U9Lab;

public class Driver {
    public static void main(String[] args) {
        Viral vTest = new Viral(.5, 100, 100, "mars", 50, 25, true, "DNA", "your mom");
        Bacterial bTest = new Bacterial(.5, 100, 100, "june", .5, "your dad", 10, 20);
        IncurableBacteria ncbTest = new IncurableBacteria(.5, 100, 2022, "Wuhan", 10, 20, 1.00, "Covid", 10);
        CurableBacteria cbTest = new CurableBacteria(.5, 10, 2060, "Venus", 10, 20, .25, "your dad", "nuts", 100);

        System.out.println(bTest.mutate(1));

    }
}
