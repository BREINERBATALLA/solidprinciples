package LiskovSubstitution.WithPrinciple;

public class MicroFootballCourt extends Court implements ICourtTile, IMaintenanceCourt{

    public MicroFootballCourt(double height, double width) {
        super(height, width);
    }

    @Override
    public void cleanTile() {
        System.out.println("clean Tile");
    }

    @Override
    public void maintenance() {
        cleanTile();
    }
}
