package Objt;

public class Cylinder extends Rollable {
    private double height;
    private double radius;
    public Cylinder(double mass, double mu, double[] s0, double[] u, int objectID, int objectTypeID, double radius, double height) {
        super(mass, mu, s0, u, objectID, objectTypeID, radius/2);
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setHeight(double height) {
        this.height = height;
    } 
}
