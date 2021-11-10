package Objt;

public class Cylinder extends Rollable {
    private float height;
    private float radius;
    Cylinder(float mass, float mu, float[] s0, float[] s, float[] u, float[] v, int objectID, int objectTypeID, float[] a, float height, float radius) {
        super(mass, mu, s0, u, objectID, objectTypeID);
        this.height = height;
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }
    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    public void setHeight(float height) {
        this.height = height;
    } 
}
