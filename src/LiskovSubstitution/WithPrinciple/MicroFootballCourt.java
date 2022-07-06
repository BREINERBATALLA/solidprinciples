package LiskovSubstitution.WithPrinciple;

public class MicroFootballCourt  implements ICourtTile{
    @Override
    public void cleanTile() {
        System.out.println("clean Tile");
    }


}
