package LiskovSubstitution.WithPrinciple;

public class WinbledonCourt extends Court {

    public WinbledonCourt(double height, double width) {
        super(height, width);
    }

    @Override
    public void cutGrass() {
        System.out.println("Cutting winbledon's glass");
    }

}
