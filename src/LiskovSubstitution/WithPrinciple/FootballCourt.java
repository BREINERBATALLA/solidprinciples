package LiskovSubstitution.WithPrinciple;

public class FootballCourt extends Court implements IGrassCourt, IMaintenanceCourt{

    public FootballCourt(double height, double width) {
        super(height, width);
    }

    @Override
    public void cutGrass() {
        System.out.println("Cutting grass");
    }

    @Override
    public void maintenance() {
        cutGrass();
    }
}
