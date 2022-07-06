package LiskovSubstitution.WithPrinciple;

public class FootballCourt extends Court {

    public FootballCourt(double height, double width) {
        super(height, width);
    }

    @Override
    public void cutGrass() {
        System.out.println("Cutting football's grass");
    }

}
