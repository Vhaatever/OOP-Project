package Objt;

public class Sphere extends Rollable {
    private float radius;

    public Sphere(float mass, float mu, float[] s0, float[] u, int objectID, int objectTypeID, float radius) 
    {
        super(mass, mu, s0, u, objectID, objectTypeID,radius/2);
        this.radius = radius;
    }



    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }




}
