package LiskovSubstitution.WithPrinciple;

public class WinbledonCourt extends Court implements IGrassCourt, IMaintenanceCourt {

    public WinbledonCourt(double height, double width) {
        super(height, width);
    }

    @Override
    public void cutGrass() {
        System.out.println("Cutting glass");
    }

    @Override
    public void maintenance() {
        cutGrass();
    }
}
