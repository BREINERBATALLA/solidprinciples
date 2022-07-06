package LiskovSubstitution.WithoutPrinciple;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class MicroFootballCourt extends Court{
    @Override
    public void cutGrass() {
        throw new UnsupportedOperationException("This class doesn't have a glass to cut");
    }
}
