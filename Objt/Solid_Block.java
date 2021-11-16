package Objt;

public class Solid_Block extends NonRollable {
    private double length;
    private double breadth;
    public Solid_Block(double mass, double mu, double[] s0,  double[] u, int objectID, int objectTypeID,double length,double breadth)
    {
        super(mass, mu, s0, u, objectID, objectTypeID, length/2);
        this.setLength(length);
        this.setBreadth(breadth);
    }
    public double getBreadth() {
        return breadth;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

}
