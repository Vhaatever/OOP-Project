package Objt;

public class Sphere extends Rollable {
    private float radius;

    Sphere(float mass, float mu, float[] s0, float[] u, int objectID, int objectTypeID, float radius) 
    {
        super(mass, mu, s0, u, objectID, objectTypeID);
        this.radius = radius;
    }



    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

}
