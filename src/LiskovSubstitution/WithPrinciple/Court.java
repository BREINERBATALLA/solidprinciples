package LiskovSubstitution.WithPrinciple;

public abstract class Court {
    protected  double height;
    protected double width;

    public Court(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public abstract void cutGrass();
}
