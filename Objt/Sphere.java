package Objt;

public class Sphere extends Rollable {
    private float radius;

    Sphere(float mass, float mu, float[] s0, float[] s, float[] u, float[] v, int objectID, int objectTypeID, float[] a, float radius) 
    {
        super(mass, mu, s0, s, u, v, objectID, objectTypeID, a);
        this.radius = radius;
    }
    
    Sphere(float mass, float[] s0, float[] s, float[] u, float[] v, int objectID, int objectTypeID, float[] a, float radius) {
        super(mass, s0, s, u, v, objectID, objectTypeID, a);
        this.radius=radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

}
