package Objt;

public class Cylinder extends Rollable {
    private float height;
    private float radius;
    public Cylinder(float height, float radius) {
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
