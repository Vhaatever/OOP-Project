package Objt;

public class Sphere extends Rollable {
    private double radius;

    public Sphere(double mass, double mu, double[] s0, double[] u, int objectID, int objectTypeID, double radius) 
    {
        super(mass, mu, s0, u, objectID, objectTypeID,radius/2);
        this.radius = radius;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }




}
