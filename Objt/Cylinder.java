package Objt;

public class Cylinder extends Rollable {
    private float height;
    private float radius;
    public Cylinder(float mass, float mu, float[] s0, float[] u, int objectID, int objectTypeID, float radius, float height) {
        super(mass, mu, s0, u, objectID, objectTypeID, radius/2);
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
